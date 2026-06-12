package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.Plan;
import com.nt.service.PlanService;

@Controller
public class PlanController {

    private final PlanService service;

    public PlanController(PlanService service) {
        this.service = service;
    }

    @GetMapping("/plans")
    public String plans(Model model) {
        model.addAttribute("plans", service.getAllPlans());
        model.addAttribute("plan", new Plan());
        return "plans";
    }

    @PostMapping("/plans/save")
    public String save(@ModelAttribute Plan plan) {
        service.save(plan);
        return "redirect:/plans";
    }
}
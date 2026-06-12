package com.nt.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.nt.entity.Recharge;
import com.nt.repository.RechargeRepository;


@Controller
public class RechargeController {

    private final RechargeRepository repo;

    public RechargeController(RechargeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/recharge")
    public String page(Model model) {
        model.addAttribute("history", repo.findAll());
        model.addAttribute("recharge", new Recharge());
        return "recharge";
    }

    @PostMapping("/recharge/save")
    public String save(@ModelAttribute Recharge r) {
        r.setRechargeDate(java.time.LocalDate.now());
        repo.save(r);
        return "redirect:/recharge";
    }
}
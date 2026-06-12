package com.nt.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.nt.repository.PlanRepository;
import com.nt.repository.UserPlanRepository;
import com.nt.repository.UserRepository;

@Controller
public class SubscriptionController {

    private final UserRepository userRepo;
    private final PlanRepository planRepo;
    private final UserPlanRepository userPlanRepo;

    public SubscriptionController(UserRepository userRepo,
                                  PlanRepository planRepo,
                                  UserPlanRepository userPlanRepo) {

        this.userRepo = userRepo;
        this.planRepo = planRepo;
        this.userPlanRepo = userPlanRepo;
    }

    @GetMapping("/subscriptions")
    public String subscriptions(Model model) {

        model.addAttribute("users",
                userRepo.findAll());

        model.addAttribute("plans",
                planRepo.findAll());

        model.addAttribute("subscriptions",
                userPlanRepo.findAll());

        return "subscriptions";
    }
}
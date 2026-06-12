package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.Plan;
import com.nt.repository.PlanRepository;


@Service
public class PlanService {

    private final PlanRepository repository;

    public PlanService(PlanRepository repository) {
        this.repository = repository;
    }

    public List<Plan> getAllPlans() {
        return repository.findAll();
    }

    public Plan save(Plan plan) {
        return repository.save(plan);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
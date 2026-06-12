package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.entity.Admin;
import com.nt.repository.AdminRepository;


@Service
public class AdminService {

    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public Admin findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Admin save(Admin admin) {
        return repository.save(admin);
    }
}
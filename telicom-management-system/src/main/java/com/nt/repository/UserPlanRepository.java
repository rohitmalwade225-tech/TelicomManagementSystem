package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.UserPlan;

public interface UserPlanRepository extends JpaRepository<UserPlan, Long> {

}
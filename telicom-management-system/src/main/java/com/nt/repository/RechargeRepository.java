package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Recharge;


public interface RechargeRepository
        extends JpaRepository<Recharge, Long> {

}
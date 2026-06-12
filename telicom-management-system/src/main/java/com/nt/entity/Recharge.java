package com.nt.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RECHARGE")
public class Recharge {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recharge_seq")
	@SequenceGenerator(
	    name = "recharge_seq",
	    sequenceName = "RECHARGE_SEQ",
	    allocationSize = 1
	)
	@Column(name = "RECHARGE_ID")
	private Long rechargeId;

    private String mobileNumber;

    private Double amount;

    private LocalDate rechargeDate;

    public Long getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(Long rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(LocalDate rechargeDate) {
        this.rechargeDate = rechargeDate;
    }
}
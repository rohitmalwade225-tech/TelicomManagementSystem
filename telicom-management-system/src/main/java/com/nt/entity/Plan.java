package com.nt.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PLANS")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "plan_seq_gen")
    @SequenceGenerator(
            name = "plan_seq_gen",
            sequenceName = "PLAN_SEQ",
            allocationSize = 1)
    @Column(name = "PLAN_ID")
    private Long planId;

    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "VALIDITY")
    private String validity;

    @Column(name = "DATA_LIMIT")
    private String dataLimit;

    public Plan() {
    }

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getDataLimit() {
		return dataLimit;
	}

	public void setDataLimit(String dataLimit) {
		this.dataLimit = dataLimit;
	}

  
}
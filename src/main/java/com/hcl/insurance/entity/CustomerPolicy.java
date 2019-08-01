package com.hcl.insurance.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_policy")
public class CustomerPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_policy_id")
	private Long customerPolicyId;

	@OneToOne
	@JoinColumn(name = "policyId")
	@Column(name = "policy_id")
	private Policy policyId;

	@ManyToOne
	@JoinColumn(name = "customerId")
	@Column(name = "customer_id")
	private Customer customerId;

	@Column(name = "policy_purchase_date")
	private LocalDate policyPurchaseDate;

	@Column(name = "policy_maturity_date")
	private LocalDate policyMaturityDate;

}
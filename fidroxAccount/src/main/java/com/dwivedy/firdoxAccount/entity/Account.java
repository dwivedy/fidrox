package com.dwivedy.firdoxAccount.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Pawan This class is representing the product entity and its necessary
 *         properties .
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long accountId;
	 
	 private String accountType;
	 private Date openDate;
	 @Transient
	 private String openDateString;
	 
	public String getOpenDateString() {
		return openDateString;
	}
	public void setOpenDateString(String openDateString) {
		this.openDateString = openDateString;
	}
	// @OneToOne
//	 private Long customerId;
	 
	 @OneToOne
	 @JoinColumn(name = "customerId", referencedColumnName = "userId")
	 @NotNull
	 private Customer customerId;
	 
	 private String customerName;
	 private String branch;
	 private Character minorIndicator;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Character getMinorIndicator() {
		return minorIndicator;
	}
	public void setMinorIndicator(Character minorIndicator) {
		this.minorIndicator = minorIndicator;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", openDate=" + openDate
				+ ", openDateString=" + openDateString + ", customerName=" + customerName + ", branch=" + branch
				+ ", minorIndicator=" + minorIndicator + "]";
	}
	 
	
	 
	 
	 

}

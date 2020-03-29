package org.mycompany;

public class InvestRpl {
	 private String refId;
	 private String reqTime;
	 private String rplTime;
	 private String idNo;
	 private String epfNo;
	 Investment investment;
	
	 // Getter Methods 
	
	 public String getRefId() {
	  return refId;
	 }
	
	 public String getReqTime() {
	  return reqTime;
	 }
	
	 public String getRplTime() {
	  return rplTime;
	 }
	
	 public String getIdNo() {
	  return idNo;
	 }
	
	 public String getEpfNo() {
	  return epfNo;
	 }
	
	 public Investment getInvestment() {
	  return investment;
	 }
	
	 // Setter Methods 
	
	 public void setRefId(String refId) {
	  this.refId = refId;
	 }
	
	 public void setReqTime(String reqTime) {
	  this.reqTime = reqTime;
	 }
	
	 public void setRplTime(String rplTime) {
	  this.rplTime = rplTime;
	 }
	
	 public void setIdNo(String idNo) {
	  this.idNo = idNo;
	 }
	
	 public void setEpfNo(String epfNo) {
	  this.epfNo = epfNo;
	 }
	
	 public void setInvestment(Investment investment) {
	  this.investment = investment;
	 }

	public class Investment {
		 private String totalCurrentValue;
		 private String totalUnrealisedValue;
		 private String fundName;
		 private String totalInvestment;
		 private String totalUnits;
		 private String unitNav;
		 private String currentValue;
		 private String unrealisedValue;
		 private String unrealisedValuePercentage;

		 // Getter Methods 

		 public String getTotalCurrentValue() {
		  return totalCurrentValue;
		 }

		 public String getTotalUnrealisedValue() {
		  return totalUnrealisedValue;
		 }

		 public String getFundName() {
		  return fundName;
		 }

		 public String getTotalInvestment() {
		  return totalInvestment;
		 }

		 public String getTotalUnits() {
		  return totalUnits;
		 }

		 public String getUnitNav() {
		  return unitNav;
		 }

		 public String getCurrentValue() {
		  return currentValue;
		 }

		 public String getUnrealisedValue() {
		  return unrealisedValue;
		 }

		 public String getUnrealisedValuePercentage() {
		  return unrealisedValuePercentage;
		 }

		 // Setter Methods 

		 public void setTotalCurrentValue(String totalCurrentValue) {
		  this.totalCurrentValue = totalCurrentValue;
		 }

		 public void setTotalUnrealisedValue(String totalUnrealisedValue) {
		  this.totalUnrealisedValue = totalUnrealisedValue;
		 }

		 public void setFundName(String fundName) {
		  this.fundName = fundName;
		 }

		 public void setTotalInvestment(String totalInvestment) {
		  this.totalInvestment = totalInvestment;
		 }

		 public void setTotalUnits(String totalUnits) {
		  this.totalUnits = totalUnits;
		 }

		 public void setUnitNav(String unitNav) {
		  this.unitNav = unitNav;
		 }

		 public void setCurrentValue(String currentValue) {
		  this.currentValue = currentValue;
		 }

		 public void setUnrealisedValue(String unrealisedValue) {
		  this.unrealisedValue = unrealisedValue;
		 }

		 public void setUnrealisedValuePercentage(String unrealisedValuePercentage) {
		  this.unrealisedValuePercentage = unrealisedValuePercentage;
		 }
	}

}

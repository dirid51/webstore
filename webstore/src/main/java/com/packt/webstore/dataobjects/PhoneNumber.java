package com.packt.webstore.dataobjects;

public class PhoneNumber {

	private String countryCode;
	private String areaCode;
	private String regionalCode;
	private String lineNumber;
	private String extension;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getRegionalCode() {
		return regionalCode;
	}
	public void setRegionalCode(String regionalCode) {
		this.regionalCode = regionalCode;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
}

package com.mycompany.ghhrkapp1.dto;

public class CountriesDTO
{
	private String countryId;
	private int regionId;
	private String countryName;
	
	public CountriesDTO(String countryId, int regionId, String countryName) 
	{
		this.countryId = countryId;
		this.regionId = regionId;
		this.countryName = countryName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}

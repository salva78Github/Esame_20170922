package it.polito.tdp.formulaone.model;

public class Season {

	private int year ;
	private String url ;
	
	public Season(int year, String url) {
		super();
		this.year = year;
		this.url = url;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return String.valueOf(this.year);
	}
	
}

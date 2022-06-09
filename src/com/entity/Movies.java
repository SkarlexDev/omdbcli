package com.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movies {

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Year")
	private String year;

	@JsonProperty("imdbID")
	private String imdbID;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Poster")
	private String poster;

	public Movies() {
	}

	public Movies(String title, String year, String imdbID, String type, String poster) {
		this.title = title;
		this.imdbID = imdbID;
		this.type = type;
		this.poster = poster;
		this.year = year;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		if(year.length()>4) {
			this.year = year.replaceAll("\\D", "");
		}else {
			this.year = year;
		}
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", imdbID=" + imdbID + ", type=" + type + ", poster="
				+ poster + "]";
	}

}

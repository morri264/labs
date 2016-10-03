package LabA;
public class Movie {
 	private Integer id;
 private String title;
 	private String category;
 	private String description;
 	private Integer year;
	private String rating;
 	private String origin;
 
 	public Movie() {
 	}
 
 	
 public Movie (String t, String c) {
 		title = t;
 		category = c;
 		
 	}
 	
 	public Integer getId() {
 		return id;
	}

 	public void setId(Integer id) {
 		this.id = id;
 	}
 
 	public String getTitle() {
 		return title;
 	}
 	
 	
 	public String getCategory() {
 		return category;
 	}
 	
 	
 	public void setTitle(String title) {
 		this.title = title;
 	}
 	
 	public Integer getYear() {
 		return year;
 	}
 
 	public void setYear(Integer year) {
 		this.year = year;
 	}
 
 
 	public void setCategory(String category) {
 		this.category = category;
	}
 	
 	public String getDescription() {
 		return description;
 	}
 
 	public void setDescription(String description) {
 		this.description = description;
 	}
 	
 	public String getRating() {
 		return rating;
	}
 
	public void setRating(String rating) {
 		this.rating = rating;
 	}
	public String getOrigin() {
 		return origin;
 	}
 
 	public void setOrigin(String origin) {
	this.origin = origin;
 	}
 
 	@Override
 	public String toString() {
 		return "Movie [id=" + id + ", title=" + title + "]";
 }
 	
 	
 
 }
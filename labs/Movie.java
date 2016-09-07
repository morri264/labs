// Worked with Kyle Morris
package labs;

public class Movie {
	private String title;
	private String category;
	
	
	public Movie(String title, String category){
		this.title = title;
		this.category = category;
	}

	public String getTitle(){
		return this.title;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", category=" + category + "]";
	}

	public String getCategory(){
		return this.category;
	}

}


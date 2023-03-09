package Collection;

public class Movie {
	private String moviename;
	private String darectorname;
	private float movietime;
	private float rating;
	public Movie() 
	{
		
	}
	public Movie(String moviename, String darectorname, int movietime, float rating) {
		super();
		this.moviename = moviename;
		this.darectorname = darectorname;
		this.movietime = movietime;
		this.rating = rating;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDarectorname() {
		return darectorname;
	}
	public void setDarectorname(String darectorname) {
		this.darectorname = darectorname;
	}
	public float getMovietime() {
		return movietime;
	}
	public void setMovietime(float movietime) {
		this.movietime = movietime;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", darectorname=" + darectorname + ", movietime=" + movietime
				+ ", rating=" + rating + "]";
	}
	
	

}

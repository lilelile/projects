package Film.po;

import java.io.Serializable;
import java.util.Set;


public class film implements Serializable {
	private String Film;
	private String Type;
	private String Date;
	private String Seat;
	private String Cost;
	public String getFilm() {
		return Film;
	}
	public void setFilm(String film) {
		Film = film;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getSeat() {
		return Seat;
	}
	public void setSeat(String seat) {
		Seat = seat;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
	
}

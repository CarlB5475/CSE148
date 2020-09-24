package p4;

import p2.Textbook;

public class Course {
	private String number;
	private String title;
	private String description;
	private int credits;
	private Textbook textbook;

	public Course(String number, String title, String description, int credits, Textbook textbook) {
		super();
		this.number = number;
		this.title = title;
		this.description = description;
		this.credits = credits;
		this.textbook = textbook;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", title=" + title + ", description=" + description + ", credits=" + credits
				+ ", textbook=" + textbook + "]";
	}
	
	

}

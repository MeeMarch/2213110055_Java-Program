
public class FictionBook implements Authors, Books {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	static int currentYear = 2023;

	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}

	public void setAuthorName(String name) {
		author_name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTitle() {
		return title;
	}

	public boolean checkFormatName() {
		return !author_name.contains(" ") ? true : false;
	}

	public String getLastName() {
		return author_name.split(" ")[1].toUpperCase();
	}

	public String getFirstName() {
		return author_name.split(" ")[0].toUpperCase();
	}

	public boolean checkEmail() {
		return (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) ? true : false;
	}

	public int totalPublicYear() {
		return currentYear - this.publicYear;
	}

	public String toString() {
		return getTitle() + " write by "+ getLastName().charAt(0)+"."+getFirstName()+" ("
				+this.email+")\nPublished for "+totalPublicYear()+" years.";
	}
}

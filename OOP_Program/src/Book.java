public class Book {
	private String title;
	private float price;
	private int publishyear;
	static int currentYear = 2023;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPublishyear(int year) {
		publishyear = year;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	
	public int getTotalYear() {
		return currentYear - publishyear;
	}
	
	public String toString() {
		return "Title: "+ getTitle()+" published for "+getTotalYear()+" year ("
	+getPrice()+ "baht).";
	}
}

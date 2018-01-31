import java.io.*;

class Author{
	private String name;
	private String email;
	private String gender;

	public String getVal(String name, String email, String gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		return this.name;
	}
}
class Book{
	public String name;
	public double price;
	public Author author;
	public int qty = 0;

	public Book(String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName(){
		return this.name;
	}
	public Author getAuthor(String name1, String email1, String gender1){
		Author newObj = new Author();
		newObj.getVal(name1,email1,gender1);
		return newObj;
	}
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public int getQty(){
		return this.qty;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public String toString(){
		String totString = "Name :" + this.name +" Price :" + this.price +" Qty :"+this.qty;
		return totString;
	}
}
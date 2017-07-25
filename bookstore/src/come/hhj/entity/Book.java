package come.hhj.entity;

import java.sql.Date;

public class Book {

	private int id;
	private String author;
	private String title;
	private double price;
	private Date publishingdatedate;
	private int salesamountint;
	private int storenumberint;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublishingdatedate() {
		return publishingdatedate;
	}
	public void setPublishingdatedate(Date publishingdatedate) {
		this.publishingdatedate = publishingdatedate;
	}
	public int getSalesamountint() {
		return salesamountint;
	}
	public void setSalesamountint(int salesamountint) {
		this.salesamountint = salesamountint;
	}
	public int getStorenumberint() {
		return storenumberint;
	}
	public void setStorenumberint(int storenumberint) {
		this.storenumberint = storenumberint;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", price=" + price
				+ ", publishingdatedate=" + publishingdatedate + ", salesamountint=" + salesamountint
				+ ", storenumberint=" + storenumberint + ", remark=" + remark + "]";
	}
	

}

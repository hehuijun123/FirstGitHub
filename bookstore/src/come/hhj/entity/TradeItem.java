package come.hhj.entity;

public class TradeItem {
	private int itemid;
	private int bookid;
	private int quantity;
	private int tradeid;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "TradeItem [itemid=" + itemid + ", bookid=" + bookid + ", quantity=" + quantity + ", tradeid=" + tradeid
				+ "]";
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTradeid() {
		return tradeid;
	}
	public void setTradeid(int tradeid) {
		this.tradeid = tradeid;
	}

}

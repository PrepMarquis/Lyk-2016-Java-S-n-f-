
public abstract class Purchase extends Customer{
	
	protected String purchaseDate;
	protected String shippingDate;
	protected Integer deliveryLenght;
	protected double totalPayment;
	public double getTotalPayment() {
		return totalPayment;
	}
	
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Integer getDeliveryLenght() {
		return deliveryLenght;
	}
	public void setDeliveryLenght(Integer deliveryLenght) {
		this.deliveryLenght = deliveryLenght;
	}
	
	public Purchase(String purchaseDate, String shippingDate, Integer deliveryLenght) {
		{
	}
	
	this.purchaseDate=purchaseDate;
	this.shippingDate=shippingDate;
	this.deliveryLenght=deliveryLenght;
	
	

}
	@Override
	public String toString() {
		return "Purchase [purchaseDate=" + purchaseDate + ", shippingDate=" + shippingDate + ", deliveryLenght="
				+ deliveryLenght + ", getPurchaseDate()=" + getPurchaseDate() + ", getShippingDate()="
				+ getShippingDate() + ", getDeliveryLenght()=" + getDeliveryLenght() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}


public abstract class HardCopyBook extends BookTestSuper{
	
	protected Integer Weight;
	protected Integer shippingCost;
	
	public Integer getWeight() {
		return Weight;
	}
	private void HardCopyBook(Integer weight, Integer shippingCost) {
		public HardCopyBook() {
		super(name,author,bookID,price);
		
		
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}
	public Integer getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(Integer shippingCost) {
		this.shippingCost = shippingCost;
	}
	@Override
	public String toString() {
		return "HardCopyBook [Weight=" + Weight + ", shippingCost=" + shippingCost + ", getWeight()=" + getWeight()
				+ ", getShippingCost()=" + getShippingCost() + ", getPrice()=" + getPrice() + ", getName()=" + getName()
				+ ", getAuthor()=" + getAuthor() + ", getBookID()=" + getBookID() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}

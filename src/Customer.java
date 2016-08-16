import java.util.Arrays;

public class Customer {
	
	protected String userName;
	protected String userSurname;
	protected Integer purchaseCount;
	protected boolean placePurchase;
	protected double getTotalAmountSpent;
	
	boolean loop=true;
	
	
	
	public Customer(String userName, String userSurname, Integer purchaseCount, boolean placePurchase, double getTotalAmountSpent);
public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", userSurname=" + userSurname + ", purchaseCount=" + purchaseCount
				+ ", placePurchase=" + placePurchase + ", getTotalAmountSpent=" + getTotalAmountSpent + ", loop=" + loop
				+ ", satýnkayýt=" + Arrays.toString(satýnkayýt) + "]";
	}

	
	String[]satýnkayýt = new String[]{"","","","","","",""};
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String[] getSatýnkayýt() {
		return satýnkayýt;
	}

	public void setSatýnkayýt(String[] satýnkayýt) {
		this.satýnkayýt = satýnkayýt;
	}

	
}

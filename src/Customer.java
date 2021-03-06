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
				+ ", satınkayıt=" + Arrays.toString(satınkayıt) + "]";
	}

	
	String[]satınkayıt = new String[]{"","","","","","",""};
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String[] getSatınkayıt() {
		return satınkayıt;
	}

	public void setSatınkayıt(String[] satınkayıt) {
		this.satınkayıt = satınkayıt;
	}

	
}

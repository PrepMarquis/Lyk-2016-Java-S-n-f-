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
				+ ", sat�nkay�t=" + Arrays.toString(sat�nkay�t) + "]";
	}

	
	String[]sat�nkay�t = new String[]{"","","","","","",""};
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String[] getSat�nkay�t() {
		return sat�nkay�t;
	}

	public void setSat�nkay�t(String[] sat�nkay�t) {
		this.sat�nkay�t = sat�nkay�t;
	}

	
}

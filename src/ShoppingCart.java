import java.util.Arrays;

public abstract class ShoppingCart extends Customer {

	public ShoppingCart(String userName, String userSurname, Integer purchaseCount, boolean placePurchase,
			double getTotalAmountSpent) {
		super(userName, userSurname, purchaseCount, placePurchase, getTotalAmountSpent);
		
		Book[] Contents = new Book[]{"", "", "", "","", ""};
				
				protected Integer numEntriesInCartConstructor;
		        boolean addBook;
		        boolean removeLastBook;
		        
	}

	@Override
	public String toString() {
		return "ShoppingCart [userName=" + userName + ", userSurname=" + userSurname + ", purchaseCount="
				+ purchaseCount + ", placePurchase=" + placePurchase + ", getTotalAmountSpent=" + getTotalAmountSpent
				+ ", loop=" + loop + ", satýnkayýt=" + Arrays.toString(satýnkayýt) + ", getUserName()=" + getUserName()
				+ ", toString()=" + super.toString() + ", getUserSurname()=" + getUserSurname() + ", getSatýnkayýt()="
				+ Arrays.toString(getSatýnkayýt()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void addBook(Book b1) 
		public void addBook1(Book b2) 
			public void addBook2(Book b3) 
				public void addBook3(Book b4) 
					public void addBook4(Book b5) {
				}
			}
		}
		
		
	}

}

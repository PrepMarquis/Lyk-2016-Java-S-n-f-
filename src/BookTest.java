
public class BookTest extends BookTestSuper{
	
	public class TestBookShop {

	    public void main(String[] args){

			ShoppingCart cart = new ShoppingCart();

			Book b1 = new Book("Ah'lar A�ac�", "Didem Madak", 20.0, "3418793409");

			HardCopyBook b2 = new HardCopyBook("Sevdad�r", "Arkada� Zekai �zger" ,80.0, "3418793410", 34.0, 10.0);
			HardCopyBook b3 = new HardCopyBook("Burada G�m�l�d�r", "Ahmet Erhan" ,70.0, "3418793411", 42.0, 10.0);

			EBook b4 = new EBook("Hasretinden Prangalar Eskittim", "Ahmed Arif" ,30.0, "3418793412", 3000.0, "mobi");
			b4.addDevice();
			EBook b5 = new EBook("Matematik ve Develerle E�ekler", "Ali Nesin", 40.0, "3418793413", 2000.0, "epub");

			cart.addBook(b1);
			cart.addBook(b2);
			cart.addBook(b3);
			cart.addBook(b4);
			cart.addBook(b5);

			System.out.println(cart.toString());

	        Customer customer = new Customer("Ekim", "Akbay", null, false, 0);
	        HardCopyBook hcb1 = new HardCopyBook("S�r�a Fanus", "Sylvia Plath", 25, "3418793410", 34.0, 10.0);
	        HardCopyBook hcb2 = new HardCopyBook("Yabanc�","Albert Camus" ,20.0, "3418793411", 42.0, 10.0);
	        HardCopyBook hcb3 = new HardCopyBook("M�lkiyet Nedir?","Pierre Joseph Proudhon" ,80.0, "3418793410", 34.0, 10.0);
	        HardCopyBook hcb4 = new HardCopyBook("Bulant�","Jean-Paul Sartre" ,30.0, "3418793411", 42.0, 10.0);

	        Purchase Purchase1 = new Purchase("10/08/2016", "13/08/2016", 5);
	        Purchase1.addBook(hcb1);
	        Purchase1.addBook(hcb2);
	        Purchase1.addBook(hcb3);
	        Purchase1.addBook(hcb4);
	        customer.placePurchase(Purchase1);

	        System.out.println(customer);

	        EBook e1 = new EBook("Kalemimin Sap�n� G�lle Donatt�m", "Ferhan �ensoy", 75.0, "3418793412", 200, "epub");
	        EBook e2 = new EBook("�irince Meydan Muharebelerinin Mufassal Tarih�esi","Sevan Ni�anyan" ,125.0, "3418793412", 150, "epub");
	        EBook e3 = new EBook("Mum Hala","Aziz Nesin" ,50.0, "3418793412", 250, "epub");

	        Purchase Purchase2 = new Purchase("17/02/2016", "19/02/2016", 5);
	        Purchase2.addBook(e1);
	        Purchase2.addBook(e2);
	        Purchase2.addBook(e3);
	        customer.placePurchase(Purchase2);

	        System.out.println(customer);


	        Book a1 = new Book("Dublinliler","James Joyce" ,20.0, "3418793409");
	        Purchase Purchase3 = new Purchase("17/02/2016", "19/02/2016", 5);
	        Purchase3.addBook(a1);
	        customer.placePurchase(Purchase3);

	    }


	}

}

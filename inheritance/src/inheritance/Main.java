package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="789456";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="5555";
		
		CustomerManager customerManager =new CustomerManager();
		
		Customer [] customers = {engin,abc,hepsiburada};
		
		customerManager.addMultiple(customers);
		
		


	}

}

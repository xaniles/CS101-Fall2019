
public class PhoneBook {
	public static void main(String args[]) {
	
		PhoneBookEntry FirstObject = new PhoneBookEntry(5, "John", "Smith", "jsmith@gmail.edu", 20037, 2023334444);
		PhoneBookEntry SecondObject = new PhoneBookEntry("James", 202344344, 0);
		FirstObject.setPhonenum(202555555);
		FirstObject.PrintBookEntry();
		SecondObject.setZipcode(FirstObject.getZipcode());

	}
}

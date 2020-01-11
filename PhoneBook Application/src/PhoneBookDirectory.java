import java.util.Scanner;
public class PhoneBookDirectory {
	
	private PhoneBookEntry[] book;
	
	public PhoneBookDirectory() {
		book = new PhoneBookEntry[6];
	}
	
	public int addEntry(PhoneBookEntry entry) {

		int index = -1;
		int return_value = 0;
		
		for(int i = 0; i < 6; i++) {
			if(book[i]==null || book[i].getId()==0) {
				if (index == -1) index = i;
			}
			
			if (book[i] != null && book[i].getId() == entry.getId()) {
				return 0;
			}
		}
		
		if(index == -1) {
			return_value = 0;
		} else {
			book[index] = entry;
			return_value = 1;
		}
		return return_value;
	}
	
	public void print() {
		for(int i=0; i<6; i++) {
			book[i].PrintBookEntry();
		}
	}
	
	public int LinearSearchByPhoneNumber(int PhoneNumber) {
		
		int return_value = 0;
		for(int i=0; i<6; i++) {
			if(book[i] != null && book[i].getPhonenum()==PhoneNumber) {
				return_value = 1;
			}
		}
		return return_value;	
	}
	
	public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		
		int low = 0;
		int high = 5;
		while(high >= low) {
			int mid = (low + high) / 2;
			if (book[mid] == null) {
				high = mid - 1;
			}
			else if(id < book[mid].getId())
				high = mid-1;
			else if(id==book[mid].getId())
				return book[mid];
			else
				low = mid+1;
		}
		return null;
	}
	
	public void SortByid() {
		for(int i = 0; i < book.length-1; i++) {
			int minidx = i;
			for(int j = i + 1; j < book.length; j++) {
				if (book[j] == null) continue;
				else if(book[j].compareTo(book[minidx]) == -1) 
					minidx = j;				
			}
			PhoneBookEntry temp = book[minidx];
			book[minidx] = book[i];
			book[i] = temp;
		}
	}
	
	public int Edit(String firstName, String lastName, Scanner input) {
		
		int return_value = 0;
	
		for(int i = 0; i < 6; i++) {
			if (book[i] == null) {
				continue;
			} else if(book[i].getFirstname().equals(firstName) && book[i].getLastname().equals(lastName)) {
				System.out.println("1. id");
				System.out.println("2. first name");
				System.out.println("3. last name");
				System.out.println("4. email");
				System.out.println("5. zipcode");
				System.out.println("6. phone number");
				System.out.println("Which attribute do you want to edit?");
				int answer = input.nextInt();
				
				switch(answer) {
				case 1:
					System.out.println("Enter the id: ");
					int id = input.nextInt();
					book[i].setId(id);
					break;
				case 2:
					System.out.println("Enter first name: ");
					String firstname = input.next();
					book[i].setFirstname(firstname);
					break;
				case 3:
					System.out.println("Enter last name: ");
					String lastname = input.next();
					book[i].setLastname(lastname);
					break;
				case 4:
					System.out.println("Enter the email: ");
					String email = input.next();
					book[i].setEmail(email);
					break;
				case 5:
					System.out.println("Enter the zipcode: ");
					int zipcode = input.nextInt();
					book[i].setZipcode(zipcode);
					break;
				case 6:
					System.out.println("Enter the phone number: ");
					int phonenum = input.nextInt();
					book[i].setPhonenum(phonenum);
					break;
				}
				
				return_value = 1;
			}
		}
		
		return return_value;	
	}
	
	public int DeleteEntry(int id) {
		
		int return_value = 1;
		
		for(int i=0; i<6; i++) {
			if(book[i] != null && book[i].getId()==id) {
				book[i] = null;
				return_value = 0;
				break;
			}
		}
		return return_value;
	}
}

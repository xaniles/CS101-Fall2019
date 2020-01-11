import java.util.Scanner;

public class User {
	
	protected String username;
	protected int password;
	PhoneBookDirectory mybook = new PhoneBookDirectory();
	private Scanner input;
	
	public User() {
		
	}
	
	public User(Scanner input) {
		this.input = input;
	}
	
	public void PrintUserInfo() {
		System.out.println(username);
		System.out.println(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public Scanner getScanner() {
		return input;
	}

}

class PhoneBookAdmin extends User implements User1 {
	
	private String email;
	
	public PhoneBookAdmin(String username, int password, String email, Scanner input) {
		super(input);
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int addEntry(PhoneBookEntry entry) {
		return mybook.addEntry(entry);
	}
	
	public int editEntry(String firstName, String lastName) {
		return mybook.Edit(firstName, lastName, getScanner());
	}
	
	public int delete(int id) {
		return mybook.DeleteEntry(id);
	}
	
	public void sort() {
		mybook.SortByid();
	}
	
	public int linearsearch(int PhoneNumber) {
		return mybook.LinearSearchByPhoneNumber(PhoneNumber);
		
	}
	
	public PhoneBookEntry binarysearch(int id) {
		return mybook.SearchbyIdBinarySearch(id);
	}
	
	public void changePassword(int password) {
		this.setPassword(password);
	}
	
	public void changeUsername(String username) {
		this.setUsername(username);
	}
	
	public void PrintUserInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
	}

}
	
class NormalUser extends User implements User2 {
	
	private int id;
	
	public NormalUser(String username, int password, int id, Scanner input) {
		super(input);
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int addEntry(PhoneBookEntry entry) {
		return mybook.addEntry(entry);
	}
	
	public int editEntry(String firstName, String lastName) {
		return mybook.Edit(firstName, lastName, getScanner());
	}
	
	public void sort() {
		mybook.SortByid();
	}
	
	public int linearsearch(int PhoneNumber) {
		return mybook.LinearSearchByPhoneNumber(PhoneNumber);
		
	}
	
	public void PrintUserInfo() {
		System.out.println(id);
		System.out.println(username);
		System.out.println(password);
	}
}

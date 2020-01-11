
public interface User1 {
	
	public String getEmail();
	
	public void setEmail(String email);
	
	public int addEntry(PhoneBookEntry entry);
	
	public int editEntry(String firstName, String lastName);
	
	public int delete(int id);
	
	public void sort();
	
	public int linearsearch(int PhoneNumber);
	
	public PhoneBookEntry binarysearch(int id);
	
	public void changePassword(int password);
	
	public void changeUsername(String username);
	
	public void PrintUserInfo();

}

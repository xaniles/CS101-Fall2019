
public class PhoneBookEntry {
	
	private int id = -1;
	private String firstname;
	private String lastname;
	private String email;
	private int zipcode;
	private int phonenum;
	
	public PhoneBookEntry() {
		
	}
	
	public PhoneBookEntry(int id, String firstname, String lastname, String email, int zipcode, int phonenum) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.zipcode = zipcode;
		this.phonenum = phonenum;
	}
	
	public PhoneBookEntry(String firstname, int phonenum) {
		this.firstname = firstname;
		this.phonenum = phonenum;
	}
	
	public PhoneBookEntry(String firstname, int phonenum, int zipcode) {
		this.firstname = firstname;
		this.phonenum = phonenum;
		this.zipcode = zipcode;
	}
	
	public PhoneBookEntry(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	public int compareTo(Object per) {
		if (per == null) {
			return -1;
		}
		
		PhoneBookEntry p = new PhoneBookEntry();
		p = (PhoneBookEntry) per;
		
		if(this.id == p.id)
			return 0;
		else if(this.id > p.id)
			return 1;
		else
			return -1;
	}
	
	public void PrintBookEntry() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + firstname + " " + lastname);
		System.out.println("Email: " + email);
		System.out.println("Zip Code: " + zipcode);
		System.out.println("Phone Number: " + phonenum);
	}

}

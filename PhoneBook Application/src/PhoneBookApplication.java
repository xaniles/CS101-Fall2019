import java.util.Scanner;
import java.io.File;

public class PhoneBookApplication {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		PhoneBookAdmin user1 = new PhoneBookAdmin(null, 0, null, input);
		NormalUser user2 = new NormalUser(null, 0, 0, input);
		
		try {
			File file = new File("/Users/xaniles/eclipse-workspace/SelinaXi_Homework_7/src/admin.txt");
			Scanner fileReader = new Scanner(file);
	
			String line = fileReader.nextLine();
			String[] attrs = line.split(",");
			String name = attrs[0].trim();
			int pwd = Integer.parseInt(attrs[1].trim());
				
			user1.setUsername(name);
			user1.setPassword(pwd);
			fileReader.close();
			
			file = new File("/Users/xaniles/eclipse-workspace/SelinaXi_Homework_7/src/nomal.txt");
			fileReader = new Scanner(file);
			
			line = fileReader.nextLine();
			attrs = line.split(",");
			name = attrs[1].trim();
			pwd = Integer.parseInt(attrs[2].trim());
			
			user2.setUsername(name);
			user2.setPassword(pwd);
			
			fileReader.close();
		} catch (Exception e) {
			System.out.println("File does not exist.");
		}
		
		
		
		System.out.println("Welcome.");
		System.out.println("Enter the username: ");
		String username = input.next();
		System.out.println("Enter the password: ");
		int password = input.nextInt();
		
		if(user1.getUsername().equals(username) && user1.getPassword()==password) {
			int answer;
			do {
				input = new Scanner(System.in);
				System.out.println("1. Add a phone entry.");
				System.out.println("2. Edit an entry.");
				System.out.println("3. Delete an entry.");
				System.out.println("4. Sort the PhoneBookDirectory.");
				System.out.println("5. Search using Linear Search.");
				System.out.println("6. Search using Binary Search.");
				System.out.println("7. Print the Admin's info.");
				System.out.println("8. Change password.");
				System.out.println("9. Change username.");
				System.out.println("10. Exit.");
				System.out.println("Enter the number: ");
				answer = input.nextInt();
			
				switch(answer) {
				case 1:
					PhoneBookEntry entry = new PhoneBookEntry();
					System.out.println("Enter id: ");
					int id = input.nextInt();
					System.out.println("Enter first name: ");
					String firstname = input.next();
					System.out.println("Enter last name: ");
					String lastname = input.next();
					System.out.println("Enter email: ");
					String email = input.next();
					System.out.println("Enter zipcode: ");
					int zipcode = input.nextInt();
					System.out.println("Enter phone number: ");
					int phonenum = input.nextInt();
					entry.setId(id);
					entry.setFirstname(firstname);
					entry.setLastname(lastname);
					entry.setEmail(email);
					entry.setZipcode(zipcode);
					entry.setPhonenum(phonenum);
					user1.addEntry(entry);
					break;
				case 2:
					System.out.println("Enter the first name: ");
					String firstName = input.next();
					System.out.println("Enter the last name: ");
					String lastName = input.next();
					user1.editEntry(firstName, lastName);
					break;
				case 3:
					System.out.println("Enter the id: ");
					id = input.nextInt();
					user1.delete(id);
					break;
				case 4:
					user1.sort();
					break;
				case 5:
					System.out.println("Enter the phone number: ");
					int PhoneNumber = input.nextInt();
					System.out.println(user1.linearsearch(PhoneNumber));
					break;
				case 6:
					System.out.println("Enter the id: ");
					id = input.nextInt();
					System.out.println(user1.binarysearch(id));
					break;
				case 7:
					user1.PrintUserInfo();
					break;
				case 8:
					System.out.println("Enter the new password: ");
					int pwd = input.nextInt();
					user1.setPassword(pwd);
					break;
				case 9:
					System.out.println("Enter the new username: ");
					String username2 = input.next();
					user1.setUsername(username2);
					break;
				}
				
			} while(answer!=10);
			
		} else if(user2.getUsername().equals(username) && user2.getPassword()==password) {
			int answer2;
			do {	
				System.out.println("1. Add a phone entry.");
				System.out.println("2. Edit an entry.");
				System.out.println("3. Sort the PhoneBookDirectory.");
				System.out.println("4. Search using Linear Search.");
				System.out.println("5. Print the Normal's info.");
				System.out.println("6. Exit.");
				System.out.println("Enter the number: ");
				answer2 = input.nextInt();
			
				switch(answer2) {
				case 1:
					PhoneBookEntry entry = new PhoneBookEntry();
					System.out.println("Enter id: ");
					int id = input.nextInt();
					System.out.println("Enter first name: ");
					String firstname = input.next();
					System.out.println("Enter last name: ");
					String lastname = input.next();
					System.out.println("Enter email: ");
					String email = input.next();
					System.out.println("Enter zipcode: ");
					int zipcode = input.nextInt();
					System.out.println("Enter phone number: ");
					int phonenum = input.nextInt();
					entry.setId(id);
					entry.setFirstname(firstname);
					entry.setLastname(lastname);
					entry.setEmail(email);
					entry.setZipcode(zipcode);
					entry.setPhonenum(phonenum);
					user2.addEntry(entry);
					break;
				case 2:
					System.out.println("Enter the first name: ");
					String firstName = input.next();
					System.out.println("Enter the last name: ");
					String lastName = input.next();
					user2.editEntry(firstName, lastName);
					break;
				case 3:
					user2.sort();
					break;
				case 4:
					System.out.println("Enter the phone number: ");
					int PhoneNumber = input.nextInt();
					System.out.println(user2.linearsearch(PhoneNumber));
					break;
				case 5:
					user2.PrintUserInfo();
					break;
				}
			
			} while(answer2!=6);
		} else {
			System.out.println("User does not exist.");
		}
		
		input.close();
	
	}
}

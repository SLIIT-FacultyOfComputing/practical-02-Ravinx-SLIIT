import java.util.Scanner;

public class question1_part4 {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String firstname = keyinput.nextLine();

		System.out.println("Enter your Middle Name:");
		String middlename = keyinput.nextLine();
		
		System.out.println("Enter your Last Name:");
		String lastname = keyinput.nextLine();
		
		String concatedFullname = (lastname+", "+middlename+" "+firstname);
		
    		String trimmedFullname = concatedFullname.trim();
    		
    		String[] parts1 = trimmedFullname.split(" ");
    		
    		String[] parts2 = trimmedFullname.split(",");
		
		System.out.printf("\nYour Full Name: %s\n", concatedFullname);
		System.out.printf("\nYour First Name: %s\n", parts1[2]);
		System.out.printf("\nYour Middle Name: %s\n", parts1[1]);
		System.out.printf("\nYour Last Name: %s\n", parts2[0]);
		
		keyinput.close();
	}
}

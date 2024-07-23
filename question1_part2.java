import java.util.Scanner;

public class question1_part2 {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String firstname = keyinput.nextLine();

		System.out.println("Enter your Middle Name:");
		String middlename = keyinput.nextLine();
		
		System.out.println("Enter your Last Name:");
		String lastname = keyinput.nextLine();
		
		String concatedFullname = (firstname+" "+middlename+" "+lastname);
		
		System.out.printf("\nYour Full Name: %s\n", concatedFullname);
		
		System.out.println("\nEnter your Full Name Again to verify:");
		String fullname = keyinput.nextLine();
		
		if (fullname.equalsIgnoreCase(concatedFullname)){
			System.out.println("\nYou Entered Your Full Name Successfully.\n");
			System.out.printf("Welcome %s !!!\n\n", fullname);
		} else {
			System.out.println("\nYour Entered Your Full Name Incorrectly\n");
			System.out.println("\nTry Again !\n\n");
		}
		
		keyinput.close();
	}
}

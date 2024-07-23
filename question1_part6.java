import java.util.Scanner;

public class question1_part6 {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String firstname = keyinput.nextLine();

		System.out.println("Enter your Middle Name:");
		String middlename = keyinput.nextLine();

		System.out.println("Enter your Last Name:");
		String lastname = keyinput.nextLine();

		String concatedFullname = (firstname + " " + middlename + " " + lastname);

		String trimmedFullname = concatedFullname.trim();

		int condition = 0;

		do {

			if (condition) {
				
			}

		} while (condition == 0);

		System.out.printf("\nYour Full Name: %s\n", concatedFullname);
		System.out.printf("\nYour Full Name Vowels Count: %d\n", result);

		keyinput.close();
	}
}

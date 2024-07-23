import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String firstname = keyinput.nextLine();

		System.out.println("Enter your Middle Name:");
		String middlename = keyinput.nextLine();
		
		System.out.println("Enter your Last Name:");
		String lastname = keyinput.nextLine();

		System.out.printf("\nWelcome %s \n", firstname+" "+lastname+" "+middlename);

		keyinput.close();
	}
}

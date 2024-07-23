import java.util.Scanner;

public class question1_part3 {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String firstname = keyinput.nextLine();

		System.out.println("Enter your Middle Name:");
		String middlename = keyinput.nextLine();
		
		System.out.println("Enter your Last Name:");
		String lastname = keyinput.nextLine();
		
		String concatedFullname = (lastname+" "+middlename+" "+firstname);
		
		String modifiedFullname = concatedFullname.replace("a", "@").replace("e", "3");
		
		String uppercasedFullname = modifiedFullname.toUpperCase();
		
		System.out.printf("\nYour Full Name: %s\n", uppercasedFullname);
		
		keyinput.close();
	}
}

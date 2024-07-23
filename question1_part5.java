import java.util.Scanner;

public class question1_part5 {
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);

		System.out.println("Enter your a text with leading and trailing spaces:");
		String text = keyinput.nextLine();
		
    		String trimmedText = text.trim();
		
		System.out.printf("\nYour Trimmed Text: %s\n", trimmedText);
		
		keyinput.close();
	}
}

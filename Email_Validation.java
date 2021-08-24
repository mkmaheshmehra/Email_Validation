package training.simplilearn.assignment_2;
import java.util.Scanner;

public class Email_Validation {
	public boolean isValid(String email) {
		String [] list = new String[] {"email1@gmail.com", "email2@gmail.com",
				"email3@gmail.com","email4@gmail.com","email5@gmail.com","email6@gmail.com",
				"email7@gmail.com","email8@gmail.com","email9@gmail.com","email10@gmail.com"};
		boolean status = true;
		int sizeOfList = list.length;
		for(int i = 0; i < sizeOfList; i++) {
			if(list[i].equals(email)) {
				status = true;
				break;
			}
			else
				status = false;
		}
		return status;
	}
	
	public static void main(String[] args) {
		Email_Validation email_validation = new Email_Validation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your email !");
		String email = scanner.next();
		boolean isValid = email_validation.isValid(email);
		if(isValid)
			System.out.println("Email is valid !");
		else
			System.out.println("Email is not valid please try again !");
		scanner.close();
	}
}

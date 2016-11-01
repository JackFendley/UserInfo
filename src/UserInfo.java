import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class UserInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**

		 *

		 * Name: Jack Fendley

		 * Teacher: Mr. Hardman

		 * Assignment #3 Program #2

		 * Date Last Modified:October 27th,2016

		 *
		 */
		
		
		Scanner userInput = new Scanner(System.in);
		String userName;
		String userLastName;
		int userGrade;
		int studentID;
		String userLogin;
		double Average;
		
		
		System.out.print("First name: ");
		userName = userInput.nextLine();
		
		System.out.print("Last name: ");
		userLastName = userInput.nextLine();
		
		System.out.print("Grade: ");
		userGrade = userInput.nextInt();
		
		System.out.print("Student ID: ");
		studentID = userInput.nextInt();
		
		System.out.print("Login: ");
		userLogin = userInput.next();
		
		System.out.print("School Average: ");
		Average = userInput.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Your Information: ");
		System.out.println(String.format("%-10s" + userLogin, "Login: ") );
		System.out.println(String.format("%-10s" + studentID, "ID: ") );
		System.out.println(String.format("%-10s" + (userLastName) + (", ") + (userName), "Name ") );
		System.out.println(String.format("%-10s" + Average, "Average: ") );
		System.out.println(String.format("%-10s" + userGrade, "Grade: ") );
		
		userInput.close();
		
		
		
	}

}

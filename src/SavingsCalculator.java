
import java.util.*;

import com.sqa.ms.*;

/**
 *   File Name: calc.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

/**
 * calc //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SavingsCalculator {

	private static Object endBalance;
	static String input;
	static double interest;
	static double monthlyPayment;
	static double savingUser;
	static Scanner scanner = new Scanner(System.in);
	static double termYears;
	/**
	 * @param args
	 */
	static String userName;

	// Calculate Yearly Total
	// public static double calculateCumulativeTotalCompoundedMonthly(double
	// savingUser, double monthlyPayment,
	// double interest, int totalTermInMonths) {
	// double balance = baseAmount;
	// int curYear = 1;
	// for (int curTermInMonthsForPeriod = 1; curTermInMonthsForPeriod <=
	// totalTermInMonths; curTermInMonthsForPeriod++) {
	// balance += calcInterestAndDepositsPerPeriod(balance, 100, 6.5, 12);
	// if (curTermInMonthsForPeriod % 12 == 0) {
	// System.out.println(String.format("Year %d: $%,.2f", curYear, balance));
	// curYear++;
	// }
	// }
	// return balance;
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeUserToApp();
		requestingUserValues();
		calculation();
		displaySavingsInfo();
		farewell();
	}

	private static void calculation() {
		// double monthlyInterest = (interest / 100) / 12;
		// System.out.println("your monthly interest is" + monthlyInterest);
		//
		// double savingsExtraPerMonth = (savingUser * monthlyInterest) +
		// monthlyPayment;
		// System.out.println("your saving is" + savingsExtraPerMonth);
		endBalance = SavingsCalculatorHelper.calculateCumulativeTotalCompoundedMonthly(savingUser, monthlyPayment,
				interest, (int) (termYears * 12));
	}

	/**
	 *
	 */
	private static void displaySavingsInfo() {
		// TODO Auto-generated method stub
		String output = String.format("Your end balance would be $%,.2f in %d years.", endBalance, (int) termYears);
		System.out.println(output);

	}

	private static void farewell() {
		System.out.println("bye ," + userName);
	}

	private static void requestingUserValues() {
		System.out.println(userName + ", what are you monthly set payments are? (ex: 10000)");
		input = scanner.nextLine();
		monthlyPayment = Double.parseDouble(input);

		System.out.println(userName + ", what are you the compounded interest rate (ex: 6.5)? ");
		input = scanner.nextLine();
		interest = Double.parseDouble(input);

		System.out.println(userName + ", what are you term in years (10)? ");
		input = scanner.nextLine();
		termYears = Double.parseDouble(input);
	}

	private static void welcomeUserToApp() {
		System.out.println("Welcome user to app:\n----------------------");

		System.out.println("what's your name");
		userName = scanner.nextLine();
		System.out.println("what's your initial saving?");
		input = scanner.nextLine();
		savingUser = Double.parseDouble(input);
	}

	// private static void yearlyCalc() {
	// for (int i = 0; i == termYears; i++) {
	//
	// }
	//
	// }

}

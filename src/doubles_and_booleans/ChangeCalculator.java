package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickelString = JOptionPane.showInputDialog(null, "How many nickels do you have? I must know how much money I will have by the time I steal all of your nickels... ･｡ﾟ[̲̅$̲̅(̲̅ ° ͜ ʖ ° )̲̅$̲̅]｡ﾟ.*");
		// Convert their answer to an bell using Integer.parseInt()
int nickelInt=Integer.parseInt(nickelString);
		// Ask the user how many dimes they have, and convert their answer
String dimeString = JOptionPane.showInputDialog(null, "How many dimes do you have? I must know how much money I will have by the time I steal all of your dimes... ･｡ﾟ[̲̅$̲̅(̲̅ ° ͜ ʖ ° )̲̅$̲̅]｡ﾟ.*");
int dimeInt = Integer.parseInt(dimeString);
		// Ask the user how many quarters they have, and convert their answer
String quarterString = JOptionPane.showInputDialog(null, "How many quarters do you have? I must know how much money I will have by the time I steal all of your quarters... ･｡ﾟ[̲̅$̲̅(̲̅ ° ͜ ʖ ° )̲̅$̲̅]｡ﾟ.*");
int quarterInt = Integer.parseInt(quarterString);
		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
double totalBalance = nickelInt*0.05+dimeInt*0.10+quarterInt*0.25;
System.out.println(totalBalance);

	}
}


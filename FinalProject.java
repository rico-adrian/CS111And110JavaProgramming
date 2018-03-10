//import statements
import java.util.*;
import java.io.*;
import java.text.*;

//Author: Rico H Adrian
//Date : Friday, 11 November 2016
//Subject: Final project CS 110 
//PseudoCode:
//write the methods, recursiveGCD that returns integer and have 2 parameters, 2 integers
//method nonRecursiveGCD also returns integer and have 2 parameters, 2 integers
//method printResults that prints the GCD between 2 numbers using switch statement
//two other methods that prints GCD and average between all the numbers in the file
//main method, first, declare variables arrayOfIntegers 1 and 2 and set the size to 10
//instantiate scanner keyboard for user input, scan file,also instantiate random and file object 
//use for loop to set the value of all integers to random numbers between 0-99 and calculate the sum
//ask user for input using keyboard whether to use recursive or iterative method
//use while loop in case the user enter invalid input and ask if they want to continue or not
//if not, break statement is used to terminate the loop
//add all the integers in the file to the ArrayList
//invoke all the methods and prints out the results
//use the DecimalFormat class to format the average into 2 decimal places
public class FinalProject {
	// recursive method where x and y are 2 integers
	public static int recursiveGCD(int x, int y) {
		// formula to get the GCD between 2 numbers
		if (x % y == 0) {
			return y;
		} else {
			return recursiveGCD(y, x % y);
		}

	}

	// non recursive method(iterative)
	public static int nonRecursiveGCD(int x, int y) {
		while (y != 0) {
			int temp = y; // create temporary variable because we can't initialize y again
			y = x % y;
			x = temp;
		}
		return x;
	}

	// method to print the final result of GCD
	// switch statement to ask user for which method to use
	// recursive or non recursive
	public static void printResults(String userInput, int sum1, int sum2) {
		switch (userInput) {

		case "Recursive":
		case "recursive":
			System.out.println("The greatest common divisor between the sum of random numbers in 2 arrays "+ 
                            "which are " + sum1 + " and " + sum2 + " is " + recursiveGCD(sum1, sum2));
			break;
		case "Iterative":
		case "iterative":
			System.out.println("The greatest common divisor between the sum of random numbers in 2 arrays "+ 
                            "which are " + sum1 + " and " + sum2 + " is " + nonRecursiveGCD(sum1, sum2));
			break;
		default:
			System.out.println("Invalid input");
			System.out.println("Do you want to continue? Please enter yes or no only ");

		}
	}

	// calculate the average of all the list of integers in the file
	public static double averageIntegersInFile(ArrayList<Integer> listOfIntegers) {
		int sum = 0;
		for (int i = 0; i < listOfIntegers.size(); i++) {
			sum += listOfIntegers.get(i);
		}
		double average = (double) sum / (double) listOfIntegers.size();
		return average;

	}

	// GCD of multiple integer numbers in file
	public static int gcdFileNumbers(ArrayList<Integer> listOfIntegers) {
		int result = 0;
		int finalResult = 0;
		int temp = recursiveGCD(listOfIntegers.get(0), listOfIntegers.get(1));
		for (int i = 0; i < listOfIntegers.size() - 2; i++) {
			finalResult = recursiveGCD(temp, listOfIntegers.get(i + 2));
			temp = finalResult;
		}
		return finalResult;
	}

	// main
	public static void main(String[] args) throws IOException {
		// variable declarations of 2 arrays and set the length to 10
		int[] arrayOfInteger1 = new int[10];
		int[] arrayOfInteger2 = new int[10];
		// Declare ArrayList of integers
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		// declare variables for sum of numbers in 2 arrays and initialize them
		// to 0
		int sumArrayOne = 0;
		int sumArrayTwo = 0;
		// instantiate keyboard object
		Scanner keyboard = new Scanner(System.in);
		// random object and file object to read file
		Random randomIntNumbers = new Random();
		File file = new File("integers.txt");
		Scanner inputFile = new Scanner(file);
		// set the values inside the arrays into random numbers from 0-99
		// and calculate the sum inside the loop
		for (int i = 0; i < arrayOfInteger1.length; i++) {
			arrayOfInteger1[i] = randomIntNumbers.nextInt(100);
			sumArrayOne += arrayOfInteger1[i];
		}
		for (int i = 0; i < arrayOfInteger2.length; i++) {
			arrayOfInteger2[i] = randomIntNumbers.nextInt(100);
			sumArrayTwo += arrayOfInteger2[i];
		}
		// variable declaration for user input
		String userInput; // which method the user want to use, recursive or iterative
		String userInputTwo; // whether the user wants to continue or not if the input is invalid
		System.out.println("Which method do you want to use? Please enter" + " recursive or iterative");
		userInput = keyboard.nextLine();
		printResults(userInput, sumArrayOne, sumArrayTwo); // invoke the method printResults
		//if the input is invalid, ask user whether they want to continue or not
		while (!userInput.equalsIgnoreCase("iterative") && !userInput.equalsIgnoreCase("recursive")) {
			userInputTwo = keyboard.nextLine();
			if (userInputTwo.equalsIgnoreCase("no")) {
				break;
			} else if (userInputTwo.equalsIgnoreCase("yes")) {
				System.out.println("Which method do you want to use? Please enter" + " recursive or iterative");
				userInput = keyboard.nextLine();
				printResults(userInput, sumArrayOne, sumArrayTwo);

			}

		}
		//reading data from the file and add them into an arraylist
		while (inputFile.hasNext()) {
			listOfIntegers.add(Integer.parseInt(inputFile.next()));

		}
		//implement decimal format class to format the average into 2 decimal places  
		DecimalFormat df2 = new DecimalFormat("#.##");
		//print the average and GCD of all integer numbers in the file
		System.out.println("The average of all integers in the file integers.txt is "
						   + df2.format(averageIntegersInFile(listOfIntegers)));
		System.out.println("The greatest common divisor of all integers in the file integers.txt is "
						   + gcdFileNumbers(listOfIntegers));

	}
}

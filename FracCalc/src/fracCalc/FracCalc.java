package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	//mainCP1(args);
    	//mainCP2(args);
    	mainCP3(args);
    	

    }
    
    public static void mainCP1(String[] args) {
    	// get input from the user
    	Scanner input = new Scanner(System.in);
    	
    	String eqn = input.nextLine();
    	
    	// print the result returned by produce answer
    	System.out.println(produceAnswer((eqn)));
    }
    
    public static String produceAnswerCP1(String input) {
    	// parse the inputed equation into a numerator, denominator, and whole
		String termOne = input.substring(0, input.indexOf(" "));
		String operator = input.substring(input.indexOf(" ")+1, input.indexOf(" ", input.indexOf(" ")+1));
		String termTwo = input.substring(input.indexOf(" ")+3);
		
		// return the second term
		return termTwo;
    }
    
    public static void mainCP2(String[] args) {
    	// get input from the user
    	Scanner input = new Scanner(System.in);
    	
    	boolean isRunning = true;
    	
    	// keep asking input until the user want to quit
    	while (isRunning) {
    		String response = input.next();
    		if (response.equals("quit")) {
    			isRunning = false;
    		}
    		else {
    			String eqn = input.nextLine();
    			produceAnswerCP2(eqn);
    		}
    	}
    }
    
    public static String produceAnswerCP2(String input) {
    	String termOne = input.substring(0, input.indexOf(" "));
		String operator = input.substring(input.indexOf(" ")+1, input.indexOf(" ", input.indexOf(" ")+1));
		String termTwo = input.substring(input.indexOf(" ")+3);
		
		String termOneDenom;
		String termOneNumer;
		String termOneWhole;
		String termTwoDenom;
		String termTwoNumer;
		String termTwoWhole;
		
		if (termOne.contains("_")) {
			termOneWhole = termOne.substring(0, termOne.indexOf("_"));
			termOneNumer = termOne.substring(termOne.indexOf("_")+1, termOne.indexOf("/"));
			termOneDenom = termOne.substring(termOne.indexOf("/")+1);
		}
		else {
			if (termOne.contains("/")) {
				termOneWhole = "0";
				termOneNumer = termOne.substring(termOne.indexOf("_")+1, termOne.indexOf("/"));
				termOneDenom = termOne.substring(termOne.indexOf("/")+1);
			}
			else {
				termOneWhole = termOne.substring(0);
				termOneNumer = "0";
				termOneDenom = "1";
			}
		}
		
		if (termTwo.contains("_")) {
			termTwoWhole = termTwo.substring(0, termTwo.indexOf("_"));
			termTwoNumer = termTwo.substring(termTwo.indexOf("_")+1, termTwo.indexOf("/"));
			termTwoDenom = termTwo.substring(termTwo.indexOf("/")+1);
		}
		else {
			if (termTwo.contains("/")) {
				termTwoWhole = "0";
				termTwoNumer = termTwo.substring(termTwo.indexOf("_")+1, termTwo.indexOf("/"));
				termTwoDenom = termTwo.substring(termTwo.indexOf("/")+1);
			}
			else {
				termTwoWhole = termTwo.substring(0);
				termTwoNumer = "0";
				termTwoDenom = "1";
			}
		}
		
		return "whole:" + termTwoWhole + " numerator:" + termTwoNumer + " denominator:" + termTwoDenom;
    }
    
    public static void mainCP3(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	boolean isRunning = true;
    	
    	while (isRunning) {
    		String response = input.next();
    		if (response.equals("quit")) {
    			isRunning = false;
    		}
    		else {
    			String eqn = input.nextLine();
    			produceAnswerCP3(eqn);
    		}
    	}
    }
  
    public static String produceAnswerCP3(String input) {
    	// parse the inputed eqn into three parts
    	String termOne = input.substring(0, input.indexOf(" "));
		String operator = input.substring(input.indexOf(" ")+1, input.indexOf(" ", input.indexOf(" ")+1));
		String termTwo = input.substring(input.indexOf(" ")+3);
		
		// initialize variables which will store parts of the terms in the equation
		Integer termOneDenom;
		Integer termOneNumer;
		Integer termOneWhole;
		Integer termTwoDenom;
		Integer termTwoNumer;
		Integer termTwoWhole;
		
		// check if term1 has a _ (basically checking if it has a whole number)
		if (termOne.contains("_")) {
			// parse the term1 into a whole, denominator, and numerator
			termOneWhole = Integer.valueOf(termOne.substring(0, termOne.indexOf("_")));
			termOneNumer = Integer.valueOf(termOne.substring(termOne.indexOf("_")+1, termOne.indexOf("/")));
			termOneDenom = Integer.valueOf(termOne.substring(termOne.indexOf("/")+1));
		}
		// if not, run two more conditions to accurately parse the data
		else {
			// if the first term has a / (basically if it is a fraction)
			if (termOne.contains("/")) {
				// parse the term1 into three parts
				termOneWhole = 0;
				termOneNumer = Integer.valueOf(termOne.substring(termOne.indexOf("_")+1, termOne.indexOf("/")));
				termOneDenom = Integer.valueOf(termOne.substring(termOne.indexOf("/")+1));
			}
			// if not, then we know it is a basic integer and can parse it into the three parts (whole, denom, and numer)
			else {
				termOneWhole = Integer.valueOf(termOne.substring(0));
				termOneNumer = Integer.valueOf("0");
				termOneDenom = Integer.valueOf("1");
			}
		}
		
		// check if the second term has a _ (a whole number)
		if (termTwo.contains("_")) {
			termTwoWhole = Integer.valueOf(termTwo.substring(0, termTwo.indexOf("_")));
			termTwoNumer = Integer.valueOf(termTwo.substring(termTwo.indexOf("_")+1, termTwo.indexOf("/")));
			termTwoDenom = Integer.valueOf(termTwo.substring(termTwo.indexOf("/")+1));
		}
		// if not check if it has a / (or a fraction)
		else {
			if (termTwo.contains("/")) {
				// parse the term into three parts
				termTwoWhole = 0;
				termTwoNumer = Integer.valueOf(termTwo.substring(termTwo.indexOf("_")+1, termTwo.indexOf("/")));
				termTwoDenom = Integer.valueOf(termTwo.substring(termTwo.indexOf("/")+1));
			}
			// if not, we know the term is a basic integer. parse it into three parts
			else {
				termTwoWhole = Integer.valueOf(termTwo.substring(0));
				termTwoNumer = Integer.valueOf("0");
				termTwoDenom = Integer.valueOf("1");
			}
		}
		
		// initialize variables that will store the numerator and denominator of the terms
		int improperFrac1Numer;
		int improperFrac1Denom;
		int improperFrac2Numer;
		int improperFrac2Denom; 
		
		// check if the operator is a +
		if (operator.equals("+")) {
			// check if the first term is negative
			if (termOne.contains("-")) {
				improperFrac1Numer = ((Math.abs(termOneWhole) * Math.abs(termOneDenom)) + Math.abs(termOneNumer)) * -1;
				improperFrac1Denom = termOneDenom;
			}
			else {
				improperFrac1Numer = (termOneWhole * termOneDenom) + termOneNumer;
				improperFrac1Denom = termOneDenom;
			}
			// check if the second term is negative
			if (termTwo.contains("-")) {
				improperFrac2Numer = ((Math.abs(termTwoWhole) * Math.abs(termTwoDenom)) + Math.abs(termTwoNumer)) * -1;
				improperFrac2Denom = termTwoDenom;
			}
			else {
				improperFrac2Numer = (termTwoWhole * termTwoDenom) + termTwoNumer;
				improperFrac2Denom = termTwoDenom;
			}
			// store the calculated numerator and denominator to variables
			int fNum = ((improperFrac1Numer * improperFrac2Denom) + (improperFrac2Numer * improperFrac1Denom));
			int fDen = (improperFrac1Denom * improperFrac2Denom);
			// send the values to a reduction function and return its value
			return reduce(fNum, fDen);
		}
		// check if the operator is a -
		else if (operator.equals("-")) {
			// check if the first term is negative
			if (termOne.contains("-")) {
				improperFrac1Numer = ((Math.abs(termOneWhole) * Math.abs(termOneDenom)) + Math.abs(termOneNumer)) * -1;
				improperFrac1Denom = termOneDenom;
			}
			else {
				improperFrac1Numer = (termOneWhole * termOneDenom) + termOneNumer;
				improperFrac1Denom = termOneDenom;
			}
			// check if the second term is negative
			if (termTwo.contains("-")) {
				improperFrac2Numer = ((Math.abs(termTwoWhole) * Math.abs(termTwoDenom)) + Math.abs(termTwoNumer)) * -1;
				improperFrac2Denom = termTwoDenom;
			}
			else {
				improperFrac2Numer = (termTwoWhole * termTwoDenom) + termTwoNumer;
				improperFrac2Denom = termTwoDenom;
			}
			// check if the values are equal to each other and then return 0
			if (improperFrac1Numer == improperFrac2Numer) {
				return "" + 0;
			}
			// store the calculated numerator and denominator to variables
			int fNum = ((improperFrac1Numer * improperFrac2Denom) - (improperFrac2Numer * improperFrac1Denom));
			int fDen = (improperFrac1Denom * improperFrac2Denom);
			// send the values to a reduction function and return its value
			return reduce(fNum, fDen);
		}
		// check if the operator is a * (multiply)
		else if (operator.equals("*")) {
			// check if the first term is negative
			if (termOne.contains("-")) {
				improperFrac1Numer = ((Math.abs(termOneWhole) * Math.abs(termOneDenom)) + Math.abs(termOneNumer)) * -1;
				improperFrac1Denom = termOneDenom;
			}
			else {
				improperFrac1Numer = (termOneWhole * termOneDenom) + termOneNumer;
				improperFrac1Denom = termOneDenom;
			}
			// check if the second term is negative
			if (termTwo.contains("-")) {
				improperFrac2Numer = ((Math.abs(termTwoWhole) * Math.abs(termTwoDenom)) + Math.abs(termTwoNumer)) * -1;
				improperFrac2Denom = termTwoDenom;
			}
			else {
				improperFrac2Numer = (termTwoWhole * termTwoDenom) + termTwoNumer;
				improperFrac2Denom = termTwoDenom;
			}
			// check whether the one of the two numerators is 0. if so return 0 as answer
			if (improperFrac1Numer == 0 || improperFrac2Numer == 0) {
				return "" + 0;
			}
			// pass the parts of the first and second term into multiply function. return the result
			return multiply(improperFrac1Numer, improperFrac1Denom, improperFrac2Numer, improperFrac2Denom);
		}
		// check if the operator is a * (multiply)
		else if (operator.equals("/")) {
			// check if the first term is negative
			if (termOne.contains("-")) {
				improperFrac1Numer = ((Math.abs(termOneWhole) * Math.abs(termOneDenom)) + Math.abs(termOneNumer)) * -1;
				improperFrac1Denom = termOneDenom;
			}
			else {
				improperFrac1Numer = (termOneWhole * termOneDenom) + termOneNumer;
				improperFrac1Denom = termOneDenom;
			}
			// check if the second term is negative
			if (termTwo.contains("-")) {
				improperFrac2Numer = ((Math.abs(termTwoWhole) * Math.abs(termTwoDenom)) + Math.abs(termTwoNumer)) * -1;
				improperFrac2Denom = termTwoDenom;
			}
			else {
				improperFrac2Numer = (termTwoWhole * termTwoDenom) + termTwoNumer;
				improperFrac2Denom = termTwoDenom;
			}
			// check whether either of the numerators are 0. Then return 0.
			if (improperFrac1Numer == 0 || improperFrac2Numer == 0) {
				return "" + 0;
			}
			// pass the parts of the two terms to the divide function
			return divide(improperFrac1Numer, improperFrac1Denom, improperFrac2Numer, improperFrac2Denom);
		}
		// if the operators aren't (+, -, *, or /) tell the user they have entered an invalid operator
		else {
			return "Operation Error: You have entered an invalid operator.";
		}
    }
    
    // create a function that will multiply two fractions
    public static String multiply(int frac1Num, int frac1Den, int frac2Num, int frac2Den) {
    	// create an answer variable
		String answer;
		
		// calculate the fraction numerator
		int fracNumer = (frac1Num * frac2Num);
		// calculate the fraction denominator
    	int fracDenom = (frac1Den * frac2Den);
    	// check if the fraction numerator is 0
    	if (fracNumer == 0) {
    		// if so, return 0
    		answer = "0";
    		return answer;
    	}
    	// set answer equal to the value returned by the reduction method
    	answer = reduce(fracNumer, fracDenom);
    	return answer;
	}
    
    // create a method that divides two fractions
    public static String divide(int frac1Num, int frac1Den, int frac2Num, int frac2Den) {
    	// create a variable called answer
    	String answer;
    	// check if term two's numerator is negative
		if (frac2Num < 0) {
			// multiply the second term's numerator and denominator by -1
			frac2Den *= -1;
			frac2Num *= -1;
		}
		
		// initialize variables to store the fraction numerator and denominator
		int fracNumer = (frac1Num * frac2Den);
    	int fracDenom = (frac1Den * frac2Num);
    	// check if the fraction denominator is 0 and return an error message
    	if (fracDenom == 0) {
    		return "ERROR: Can't divide by zero";
    	}
    	// if the fraction numer and denom are negative
    	if (fracNumer < 0 && fracDenom < 0) {
    		// mutliply the terms by a negative 1
    		fracNumer *= -1;
    		fracDenom *= -1;
    	}
    	// if the numerator is 0, then return 0
    	if (fracNumer == 0) {
    		answer = "0";
    		return answer;
    	}
    	// pass the values to a reduction method to reduce the fraction
    	answer = reduce(fracNumer, fracDenom);
    	return answer;
	}
    
    public static int gcd(int x, int y){
 	   if (y==0) {
 		   return x;
 	   }
 	   return gcd(y,x%y);
 	}
 	
 	public static String reduce(int num, int den) {
 		// assign the parts of the fraction their values
 		int fracWhole = num/den;
 		int fracNumer = num%den;
 		int fracDenom = den;
 		// check if the numerator is negative
 		if (fracNumer < 0 && fracWhole != 0) {
 			fracNumer *= -1;
 		}
 		// check if the denominator is 1
 		if (fracDenom == 1) {
 			return "" + fracWhole;
 		}
 		
 		// divide the denominator and numerator by the greatest common denominator
 		fracNumer /= gcd(num, den);
 		fracDenom /= gcd(num, den);
 		
 		// check if the numerator and the denominator are less than zero
 		if (fracNumer < 0 && fracDenom < 0) {
 			// distribute the negatives
 			fracNumer *= -1;
 			fracDenom *= -1;
 		}
 		// if the whole numer is 0 then return only the numer and the denom
 		if (fracWhole == 0) {
 			return "" + fracNumer + "/" + fracDenom;
 		}
 		if (fracNumer == 0) {
 			return "" + fracWhole;
 		}
 		// return the entire fraction
 		return fracWhole + "_" + fracNumer + "/" + fracDenom;
 	}
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	//return produceAnswerCP1(input);
    	//return produceAnswerCP2(input);
    	return produceAnswerCP3(input);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
 
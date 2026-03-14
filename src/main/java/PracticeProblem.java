/**
 * File Name: 2.2 - More Functions
 * Author: Tom Leung
 * Date Created: March 11, 2026
 * Date Last Edited: March 14, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static boolean isEven(int num1){
		boolean b1;
		double num2;
		num2=num1%2;
		b1=num2==0;
		return b1;
	}

	public static boolean isOdd(int num1){
		boolean b1;
		double num2;
		num2=num1%2;
		b1=num2!=0;
		return b1;
	}

	public static boolean isPositive(int num1){
		boolean b1;
		b1=num1>0;
		return b1;
	}

	public static boolean isNegative(int num1){
		boolean b1;
		b1=num1<0;
		return b1;
	}

	public static int combinedLength(String v1, String v2){
		int num1 = v1.length() + v2.length();
		return num1;
	}
}
	

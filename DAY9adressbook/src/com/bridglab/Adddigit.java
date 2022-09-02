package com.bridglab;
public class Adddigit {
	public static void main (String[]args)
	   {
	     int num = 1234, sum = 0;
	     //using loop
	     while(num!=0){
	         sum += num % 10;
	         num = num / 10;
	     }

	     //output
	       System.out.println ("Sum of digits : " + sum);
	   }

}

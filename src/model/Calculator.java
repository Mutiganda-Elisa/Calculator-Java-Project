package model;

import java.util.*;
public class Calculator {

	public static void main(String[] args)
{
		
Scanner sc = new Scanner(System.in);

System.out.println("Enter First Number:");

double num1=sc.nextDouble();



System.out.println("Enter First Number:");

double num2=sc.nextDouble();

System.out.println("Choose operation:(+,-,*,/)");
char operation=sc.next().charAt(0);

double result=0;



switch(operation) {

case'+':
	result= num1+num2;
	break;
case'-':
	result=num1-num2;
	break;
case'*':
	result=num1*num2;
	break;
case'/':
	
	if(num2 !=0) {
	result=num1/num2;}
	else {
		System.out.println("You can't divide number by zero");
	}
	break;
	
	default:
		System.out.println("Invalid operation");
		return;

}
System.out.println("Result: "+result);
}}

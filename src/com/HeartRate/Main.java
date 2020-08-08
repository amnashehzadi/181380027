package com.HeartRate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your first name ");
    String fname=input.next();
    System.out.print("Enter your last name");
    String lname=input.next();
    System.out.print("Enter your day of your birth");
    int day=input.nextInt();
    System.out.print("Enter your month of your birth");
    int month=input.nextInt();
    System.out.print("Enter your Year of your birth");
    int year=input.nextInt();
    HeartRate h1=new HeartRate(fname,lname,day,month,year);

    System.out.println(fname+" Your age is "+ h1.getAge());
    System.out.println("your heart rate is "+h1.getMaxHeartRate());


    }
	// write your code here

}

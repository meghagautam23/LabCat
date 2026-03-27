package LabCat;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter marks of Subject 1: ");
int s1 = sc.nextInt();

System.out.print("Enter marks of Subject 2: ");
int s2 = sc.nextInt();

System.out.print("Enter marks of Subject 3: ");
int s3 = sc.nextInt();

int total = s1 + s2 + s3;
double avg = total / 3.0;

System.out.println("Total Marks: " + total);
System.out.println("Average: " + avg);

if (avg >= 90)
System.out.println("Grade: A");
else if (avg >= 75)
System.out.println("Grade: B");
else if (avg >= 60)
System.out.println("Grade: C");
else if (avg >= 50)
System.out.println("Grade: D");
else
System.out.println("Grade: F");

sc.close();
}
}
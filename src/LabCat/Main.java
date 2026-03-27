package LabCat;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {


int s1 = 80;
int s2 = 70;
int s3 = 90;

int total = s1 + s2 + s3;
double avg = total / 3.0;

  
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

}
}

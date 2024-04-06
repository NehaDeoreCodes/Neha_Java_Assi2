package que8;

import java.util.Scanner;

public class Student {

	
		Scanner sc=new Scanner(System.in);

	private int rollno;
	private String name;
	private String course;
	private double mark;
	private char grade;
	private String result;

	public void set(int rollno, String name, String course, double mark) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.mark = mark;
		
	}

	public void calgrade(int mark) {
		 if (mark > 90) {
	            grade = 'A';
	        } else if (mark >= 80 && mark <= 90) {
	            grade = 'B';
	        } else if (mark >= 70 && mark < 80) {
	            grade = 'C';
	        } else if (mark >= 60 && mark < 70) {
	            grade = 'D';
	        } else {
	            grade = 'F';
		}
	}

	public void calculateResult() {
        result = (mark > 60) ? "Pass" : "Fail";
    }
	

	public void printdeatils() {
		System.out.println("rollno=" + rollno);
		System.out.println("name=" + name);
		System.out.println("course=" + course);
		System.out.println("marks=" + mark);
		System.out.println("grade=" + grade);
		System.out.println("result=" + result);

	}

	public static void main(String[] args) {
	Student stud=new Student();
	stud.set(1, "NEHA", "CDAC", 10);
	stud.calgrade(0);
	stud.calculateResult();
	stud.printdeatils();
	
	
	
	}
	}

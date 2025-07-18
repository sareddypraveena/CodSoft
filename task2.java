import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numSubjects;
        int totalMarks=0;
        double average;
        char grade;
        System.out.print("Enter the number of subjects: ");
        numSubjects=input.nextInt();
        int count=1;
        while (count<=numSubjects) {
            System.out.print("Enter marks for subject " + count + ": ");
            int mark=input.nextInt();
            totalMarks=totalMarks+mark;
            count=count+1;
        }
        average=totalMarks/(double) numSubjects;
        if (average>=90) {
            grade = 'A';
        } else if (average>=80) {
            grade = 'B';
        } else if (average>=70) {
            grade = 'C';
        } else if (average>=60) {
            grade = 'D';
        } else if (average>=50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}
 

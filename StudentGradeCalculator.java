package CodeSoftTask2;
import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		int TotalMarks=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of subject");
		int subjects=s.nextInt();
		int arr[]=new int[subjects];
		System.out.println("enter all the subject marks out of 100");
		for(int i=0;i<subjects;i++){
			 arr[i]=s.nextInt();
		}
		for(int j=0;j<subjects;j++) {
			TotalMarks=TotalMarks+arr[j];
		}
		 System.out.println("TotalMarks is" + TotalMarks);
		 int AveragePercentage=TotalMarks/subjects;
		 System.out.println("AveragePercentage is" + AveragePercentage);
         if(AveragePercentage>90) 
             {
        	 System.out.println("your grade is A");
             }
        	 else if(AveragePercentage<=90&&AveragePercentage>80)
        	 {
        		 System.out.println("your grade is B");
        	 }
        	 else if(AveragePercentage<=80&&AveragePercentage>70) {
        		 System.out.println("your grade is c");
        	 }
        	 else if(AveragePercentage<=70&&AveragePercentage>55) {
        		 System.out.println("your grade is D");
        	 }
        	 else
        	 {
        		 System.out.println("your grade is f");
        	 }
         }
       
}


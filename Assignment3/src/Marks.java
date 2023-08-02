import java.io.Console;
import java.util.Scanner;

public class Marks {

	float score, score1, score2, score3, score4, total;
		
	
	public static void main(String[] args) {
    	
		
        Marks Grade1 = new Marks();		
		Grade1.Grade_Calc();
		
	}

	public void Grade_Calc()
	{
			
        Scanner in = new Scanner(System.in);
        	
        System.out.println("Enter the marks for Maths");
		score1 = in.nextFloat();
		
		if((score1<0) || (score1 >100))
		{
			System.out.println("Re-Enter the marks for Maths");
			score1 = in.nextFloat();
		}
		
		System.out.println("Enter the marks for English");
		score2 = in.nextFloat();
		
		if((score2<0) || (score2 >100))
		{	
			System.out.println("Re-Enter the marks for Maths");
			score2 = in.nextFloat();
		}
		
		System.out.println("Enter the marks for Science");
		score3 = in.nextFloat();
		
		if((score3<0) || (score3 >100))
		{		
			System.out.println("Re-Enter the marks for Maths");
			score3 = in.nextFloat();
		}
		
		System.out.println("Enter the marks for Social");
		score4 = in.nextFloat();
		
		if((score4<0) || (score4 >100))
		{		
			System.out.println("Re-Enter the marks for Maths");
			score4 = in.nextFloat();
		}
		
		System.out.println("Percentage Obtained");
		total = score1+score2+score3+score4;
		score = total/4;
		System.out.println(score);
        
		if
		((score >=90) && (score<=100))
		{
		System.out.println("Excellent");
		}
		else
		if
		((score >= 80)&&( score <=89 )) 
		{
			System.out.println("Very Good");	
		}
		else
		if
		((score >= 60) && (score <= 79))
		{
			System.out.println("Good");
		}
		else
		if
		((score >= 40) && (score <=59))
		{
			System.out.println("Average");
		}
		else 
		if
		(score < 40)
		{
			System.out.println("Poor");
		}	
		else
		
			System.out.println("Invalid Marks entered");    				
		
	}
}
	


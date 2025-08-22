package calculator;
import java.util.*;
public class Student_Grade {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean again=true;
		do
		{
			System.out.println("~~~~~~~~~~~~~~~~~WELCOME TO PRO's SCHOOLING~~~~~~~~~~~~~~~~~");
			System.out.print("Enter Your Name:");
			String name=s.next();
			ArrayList<Integer> stu=new ArrayList<>();
			int total=0;
			System.out.println("Enter the Number of Subjects: ");
			int a=s.nextInt();
			for(int i=0;i<a;i++)
			{
				System.out.print("Enter Mark "+(i+1)+":");
				stu.add(s.nextInt());
			}
			for(int i=0;i<a;i++)
			{
				total+=stu.get(i);
			}
			float avg=(float)total/(float)a;
			System.out.println("-----------GRADE CALCULATOR------------");
			System.out.println("NAME: "+name);
			System.out.println("TOTAL: "+total);
			System.out.println("AVERAGE: "+avg);
			if(avg>=90)
				System.out.println("Congratualtions You have Secured \"O\" Grade ");
			else if(avg>=80 && avg<90)
				System.out.println("Excellent You have Secured \"A\" Grade");
			else if(avg>=70 && avg<80)
				System.out.println("Good You have Secured \"B\" Grade");
			else if(avg>=60 && avg<70)
				System.out.println("You have Secured \"C\" Grade");
			else 
				System.out.println("You have Failed the examination");
			System.out.println();
			System.out.print("Do you want to continue:yes/no: ");
			String sr=s.next().toLowerCase();
			if(sr.equals("yes"))
				again=true;
			else
				again=false;
		}while(again);
	}
}

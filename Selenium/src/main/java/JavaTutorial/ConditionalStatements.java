package JavaTutorial;

public class ConditionalStatements 
{
	static int num = 100;
	public static void main(String[] args) 
	{

		//if  statement


		if (num<=100)
		{
			System.out.println("Value of num is "+num);
		}	

		//nested if   statement

		if (num<=100)
		{
			System.out.println("Value of num is "+num);

			if (num>50)
			{
				System.out.println("Value of num is "+num);
			}

		}

		//if else statement

		if (num>100)
		{
			System.out.println("Value is greater than 100");
		}else
		{
			System.out.println("Value is less than 100");
		}

		//if else if statement
		int marks = 85;
		String grade;

		if (marks >= 80) 
		{
			grade = "A";
			System.out.println("My grade is "+grade);
		} 
		else if (marks >= 70) 
		{
			grade = "B";
			System.out.println("My grade is "+grade);
		} else if (marks >= 60) 
		{
			grade = "C";
			System.out.println("My grade is "+grade);
		} else if (marks >= 50) 
		{
			grade = "D";
			System.out.println("My grade is "+grade);
		}else if (marks >= 40) 
		{
			grade = "E";
			System.out.println("My grade is "+grade);
		} else 
		{
			grade = "F";
			System.out.println("My grade is "+grade);
		}
		//System.out.println("Grade = " + grade);
		int mark=40;
		switch(mark) {
		case 85:
			System.out.println("my grade is A");
			break;
		case 75:
			System.out.println("my grade is B");
			break;
		case 70:
			System.out.println("my grade is C");
			break;
		case 60:
			System.out.println("my grade is D");
			break;
		case 50:
			System.out.println("my grade is E");
			break;
		default:
			System.out.println("my grade is F");
			break;
		}
		int x = 10;
		for (int i = 1; i <= x; i++) {

			System.out.println("i value is :"+i);
		}
		String y[] = {"sankar","jeyam","viki"};
		for (String i : y) {
			System.out.println("iteration value is :"+i);
		}
		int z=1;
		//int w=10;
		while (z<=10) {
			System.out.println("Z value is: "+z);
			z++;

		}
		int w = 1;
		do {
			System.out.println("my value is:"+ w);
			w++;
		}while(w<10);
		for (int i = 0; i < 10; i++) {
			if (i<=5) {
				continue;
			}
			System.out.println("my i value is"+i);
		}
		for (int i=1; i<=10; i++)
		{ 
			if (i==4)
			{
				break;
			}

			System.out.println("Value of i is "+i);

		}

	}
}
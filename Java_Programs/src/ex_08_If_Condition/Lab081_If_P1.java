package ex_08_If_Condition;

public class Lab081_If_P1 {
	
	public static void main ( String [] args) {
		
		int age=Integer.parseInt(args[0]);
		if (age >25)
		{
			System.out.println("you can vote as your age is :" + age) ;
		}
		else
		{
			System.out.println("you can't vote as your age is :" + age) ;
		}
		
	}

}

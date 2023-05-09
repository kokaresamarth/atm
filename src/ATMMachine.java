import java.util.*;
public class ATMMachine 
{

	public static void main(String[] args) 
	{
		int balance=20000,withdraw,deposite,num;
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("Wellcome to ATM machine");
			System.out.println("1.withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter the Amount to be withdraw");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("Balance Amount is:"+balance);
					System.out.println("Please collect money");
				}
				else
				{
					System.out.println("you dont have enough money for withdraw");
				}
				break;
			case 2:
				System.out.println("Enter the Amount to deposite");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("Balance Amount is:"+balance);
				System.out.println("money has been deposited successful");
				break;
			case 3:
				System.out.println("Balance of your account is :"+balance);
				System.out.println(" ");
				break;
			case 4:
				System.exit(0);
			}
			System.out.println(" ");
		}
		

	}

}

// bank Application
import java.util.Scanner;
import java.util.ArrayList;
public class code1 {
    public static void main(String []args)
    {
     int balance=30000, deposite,withdraw,num;
     String acc_no;
      Scanner sc=new Scanner(System.in);
      while(true)
      {
        System.out.println(" Welcom to SBI BANK ATM");  //option to select
        System.out.println(" 1. Create Account");
        System.out.println(" 2. Deposite");
        System.out.println(" 3. Withdraw");
        System.out.println(" 4. Balance");
      
        num=sc.nextInt();
        switch(num)                                       //switch case start
        {
         case 1:
          ArrayList ac=new ArrayList();
          System.out.print("Create Account no:");
           acc_no=sc.next();
           ac.add(acc_no);
           System.out.print("Create Account no:");
           acc_no=sc.next();
           ac.add(acc_no);
           System.out.print("Create Account no:");
           acc_no=sc.next();
           ac.add(acc_no);
           for( int i=0;i<ac.size();i++)
           {
            System.out.println(" Show list "+ac.get(i));
           }
          System.out.println();
         break;

         case 2:
          System.out.println("Enter a Amount to Deposite ");
          deposite=sc.nextInt();
          balance=balance+deposite;
          System.out.println(" Balance amount is: "+balance);
          System.out.println(" Money has been deposited successfully..!"); 
          System.out.println();  
         break;

         case 3:
          System.out.println("Enter  a Amount to withdraw");
          withdraw=sc.nextInt();
          if(balance>=withdraw) 
          {
            balance=balance-withdraw;
            System.out.println("   Balance amount is: "+balance);
            System.out.println(" Please collect money...!");
          } 
          else
          {
            System.out.println(" You don't have enough money to withdraw ");
          }
          System.out.println();
          break;

         case 4:
           System.out.println(" Balance of your acount is:"+balance); 
           System.out.println(" THANK YOU.....!");
           System.out.println();
         break;
         
       }                                                                     //switch case End
      }
    }
    
}

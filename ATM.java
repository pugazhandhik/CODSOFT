import java.util.*;
class check
{
Scanner in1 = new Scanner(System.in);
int b,bal=500;
void withdraw()
{
if(bal>=500){
System.out.println("Enter the amount to withdraw:");
b=in1.nextInt();
bal=bal-b;
}
else
System.out.println("you cannot do withdraw bacause bal is less then 500");
}
void deposit()
{
System.out.println("Enter the amount to deposit:");
b=in1.nextInt();
bal=bal+b;
}
void balance()
{
System.out.println("Your balance account is "+bal);
}
}
class ATM
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
check obj = new check();
boolean c=true;
while(c)
{
System.out.println();
System.out.println("1.withdraw 2.deposit 3.balance 4.exit");
System.out.println("Enter your choice:");
int a=in.nextInt();
if(a==1)
{
obj.withdraw();
}
else if(a==2)
{obj.deposit();}
else if(a==3)
{obj.balance();}
else
break;
}
System.out.println("Thank you for your coming!");
System.out.println("come again");
}
}
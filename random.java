import java.util.*;
import java.util.Random;
class random{
public static void main(String args[])
{
Random a=new Random();
int d=1;
while(d==1){
int b=a.nextInt(100);
Scanner in = new Scanner(System.in);
System.out.println("only 10 attempt:");
System.out.println("let's go");
System.out.print("Enter the number between 1-100:");
int i;
for(i=1;i<=10;i++)
{
int c= in.nextInt();
if(c==b)
break;
else if(c>b)
System.out.println("too high");
else if(c<b)
System.out.println("too low");

}
switch(i)
{
case 1:
{System.out.println("congrasulation you find the number at attempt "+i);
System.out.println("score:"+100);
break;}
case 2:
{System.out.println("congrasulation you find the number at attempt "+i);
System.out.println("score:"+90);
break;}
case 3:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+80);
break;}
case 4:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+70);
break;}
case 5:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+60);
break;}
case 6:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+50);
break;}
case 7:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+40);
break;}
case 8:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+30);
break;}
case 9:
{System.out.println("congratulation you find the number at attempt "+i);
System.out.println("score:"+20);
break;}
case 10:
{System.out.println("congrasulation you find the number at attempt "+i);
System.out.println("score:"+10);
break;}
default:
System.out.println("sorry your are not find the number so you are fail:");
}
System.out.print("do you continue pls enter no 1:");
d=in.nextInt();
}
System.out.println("*******THANK YOU*******");
}
}
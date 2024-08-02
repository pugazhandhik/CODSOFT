import java.util.*;
class calculate
{
int a[]=new int[5];
int c=0;
float avg;
Scanner in = new Scanner(System.in);
void getmark()
{
System.out.println("Enter the 5 subjcet mark 1.Tamil 2.English 3.Math 4.Science 5.java");
for(int i=0;i<5;i++)
{
a[i]=in.nextInt();
}}

void cal()
{
for(int i=0;i<5;i++)
{
c+=a[i];
avg=c/5;
}
}
char d;
void gradecal()
{
if(avg>90 && avg<=100)
d='O';
else if(avg>80 && avg<=90)
d='A';
else if(avg>70 && avg<=80)
d='B';
else if(avg>60 && avg<=70)
d='C';
else if(avg>=50 && avg<=60)
d='D';
else
d='F';
}
void print()
{
System.out.println("TOTAL       :"+c);
System.out.println("PERSENTAGE  :"+avg);
System.out.println("GRADE       :"+d);
}
}
class grade
{
public static void main(String args[]){
calculate obj = new calculate();
obj.getmark();
obj.cal();
obj.gradecal();
obj.print();
}
}
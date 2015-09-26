import java.util.Scanner;

import basicsDEmo.mainclass;


public class Diceroller
implements IDiceroller
{
public int roll(int paramInt1, int paramInt2)
{
  if (paramInt1 < 0) {
    throw new IllegalArgumentException("The number of dice must be a positive integer");
  }
  if ((paramInt2 < 4) || (paramInt2 > 100)) {
    throw new IllegalArgumentException("The number of sides per die supplied is invalid");
  }
  int sum=0;
int a=0;
Scanner in = new Scanner(System.in);

for(int i=0;i<paramInt1;i++){
//take input from user 
  System.out.println("Enter die value");
    a = in.nextInt();
//value should be less than sides
if(paramInt2 < a){
	sum = sum + a;
	int s=sum;
    System.out.println("sum of dice" +s);
	a=0;}
else{

System.out.println("please enter value less than or equal to  "+paramInt2 );

}


}
return sum;
}
}

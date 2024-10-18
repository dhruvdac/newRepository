import java.util.Scanner;
class JavaTest{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int largest = 0;
int smallest = 0;

if(a>b && a>c){
	largest  = a;
}
if(b>a && b>c){
	largest  = b;
}
if(c>b && a<c){
	largest  = c;
}

if(a<b && a<c){
	smallest  = a;
}
if(b<a && b<c){
	smallest  = b;
}
if(c<b && a>c){
	smallest  = c;
}
System.out.println("sum of largest and smallest numbers : " + (largest + smallest));
}
}

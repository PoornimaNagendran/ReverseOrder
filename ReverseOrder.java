import java.util.Scanner;
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println(" Enter a sentence :");
String str=s.nextLine();
String[] ss=str.split(" ");
String result="";
for(int i=ss.length-1;i>=0;i--)
{
	result=result+ss[i]+" ";
}
System.out.println(" Reverse Order is ");
System.out.println(result);
	}

}

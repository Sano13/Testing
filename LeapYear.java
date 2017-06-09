import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4 == 0){
			System.out.println("A Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");	
		}
	}
}

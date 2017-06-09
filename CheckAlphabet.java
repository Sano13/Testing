import java.util.Scanner;
import java.lang.Character;
public class CheckAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(Character.isLetter(c)){
			System.out.println("A Alphabet");	
		}
		else{
			System.out.println("Not a Alphabet");
		}	
	}
}

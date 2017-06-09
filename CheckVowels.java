import java.util.Scanner;
import java.lang.Character;
public class CheckVowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		c = Character.toLowerCase(c);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}
	}
}

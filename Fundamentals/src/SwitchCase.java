import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

}

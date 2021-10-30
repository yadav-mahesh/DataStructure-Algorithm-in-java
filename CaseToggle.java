// CaseToggle Code
import java.util.Scanner;

public class CaseToggle {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String s = a.next();
		System.out.println(toggle(s));
	}

	public static String toggle(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i <= sb.length() - 1; i++) {
			char ch = sb.charAt(i);
			if (ch < 'a') {
				char d = ' ';
				ch += d;
				sb.setCharAt(i, ch);
			} else {
				char d = ' ';
				ch -= d;
				sb.setCharAt(i, ch);
			}

		}
		String sq = sb.toString();
		return sq;
	}
}

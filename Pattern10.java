// Author:  Vishesh Jain
//Pattern:-
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
package first;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp = 0;
		int nst = 2*n-1 ;
		int row=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
			  csp++;}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
			cst++;}
			System.out.println();
			nsp=nsp+1;
			nst=nst-2;
			row++;
		}

	}

}

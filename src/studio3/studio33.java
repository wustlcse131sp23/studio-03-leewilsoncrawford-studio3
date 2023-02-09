package studio3;

import java.util.Scanner;

public class studio33 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input your number");
		int n = in.nextInt();


		boolean[] array = new boolean[n];

		for (int i = 0; i <n; ++i) {
			array[i] = true;		
		}

		for (int i =2; i < Math.sqrt(n); i++) { 
			if (array[i] == true) {
				for (int j = (i*i); j <n;j= j+i) {
					array [j] = false;	
				}
			}
		}

		for (int i =2; i < n;i++) {
			if (array[i]== true) {
				System.out.println(i);
			}
		}
	}

}


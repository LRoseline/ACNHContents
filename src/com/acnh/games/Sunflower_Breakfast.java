package com.acnh.games;

import java.util.Scanner;

public class Sunflower_Breakfast {

	public static void main(String[] args) throws Exception {
		Scanner z = new Scanner(System.in);
		Scanner con = new Scanner(System.in);
		
		System.out.println("개복치의 아침식사");
		
		System.out.println("게임할 라운드 수를 입력하세요");
		int game = z.nextInt();
		
		System.out.println("발판 수를 입력하세요.");
		int slab = z.nextInt();
		
		for (int i = 1; i < game+1; i++) {
			System.out.println(i+"라운드 시작합니다. 발판 순서는 왼쪽부터 1부터 시작합니다.");
			for (int k = 1; k < slab + 1; k++) {
				System.out.print("|"+k+"번째 발판\t");
			}
			System.out.println("\n========================================");
			
			for (int j = 0; j < slab; j++) {
				int scoreorigin = (int) (Math.random() * (20 - 10) + 3) + 3;
				
				int score = scoreorigin - (scoreorigin % 2);
				
				System.out.print("|"+score+"\t\t");
			}
			System.out.println("\n========================================");
			String conti = con.nextLine();
			
			System.out.println("\n\n\n\n\n");
			System.out.println("시간이 되었습니다!");
			conti = con.nextLine();
			System.out.println("\n\n\n\n\n");
			if (i != game) {
				System.out.println("탈락자와 사망자 그리고 생존자를 구별하는 시간입니다.");
				if (i > 1) {
					System.out.println((i-1)+"라운드 사망자분들은 이제 게임에 참여가 가능합니다.");
				}
			}
			conti = con.nextLine();
			System.out.println("\n\n\n\n\n");
		}
		System.out.println("게임종료!");
		System.exit(0);
	}
}
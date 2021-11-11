package com.acnh.test;

import java.util.Scanner;

public class Scanning {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		Scanner A = new Scanner(System.in);
		
		System.out.println("플레이어 1의 닉네임을 입력하세요.");
		String player1name = A.next();
		
		System.out.println("목표 도달 라운드 수를 선택하세요.");
		int total = x.nextInt();
		
		int player1 = 0;
		int player2 = 0;
		
		
		while (true) {
			System.out.println("점수를 줄 플레이어의 번호를 입력하세요.");
			int z = s.nextInt();
			
			if (z == 1)
			{
				player1++;
				System.out.println(player1name+"에게 1점이 부여됩니다.");
			}
			else if (z == 2)
			{
				player2++;
			}
			else if (z == -1)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("잘못된 정보입니다.");
			}
			
			if (player1 == total)
			{
				System.out.println("플레이어 1 승리");
				System.exit(0);
			}
			else if (player2 == total)
			{
				System.out.println("플레이어 2 승리");
				System.exit(0);
			}
			
			System.out.println(player1+" : "+player2);
		}
	}
}

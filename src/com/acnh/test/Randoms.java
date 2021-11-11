package com.acnh.test;

import java.util.Random;
import java.util.Scanner;

public class Randoms {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		
		System.out.println("게임을 할 라운드 수를 입력하세요.");
		int game = z.nextInt();
		
		for (int i = 1; i < game+1; i++) {
			System.out.println(i+"라운드 시작합니다.");
			for (int j = 0; j < 3; j++) {
				int Va = (int) (Math.random() * (10 - 1) + 1);
				System.out.print(Va+"\t");
			}
			System.out.println("\n자신이 갈 숫자의 발판 위로 올라가세요.\n");
			String ready = x.nextLine();
			
			System.out.println("");
			if (i < game) {
				System.out.println("탈락자는 별도의 공간으로 이동하여 1라운드만 휴식합니다.");
				System.out.println("나머지 분들은, 대기 공간으로 이동해주세요.");
				System.out.println("\n\n");
				
				if(i > 1) {
					System.out.println((i-1)+"라운드 탈락자 분들은, 대기 공간으로 이동해주세요.\n");
				}
			}
			else if (i == game) {
				System.out.println("게임 끝");
			}
		}
		System.exit(0);
	}
}

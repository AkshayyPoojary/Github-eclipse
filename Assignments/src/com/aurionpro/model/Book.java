package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class Book {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To start the Game enter 1 or 0 to get out of the game ");
		int choice = sc.nextInt();
		int point = 1;

		int score1 = 0;
		int score2 = 0;
		int player1_round = 0;
		int player2_round = 0;
		int balls = 1;
		Random number = new Random();
		if (choice == 1) {
			System.out.println("Enter the player 1 name:");
			String name1 = new String();
			name1 = sc.next();
			System.out.println("Enter the player 2 name:");
			String name2 = new String();
			name2 = sc.next();
			System.out.println("Player 1 " + name1 + " is going to play first!");

			// Player 1
			while (point != 0 && player1_round <= 12) {
				System.out.println("Enter 1 to open the book for runs.");
				int num = sc.nextInt();
				if (num == 1) {
					int random = number.nextInt(300) + 1;
					System.out.println("Page number is " + random);
					point = random % 7;
					score1 = point + score1;
					player1_round++;
					System.out.println("Points = " + point);
					System.out.println("Score = " + score1);
				}
			}

			System.out.println(name1 + " IS OUT!!");
			System.out.println("It took " + name1 + " " + player1_round + " balls");
			System.out.println(name1 + " has scored " + score1 + " runs and to win the match " + name2
					+ " has to score " + ++score1+" runs");

			// Player 2
			point++;
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("Player 2 " + name2 + " is going to chase now.");
			while (point != 0 && player2_round <= 12) {
				System.out.println("Enter 1 to open the book for runs.");
				int num = sc.nextInt();
				if (num == 1) {
					int random = number.nextInt(300) + 1;
					System.out.println("Page number is " + random);
					point = random % 7;
					score2 = point + score2;
					player2_round++;
					System.out.println("Points = " + point);
					System.out.println("Score = " + score2);

					if (score2 > score1) {
						break;
					}
				}	
			}
			if(score2>score1) {
				System.out.println(name2 +" WON THE GAME!!");
			}
			else if(score1>score2) {
				System.out.println(name1 +" WON THE GAME!!");
			}
			else {
				System.out.println("THE GAME IS TIE!!");
			}
		}

		else {
			System.out.println("You are out of the game!!");
		}

	}
}

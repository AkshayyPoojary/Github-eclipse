package com.aurionpro.pigmodel;

import java.util.Random;
import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		System.out.println("Let's play Pig");
		Scanner sc = new Scanner(System.in);
		Random number = new Random();
		int totalScore = 0;
		int score = 0;
		int turn = 1;

		System.out.println("To play the game role the dice or hold!");
		System.out.println("Turn " + turn);
		while (totalScore < 20) {
			System.out.println("Roll or Hold:(r/h)");
			String ask = sc.next();
//			System.out.println("----------------------------------------------");
//			System.out.println("Your Turn: " + turn);
			if (ask.equalsIgnoreCase("r")) {
				int randomNum = number.nextInt(6) + 1;
				System.out.println("Die :" + randomNum);
				if (randomNum == 1) {
					System.out.println("Turn over. No Score ");
					score = totalScore;
					turn += 1;
					System.out.println("-------------------------------");
					System.out.println("Turn: " + turn);
					
				} else {
					score += randomNum;
					totalScore += score;
					if (score >= 20) {
						System.out.println("Score for turn " + score);
						System.out.println("Total Score: " + totalScore);
						System.out.println("You have finished in " + turn + " turns");
						System.out.println("Game Over!");
					} else {
						System.out.println("Score for turn: " + score);
						System.out.println("Total Score: " + totalScore);

					}
				}

			} else if (ask.equalsIgnoreCase("h")) {
				totalScore = score;
				System.out.println("Turn Score: " + score);
				System.out.println("Total Score: " + totalScore);
				turn += 1;
				System.out.println("Turn: " + turn);

			}
		}
		sc.close();
	}
}

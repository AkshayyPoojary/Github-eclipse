package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToe {

	public static void displayCharacter(char[][] character) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(character[i][j] + "|");
			}
			System.out.print(character[i][2]);
			System.out.println();
			System.out.println("-----");
		}
		for (int j = 0; j < 2; j++) {
			System.out.print(character[2][j] + "|");
		}
		System.out.print(character[2][2]);
		System.out.println();
	}

	public static void main(String[] args) {
		char[][] character = new char[3][3];
		character[0][0] = ' ';
		character[0][1] = ' ';
		character[0][2] = ' ';
		character[1][0] = ' ';
		character[1][1] = ' ';
		character[1][2] = ' ';
		character[2][0] = ' ';
		character[2][1] = ' ';
		character[2][2] = ' ';

		while (true) {

			Scanner sc = new Scanner(System.in);
			displayCharacter(character);
			System.out.println("Player 1 choose row and column:");
			int row1 = sc.nextInt();
			int column1 = sc.nextInt();
			character[row1][column1] = 'X';
			System.out.println();
			displayCharacter(character);
			System.out.println();
			System.out.println("Player 2 choose row and column:");
			int row2 = sc.nextInt();
			int column2 = sc.nextInt();
			character[row2][column2] = 'O';
			System.out.println();
			
		}
	}
}

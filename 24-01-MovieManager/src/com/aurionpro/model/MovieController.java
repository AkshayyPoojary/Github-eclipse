package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieController {
	private MovieManager manager;

	public MovieController() {
		super();
		this.manager = new MovieManager();
	}

	public void start() {
		displayeMenu();
	}

	private void displayeMenu() {
		int choice = 1;
		System.out.println("Wellcome to Movie menu:");
		while (choice != 4) {
			System.out.println("Enter 1 to add movie into menu: ");
			System.out.println("Enter 2 to show movie from menu: ");
			System.out.println("Enter 3 to delete all movies from menu: ");
			System.out.println("Enter 4 to delete all movies from menu: ");
			System.out.println("Enter 5 to Exit movie menu: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Movie movies = setMovieDetails();
				manager.addMovies(movies);
				break;

			case 2:
				List<Movie> movie = manager.getMovies();
				Iterator<Movie> it = movie.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 3:
				System.out.println("Enter ID to remove: ");
				int id=sc.nextInt();
				if(manager.deleteMovies(id)) {
					System.out.println("MOVIE DELETED!!");
				}
				else {
					System.out.println("ID could not be found");
				}
				break;
			case 4:
				if(manager.getMovies().size() !=0) {
					manager.deleteAllMovies();
					System.out.println("ALL MOVIES ARE DELETED!!");
				}
				else {
					System.out.println("NOTHING IS DELETED...LIST IS EMPTY!!");
				}

				break;

			case 5:
				System.out.println("PROGRAM ENDS!!");
				break;
			default:
				System.out.println("INVALID CHOICE!!");
			}
		}
	}

	private Movie setMovieDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie name: ");
		String name = sc.nextLine();
		System.out.println("Enter Movie Year: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Movie Genre: ");
		String genre = sc.nextLine();
		return new Movie(id, name, year, genre);
	}
}

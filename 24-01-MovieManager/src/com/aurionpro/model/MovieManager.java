package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	private List<Movie> movies;
	private static final String filename = "./MovieData/data.bin";

	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();

	}

	public void addMovies(Movie movie) {
		movies.add(movie);
		saveMovie();
		
	}
	public boolean deleteMovies(int id) {

		int index=-1;
		for(int i = 0;i<movies.size();i++){
			if(movies.get(i).getId()==id) {
				index=i;
			}
		}
		if(index!=-1) {
			movies.remove(index);
			saveMovie();
			return true;
		}
		return false;
	}
	
	public void deleteAllMovies() {
		movies.clear();
		saveMovie();
	}


	// deserializationnnnnn
	private void loadMovies() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("filename"));
			Movie serial = (Movie) in.readObject();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

       //serializationnnnnn
	public void saveMovie() {
		try {

			FileOutputStream in = new FileOutputStream("filename");
			ObjectOutputStream out = new ObjectOutputStream(in);
			out.writeObject(movies);
			out.close();
			in.close();
			System.out.println("Data Is successfully serialized");
		} catch (IOException ioe) {
			System.out.println("Exception  " + ioe);
		}
	}

	public List<Movie> getMovies() {
		return movies;
	}

}

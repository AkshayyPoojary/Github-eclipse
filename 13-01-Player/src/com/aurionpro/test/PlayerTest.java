package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {
	 public static void main(String[] args) {
		Player[] players= { 
			new Player("Akshay",23,"indian"),
			new Player("Virat",33,"indian"),
			new Player("Sachin",44,"indian"),
			new Player("Dhoni",39,"indian")
			};
		
		
		for(Player x:players) {
			System.out.println(x);
		}
		System.out.println();
		//clt+1 = batata h ki konsa konsa asign kr skhta h
		System.out.println("Eldest player:");
		Player elderPlayer = players[0].elderPlayer(players); // main method se kiya isiliye obj create kiya
//		 Player elderPlayer= Player.elderPlayer(players); // static h isiliye directly call li class name se .ie Player
		 System.out.println(elderPlayer);
//		 playerWithEldestAge(elderPlayer);
		
	}

	 
	 //bu
//	private static void playerWithEldestAge(Player elderPlayer) {
//		// TODO Auto-generated method stub
//		System.out.println(elderPlayer);
//	}


}

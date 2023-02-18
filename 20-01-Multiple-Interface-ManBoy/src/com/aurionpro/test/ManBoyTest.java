package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boi = new Boy();

		atTheMovies(man);
//		atTheMovies(boi);

		atTheParty(man);
		atTheParty(boi);
	}

	// method
	private static void atTheMovies(IEmotionable ans) {
		ans.laugh();
		ans.cry();

	}

	// method
	private static void atTheParty(IMannerable ans) {
		ans.greetOnArival();
		ans.grettOnDeparture();
	}
}

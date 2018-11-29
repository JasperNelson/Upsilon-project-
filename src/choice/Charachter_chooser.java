package choice;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Charachter_chooser extends CharachterWeapons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		{

			String Welcome = new String("           Vigil games present's.... \n     	       FALEYAD    ");
			for (int i = 0; i < Welcome.length(); i++) { // continues until i=the number of characters in the String
				System.out.print(Welcome.charAt(i)); // charAt() prints one specified letter from a string literal
				Thread.sleep(100L); // in milliseconds
			}
			TimeUnit.SECONDS.sleep(1);

			System.out.println(
					"\n \n \n \n \n \n \n \n \nHi!!! Welcome to FALEYAD \n I am Jasper the developer of this test build of the game \n to start the game type start");
			System.out.print(
					"to exit the game type esc\n to pull up this message again type help \n to see anything about the charachters type Help_ followed by the charachter name \n");

			// System.out.println("Now you will be able to gain insight into the game and
			// the charachters that will soon be availiable. the charachters are\n Wizard\n
			// Warlock\n Occult_Nun\n Mage\n Warrior\n Barbarian \n Archer");
			CharachterStat.cstats();
			// charachter background
			/*
			 * int Outcast; int Medicine_man; int Brawler; int peddler; int Scholar; //
			 * charachter race int Dark_Elf; int Elf; int Half_Elf; int Human; int Dryad;
			 * int Ogre; int Dwarf; // System.out.println("You have chosen the wizard");
			 */

		}
	}

}

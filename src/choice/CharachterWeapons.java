package choice;
import java.util.Scanner;

public class CharachterWeapons extends CharachterStat {
	public static void ChooseWeapons(String x) {
		Scanner Weapon = new Scanner(System.in);
		Scanner Items = new Scanner(System.in);
		Scanner One = new Scanner(System.in);
		Scanner ItemOne = new Scanner(System.in);
		String Weapon1 = "p";
		String Item = "p";
		String Weapon3 = "p";
		while (x.equals("Barbarian") && !(Weapon1.equals("Club")) && !(Weapon1.equals("Staff"))
				&& !(Item.equals("???")) || Item.equals("???")) {

		}
		while (x.equals("Archer") && (!(Weapon1.equals("RudementaryBow")))) {
		atks ++;
			
		}
		while (x.equals("Mage") && !(Weapon1.equals("Staff") && !Weapon1.equals("Dagger"))
				&& !(Item.equals("VisciousSpellBook")) || Item.equals("EnchantingSpellbook")) {
//if correct items are found turn staff to scepter
			System.out.print("Choose your charachters weapon, you can choose a Staff or a Dagger");

			Weapon1 = One.next();
			if (Weapon1.equals("Dagger")) {
				atks ++;
				System.out.println("You now have . . . well . . a knife . . . . what did you think would happen?? Using a Fagger can do 4-6 damage per hit");
				}
				if (Weapon1.equals("Staff")) {
				defences ++;
				System.out.println("You feel significantly more at ease with the staff in your hand");
		}
		while (x.equals("Warlock") && !(Weapon1.equals("Jasper Amulet"))
				&& !(Weapon1.equals("Rose Quartz Amulet")) && !(Weapon1.equals("Emerald Amulet"))
				&& !(Weapon1.equals("Turquoise Amulet")) && !Weapon1.equals("Phosphorus Amulet")
				&& !Weapon1.equals("Wooden Amulet") && !(Item.equals("Staff")) || Item.equals("MediumSpellbook")) {
			System.out.print("Choose your charachters Weapon,"
					+ "you can choose either a Jasper Amulet, a Rose Quartz Amulet, a Turquoise Amulet, a Phosphorus Amulet, or a Wooden Amulet");
			Weapon1 = One.next();
			if (!(Item.equals("Staff")) || Item.equals("MediumSpellbook")
					&& !(!Weapon1.equals("Jasper Amulet") && !Weapon1.equals("Rose Quartz Amulet")
							&& !Weapon1.equals("???") && !Weapon1.equals("Turquoise Amulet")
							&& !Weapon1.equals("Phosphorus Amulet") && !Weapon1.equals("Wooden Amulet"))) {
				if (Weapon1.equals("Wooden Amulet")) {
				constitutions ++;
				System.out.println("You suddenly feel more connected with the world ");
				}
				if (Weapon1.equals("Turquoise Amulet")) {
				defences ++;
				System.out.println("You feel as if you are being given a warm hum");
				}
				if(Weapon1.equals("Jasper Amulet")){
				intelligences ++;
				System.out.println("Your mind now opens to new ideas");
				}
				if(Weapon1.equals("???")){
				wisdoms ++;
				//adds a secret attack which will add many  
				System.out.println("You can feel a comforting hum originating from the Amulet");
				}
				if(Weapon1.equals("Phosphorus Amulet")){
				atks ++;
				System.out.println("The pungent smell of Phospherus fills you with power .... and Disgust");
				}
				if(Weapon1.equals("Rose Quartz Amulet")){
				charismas ++;  
				System.out.println("You suddenly feel different ... ");
				}

			}

		}
		while (x.equals("Occult_Nun") && !Weapon1.equals("Staff") && !(Item.equals("Ehfal"))
				&& Item.equals("Aknf")) {
			Weapon1 = One.next();
		}
		while (x.equals("Warrior") && !Weapon1.equals("Sword") && !(Item.equals("ClimbingGloves"))
				|| Item.equals("Satchel")) {
			Weapon1 = One.next();

		}
		while (x.equals("Wizard") && !Weapon1.equals("Wand") && !(Item.equals("Dagger"))
				|| Item.equals("Dragon Scale")) {
			Weapon1 = One.next();

		}
	}
}
}
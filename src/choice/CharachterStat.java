package choice;

import java.util.Scanner;
import java.util.Random;

/*int  Medicine_man;
	int  Brawler;
	int  peddler;
	int  Scholar; 
	// charachter race
	int Dark_Elf;
	int Elf;
	int Half_Elf;
	int Human;
	int Dryad;
	int Ogre;
	int Dwarf;
	// System.out.println("You have chosen the wizard"); */
public class CharachterStat {
	// TODO Auto-generated constructor stub
	public static String start;
	public static String exit;
	public static Scanner c = new Scanner(System.in);
	public static Scanner crace = new Scanner(System.in);
	public static double atks;
	public static double defences;
	public static double speeds;
	public static double agilitys;
	public static double charismas;
	public static double intelligences;
	public static double constitutions;
	public static double wisdoms;
	public static String weapon;
	public static double weaponSpeed;
	public static int level;
	public static int prevLevel;
	public static double exp;
	public static double prevexp;
	public static double prevHP;
	static int HP;
  public static String x; 
	public String characterType;
	public String Wizard;
	public String Warlock;
	public String Warrior;
	public String Barbarian;
	public String Mage;
	public String Occult_Nun;
	public String Archer;
	public static Scanner scan = new Scanner(System.in);
	public static String choice_charachter = "0";

	public static void cstats() // max stat value= 30 Stat atk value adds on to atk damage which is 1-1000
	{
		exit = "";
		start = "";
		while (!exit.equals("esc")) {
			exit = start = c.next();
			while (start.equals("start") && !exit.equals("esc")) {
				System.out.print(
						"now you can choose your charachters! The charachters are\n Wizard\n Warlock\n Occult_Nun\n Mage\n Warrior\n Barbarian \n Archer");

				while (((!choice_charachter.equals("Mage")) && (!choice_charachter.equals("Barbarian"))
						&& (!choice_charachter.equals("Wizard")) && (!choice_charachter.equals("Warlock"))
						&& (!choice_charachter.equals("Archer")) && (!choice_charachter.equals("Warrior"))
						&& (!choice_charachter.equals("Occult_Nun")))) {
					String choice_charachter = scan.nextLine();
					if (choice_charachter.equals("Mage")) {
						System.out.println("You have chosen the Mage");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Warlock")) {
						System.out.println("You have chosen the Warlock");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Wizard")) {
						System.out.println("You have chosen the wizard");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Warrior")) {
						System.out.println("You have chosen the Warrior");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Archer")) {
						System.out.println("You have chosen the Archer");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Barbarian")) {
						System.out.println("You have chosen the Barbarian");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}
					if (choice_charachter.equals("Occult_Nun")) {
						System.out.println("You have chosen the Occult_Nun");
						Random MWisdom = new Random();
						Random MSpeed = new Random();
						Random MIntelligence = new Random();
						Random MAgility = new Random();
						Random MDefence = new Random();
						Random MConstitution = new Random();
						Random MCharisma = new Random();
						Random MAtk = new Random();
						double alow = 0;
						double ahigh = 4;
						speeds = MSpeed.nextDouble() * (ahigh - alow) + 1;
						double clow = 0;
						double chigh = 3;
						atks = MAtk.nextDouble() * (chigh - clow) + 1;
						double blow = 0;
						double bhigh = 5;
						intelligences = MIntelligence.nextDouble() * (bhigh - blow) + 1;
						double dlow = 0;
						double dhigh = 5;
						agilitys = MAgility.nextDouble() * (dhigh - dlow) + 1;
						double elow = 0;
						double ehigh = 5;
						defences = MDefence.nextDouble() * (ehigh - elow) + 1;
						double flow = 0;
						double fhigh = 1;
						wisdoms = MWisdom.nextDouble() * (fhigh - flow) + 1;
						double hlow = 0;
						double hhigh = 1;
						charismas = MCharisma.nextDouble() * (hhigh - hlow) + 1;
						double glow = 0;
						double ghigh = 5;
						constitutions = MConstitution.nextDouble() * (ghigh - glow) + 1;
						trait charachter = new trait(atks, defences, speeds, agilitys, intelligences, wisdoms,
								charismas, constitutions);
					}

					String Help_Occult_Nun = new String(
							"Occult Nuns are very powerful... \n they can talk to the dead spirits (but cannot Necromance) and can choose from a variety of unique magical abilities and attacks");

					String Help_Archer = new String(
							"Archers are skilled with the crafting of bows. Archers have a hightend range-atk stat at the start of the game \n they are able to camoflage into their surroundings, have quick reflexes, and have a heightened awareness \n ");

					String Help_Warrior = new String(
							"Warriors are knowledgeable of most weapons and are quick with the blade, they have a large melee attack stat boost in the start of the game, additionally warriors can use minor magick spells once they reach a high enough level");

					String Help_Barbarian = new String(
							"Barbarians are very strong men that have knowledge of the wilderness and are very resourceful");

					String Help_Mage = new String(
							"Mage's are spellcasters that are heavaly foucused on magical attacks and are very powerful and controlled");

					String Help_Warlock = new String(
							"Warlocks are spellcasters with very strong magic, their magick is so powerful that it makes it \n hard to control that their magic \n warlocks have Patrons to chose from that can permanently imbue them with otherworldly abilities. ");

					String Help_Wizard = new String(
							"Wizards are spellcasters with a very versatile magic, \n they can learn more types of spells than any other spellcaster");

					if (((choice_charachter.equals("Mage")) || (choice_charachter.equals("Barbarian"))
							|| (choice_charachter.equals("Wizard")) || (choice_charachter.equals("Warlock"))
							|| (choice_charachter.equals("Archer")) || (choice_charachter.equals("Warrior"))
							|| (choice_charachter.equals("Occult_Nun")))) {
						System.out.println("\n atk = " + atks + "\n defence = " + defences + "\n speed = " + speeds
								+ "\n agility = " + agilitys + "\n intelligence = " + intelligences + "\n Wisdom ="
								+ wisdoms + "\n charisma = " + charismas + "\n constitution = " + constitutions); 
							x = choice_charachter;
							CharachterWeapons.ChooseWeapons(x);
					}
						
				
					if (choice_charachter.equals("Help_Wizard")) {
						Help_Wizard = "Wizards are spellcasters with a very versatile magic, \n they can learn more types of spells than any other spellcaster";
						System.out.println(Help_Wizard);
					}

					if (choice_charachter.equals("Help_Warlock")) {
						Help_Warlock = "Warlocks are spellcasters with very strong magic, their magick is so powerful that it makes it \n hard to control their magic \n warlocks have Patrons to chose from that can permanently imbue them with otherworldly abilities. ";
						System.out.println(Help_Warlock);
					}

					if (choice_charachter.equals("Help_Mage")) {
						Help_Mage = "Mage's are spellcasters that are heavaly foucused on magical attacks and are very powerful and controlled";
						System.out.println(Help_Mage);
					}

					if (choice_charachter.equals("Help_Warrior")) {
						Help_Warrior = "Warriors are knowledgeable of most weapons and are quick with the blade, they have a large melee attack stat boost in the start of the game, additionally warriors can use minor magick spells once they reach a high enough level";
						System.out.println(Help_Warrior);
					}

					if (choice_charachter.equals("Help_Barbarian")) {
						Help_Barbarian = "Barbarians are very strong men that have knowledge of the wilderness and are very resourceful, Well-Rounded and Ideal for Beginners";
						System.out.println(Help_Barbarian);
					}

					if (choice_charachter.equals("Help_Archer")) {
						Help_Archer = "Archers are skilled with the crafting of bows. Archers have a hightend range-atk stat at the start of the game \n they are able to camoflage into their surroundings, have quick reflexes, and have a heightened awareness \n ";
						System.out.println(Help_Archer);
					}

					if (choice_charachter.equals("Help_Occult_Nun")) {
						Help_Occult_Nun = "Occult Nuns are very powerful... \n they can talk to the dead spirits (but cannot Necromance) and can choose from a variety of unique magical abilities and attacks";
						System.out.println(Help_Occult_Nun);
					}

				}
			}
		}
	}
}

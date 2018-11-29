package choice;
   
  
public class trait {
public double atk;
public double defence;
double speed;
public double agility;
public double charisma;
public double intelligence;
public double constitution;
public double wisdom;
public trait(double catk, double cdefence, double cspeed, double cagility, double cintelligence, double cwisdom, double ccharisma, double cconstitution){
atk=catk;
defence=cdefence;
speed=cspeed;
agility=cagility;
intelligence=cintelligence;
wisdom=cwisdom;
charisma= ccharisma;
constitution= cconstitution;
}

public void increaseAtk(double increase)
{
	atk += increase;
}
}

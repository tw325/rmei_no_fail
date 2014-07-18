/* Homework Assignment:
	Make a class called Character
	Give values of health, atk, and def
	Create three characters
	Print stats
	Make a battle simulation
*/
class character1{
	int hp,atk,def;
	//========================================= CONSTRUCTOR =================================================
	public character1(int h,int a,int d){
		hp = h;
		atk = a;
		def = d;
	}
	//========================================= METHODS ================================================
	public int getHp(){
		return hp;
	}
	public int getAtk(){
		return atk;
	}
	public int getDef(){
		return def;
	}
	/*
	// If a rouge attacks a character, then this will happen
	public int actionAttackedbyRouge(){
		int n;
		n = (hp - (10 - def)); // the attack value of the rouge is 10. the hp and def values are defined by the characters.
		return n; 
	}
	// If a warrior attacks a character, then this will happen
	public int actionAttackedbyWarrior(){
		int n;
		n = (hp - (5 - def)); // attack value of warrior is 5
		return n; // returns the value of the new hp
	}	
	// If a giant attacks a character, then this will happen
	public int actionAttackedbyGiant(){
		int n;
		n = (hp - (5 - def));
		return n;
	}
	public String keepFighting(int n){
		if (n <= 0) {
			return "Rest in Pepperonis.";
		} else {
			return "He can continue fighting!";
		}
	}
	*/
	//TRY THESE METHODS
	 
	public void setHp(int h){
		hp = h;
	}
	public void attack(character1 c1){
		int thisATK = atk;
		int c1HP = c1.getHp();
		int c1DEF = c1.getDef();
		c1.setHp(c1HP-(thisATK - c1DEF));
		if (c1.getHp() <=0){
			System.out.println("Rest in Pepperonis");
		}
	}
	
	// ======================================== MAIN METHOD ================================================
	public static void main(String[] args){
		character1 Warrior = new character1(10,5,5);
		/*
		character1 Rouge = new character1(5,10,5);
		character1 Giant = new character1(5,5,10);
		character1 Warrior2 = new character1(8,8,8);
*/
		Warrior2.attack(Warrior);
		System.out.println(Warrior.getHp());

/*

		System.out.println("WARRIOR- HP:" + Warrior.getHp() + " ATK:" + Warrior.getAtk() + " DEF:" + Warrior.getDef());
		System.out.println("ROUGE- HP:" + Rouge.getHp() + " ATK:" + Rouge.getAtk() + " DEF:" + Giant.getDef());
		System.out.println("GIANT- HP:" + Giant.getHp() + " ATK:" + Giant.getAtk() + " DEF:" + Rouge.getDef());
		System.out.println(" ");
		*/
	// ====================================== BATTLE SIMULATION =============================================
/*
		System.out.println("Its tussle time!");
		// The warrior is attacked by the rouge giving the warrior a new hp
		System.out.println("Warrior has been attacked by Rouge. His health is now:");
		System.out.println(Warrior.actionAttackedbyRouge()); 
		// The aftermath of fighting the rouge
		System.out.println(Warrior.keepFighting(Warrior.actionAttackedbyRouge()));

		// warrior attacked by warrior.
		// in this case the warrior doesnt take damage bcuz it returns 10
		System.out.println("Warrior has been attacked by Warrior. His health is now:");
		System.out.println(Warrior.actionAttackedbyWarrior());
		//The aftermath of fighting the warrior
		System.out.println(Warrior.keepFighting(Warrior.actionAttackedbyWarrior()));

		//warrior attacked by giant.
		//same as warrior attacking warrior
		System.out.println("Warrior has been attacked by Giant. His health is now:");
		System.out.println(Warrior.actionAttackedbyGiant());
		// The aftermath of fighting the giant
		System.out.println(Warrior.keepFighting(Warrior.actionAttackedbyGiant()));

		//rouge is attacked by rouge
		System.out.println("Rouge has been attacked by Warrior. His health is now:");
		System.out.println(Rouge.actionAttackedbyRouge());
		// The sad aftermath of fighting the rouge
		System.out.println(Rouge.keepFighting(Rouge.actionAttackedbyRouge()));


*/
	}

}

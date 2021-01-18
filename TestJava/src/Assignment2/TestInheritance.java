package Assignment2;

public class TestInheritance {

		public static void main(String[] args) {
		Lord sam = new Lord("Sam");
		Lord joe = new Lord("Joe");
		Lord janet = new Lord("Janet");
		PersonWithStrength randy = new PersonWithStrength("Randolf the Elder", 250);
		PersonWithStrength barclay = new PersonWithStrength("Barclay the Bold", 300);
		Swordsman hardy = new Swordsman("TuckTuckTheHardy", 60);
		Swordsman stout = new Swordsman("TuckTuckTheStout", 40);
		Archer samantha = new Archer("Samantha", 50);
		Archer pethora = new Archer("Pethora", 50);
		Wizard thora = new Wizard("Thorapleth", 70);
		System.out.println(samantha.equals(pethora));
		sam.hire(samantha);
		janet.hire(hardy);
		janet.hire(stout);
		janet.hire(thora);
		joe.battle(randy);
		joe.battle(sam);
		janet.battle(barclay);
		janet.hire(samantha);
		janet.hire(pethora);
		janet.battle(barclay);
		sam.battle(barclay);
		joe.battle(barclay);
		thora.runaway();
		System.out.println(sam);
		System.out.println(joe);
		System.out.println(janet);
		System.out.println(randy);
		System.out.println(barclay);
		Swordsman hadry_1 = hardy;
		System.out.println(hadry_1);
		System.out.println(samantha.hashCode());
		}
}


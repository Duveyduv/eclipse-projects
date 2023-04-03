package asg6sp23Test;

import asg6sp23.Druid;
import asg6sp23.Mage;
import asg6sp23.Warrior;
import asg6sp23.Character;

public class GameDriver 

{
	
	public static void main(String[] args)
	
	{
		
		// Instantiation of objects
		Warrior war1 = new Warrior("Brandon", 100, 50, 75);
		Mage mage1 = new Mage("Jake", 50, 100, 75);
		Druid druid1 = new Druid("Dove", 75, 50, 50, 50);
		
		// Enemies instantiations of abstract class
		Character skeleton = new Character("Skeleton", 25, 5);
		Character zombie = new Character("zombie", 30, 10);
		Character goblin = new Character("Goblin", 40, 35);
		
		
		
		// Main attacks with toString to prove the attacks do damage and the healing spell works.
		war1.swordAttack(skeleton);
		
		System.out.println("\n" + skeleton.toString());

		mage1.fireballSpell(zombie);
		
		System.out.println("\n" + zombie.toString());

		goblin.attack(war1);
		
		System.out.println("\n" + war1.toString());

		druid1.heal(war1);
		
		System.out.println("\n" + war1.toString());
		
		druid1.swordAttack(goblin);
		
		System.out.println("\n" + goblin.toString());
		
	}

}

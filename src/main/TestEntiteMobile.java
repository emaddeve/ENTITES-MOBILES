package main;

/**
 * ce programe propose de créer des entités mobiles se déplaçant dans un monde à
 * deux dimensions en suivant un certain comportement de déplacement via le
 * pattern Strategy.
 * 
 * @author emad
 * @version 1.0
 * @since 2015-12-31
 *
 */

public class TestEntiteMobile {

	public static void main(String[] args) {

		Monde monde = new Monde();

		Monde.addEntiteMobile(new EntiteMobile(5, 2));
		Monde.addEntiteMobile(new EntiteMobile(20, 30));

		monde = new Monde(new ToutDroit("gauche"));
		monde.lanceIterations(3);

		monde = new Monde(new ComportementAleatoire(2, 10));
		monde.lanceIterations(3);

		monde = new Monde(ComportementCyclique.creeComportement(-1, 1, 1, 1));
		monde.lanceIterations(3);

		monde = new Monde(
				new ComportementCombiné(ComportementCyclique.creeComportement(1, 0, 1, 0), new ToutDroit("droite")));
		monde.lanceIterations(3);

		// monde1.lanceIterations(3);

	}

}

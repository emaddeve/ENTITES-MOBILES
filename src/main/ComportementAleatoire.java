
package main;

import java.util.Random;

/**
 * Un ComportementAleatoire qui implements l'interface Comportement renvoie à
 * chaque fois un nouveau mouvement aléatoire dont les valeurs x et y sont
 * choisies aléatoirement et individuellement entre –valMax et +valMax,
 * paramètre passé au constructeur.
 * 
 * @author emad
 */
public class ComportementAleatoire implements Comportement {
	/**
	 * generator et un instance de la class java.util.Random pour generate un
	 * Aleatoire value
	 */
	Random generator = new Random();
	Movement move;

	int valMax, valMin;

	/*
	 * un constructor ComportementAleatoire qui prend deux param valMax et
	 * valMin.
	 * 
	 * @param valMax un nombre pour passer a generator.
	 * 
	 * @param valMin un nombre pour passer a generator.
	 */
	public ComportementAleatoire(int valMax, int valMin) {

		this.valMax = valMax;
		this.valMin = valMin;

	}

	/**
	 * Override le method de l'interface Comportement. ici le method generate a
	 * Random nombre et l'ajoute un fois au position Vertical et un fois au
	 * position horizontal
	 */
	@Override
	public Movement getProchainMouvement(int x, int y, int n) {
		try {
			System.out.println(this);
			for (int i = 0; i < n; i++) {
				Thread.sleep(1000);
				x = (generator.nextInt(valMax) + valMin) + x;
				y = (generator.nextInt(valMax) + valMin) + y;
				move = new Movement(x, y);

			}
			return move;
		} catch (InterruptedException ie) {
			return null;
		}

	}

	/**
	 * La méthode toString est utilisée pour obtenir un objet String
	 * représentant la valeur de l'objet Nombre.
	 * 
	 */
	public String toString() {
		return "Comportement Atealoire";
	}
}

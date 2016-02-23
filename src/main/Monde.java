package main;

import java.util.ArrayList;

/**
 * la class Monde est le class qui utilise les class comportement pour repondre
 * a la class TestEnitieMobile
 * 
 * @author emad
 *
 */
public class Monde {
	// ArrayList qui contenues les entités mobiles.
	private Comportement comportement;
	static ArrayList<EntiteMobile> em;

	public Monde() {
		em = new ArrayList<EntiteMobile>();
	}

	public Monde(Comportement c) {
		this.comportement = c;
		// addEntiteMobile(em);
		// lanceIterations(5);

	}

	/**
	 * addEntiteMobile method permet d'ajouter des entite a la list
	 * 
	 * @param e
	 *            instance de type EntiteMobile
	 */

	public static void addEntiteMobile(EntiteMobile e) {
		em.add(e);
	}

	/**
	 * addEntiteMobile method permet de supprime des entite a la list
	 * 
	 * @param e
	 *            instance de type EntiteMobile
	 */
	public static void removeEntiteMobile(EntiteMobile e) {
		em.remove(e);
	}

	/*
	 * lancIterations method permet de lancer n fois le déplacement de toutes
	 * les entités mobiles contenues
	 */
	public void lanceIterations(int n) {
		for (int i = 0; i < em.size(); i++) {

			// System.out.println("movement for the EntiteMobile number "+i);
			System.out.println("\nmovement for the EntiteMobile number " + i + " E(" + em.get(i).getX() + ","
					+ em.get(i).getY() + ")");

			int x = em.get(i).getX();
			int y = em.get(i).getY();

			comportement.getProchainMouvement(x, y, n);

		}
	}
}

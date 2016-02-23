package main;

/**
 * interface Comportement définir une action pour avoir le prochain movement
 * 
 * @author emad
 *
 */
public interface Comportement {
	/**
	 * getProchainMouvement est une method qui prend 3 param et elle donne le
	 * prochain position.
	 * 
	 * @param x
	 *            le position horizontal de l'entite
	 * @param y
	 *            le position Vertical de l'entite
	 * @param n
	 *            le nombre de fois que le method va lancer.
	 * @return un instance de type Mouvement.
	 */
	public Movement getProchainMouvement(int x, int y, int n);

}

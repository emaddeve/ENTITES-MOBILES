package main;

/**
 * la class Enitie Mobile represent un entite avec deux dimension.
 * 
 * @author emad
 *
 */

public class EntiteMobile {

	private int x;
	private int y;

	/**
	 * Constractor qui prend deux param
	 * 
	 * @param x
	 *            le position horizontal de l'entite
	 * @param y
	 *            le position Vertical de l'entite
	 */
	public EntiteMobile(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	 * setX method permet de set le value de x.
	 * 
	 * @param x
	 *            le position horizontal de l'entite
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * getX method permet de récupérer le value de X
	 */
	public int getX() {
		return x;
	}

	/**
	 * setX method permet de set le value de x.
	 * 
	 * @param y
	 *            le position Vertical de l'entite.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * getY method permet de récupérer le value de Y
	 */
	public int getY() {
		return y;
	}

}

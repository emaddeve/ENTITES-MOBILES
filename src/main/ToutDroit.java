package main;

/*
 * La classe ToutDroit permet de créer un comportement allant indéfiniment dans une des
 *4 directions prédéfinies vers le haut, vers la bas, vers la gauche ou vers la droite.
 */
public class ToutDroit implements Comportement {
	String Direction;
	Movement move;

	/**
	 * Constractor qui prend un param de type String pour definie le direction
	 * souhaiter.
	 * 
	 * @param Direction
	 *            le direction de mouvement.
	 */
	public ToutDroit(String Direction) {
		this.Direction = Direction;
	}

	/**
	 * l'appel à getProchainMouvement() renvoie une instance de Mouvement une
	 * entité utilise ce method va se deplacer vers le direction souhaiter qui
	 * determine par le param Direction passer via le constractor.
	 */
	@Override
	public Movement getProchainMouvement(int x, int y, int n) {
		try {
			System.out.println(this);

			for (int i = 0; i < n; i++) {
				Thread.sleep(1000);
				switch (Direction) {
				case "haut":
					move = new Movement(x, ++y);

					break;
				case "bas":

					move = new Movement(x, --y);

					break;
				case "gauche":
					move = new Movement(--x, y);

					break;
				case "droite":
					move = new Movement(++x, y);

					break;
				default:
					System.out.println("Wrong Direction");
					break;

				}

			}
			return move;
		} catch (InterruptedException ie) {

		}
		return null;

	}

	/**
	 * La méthode toString est utilisée pour obtenir un objet String
	 * représentant la valeur de l'objet Nombre.
	 */

	public String toString() {
		return "Comportement ToutDroit";
	}
}

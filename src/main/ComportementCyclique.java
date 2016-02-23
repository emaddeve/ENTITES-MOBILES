package main;

/**
 * La classe ComportementCyclique permet d'itérer à l'infini un motif.
 * 
 * @author emad
 *
 */
public class ComportementCyclique implements Comportement {

	private Movement move;
	int x, y, dx, dy;

	/**
	 * un constructor ComportementCyclique qui prend quatre param de type int
	 * qui represente deux point.
	 * 
	 * @param x
	 *            le position horizontal de la premiere point
	 * @param y
	 *            le position Vertical de la premiere point
	 * @param dx
	 *            le position horizontal de la deuxième point
	 * @param dy
	 *            le position Vertical de la deuxième point
	 */
	private ComportementCyclique(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;

	}

	/**
	 * l'appel à getProchainMouvement() renvoie une instance de Mouvement une
	 * entité utilise ce method va se deplacer entre deux point.
	 */
	@Override
	public Movement getProchainMouvement(int x, int y, int n) {
		System.out.println(this);
		try {
			for (int i = 0; i < n; i++) {
				Thread.sleep(1000);
				x += this.x;
				y += this.y;
				move = new Movement(x, y);
				x += dx;
				y += dy;
				move = new Movement(x, y);

			}

			return move;
		} catch (InterruptedException ie) {
			return null;
		}
	}

	/*
	 * 
	 * un static factory method qui renvoi un instance de la class-meme
	 * 
	 */
	public static final ComportementCyclique creeComportement(int x, int y, int dx, int dy) {
		return new ComportementCyclique(x, y, dx, dy);
	}
	/*
	 * un static factory method qui renvoi un inverse instance de la class-meme
	 */

	public static final ComportementCyclique creeComportementInverse(int x, int y, int dx, int dy) {
		x = x * -1;
		y = y * -1;
		dx = dx * -1;
		dy = dy * -1;
		return new ComportementCyclique(x, y, dx, dy);
	}

	/**
	 * La méthode toString est utilisée pour obtenir un objet String
	 * représentant la valeur de l'objet Nombre.
	 */

	public String toString() {
		return "ComportementCyclique";
	}

}

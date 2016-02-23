package main;

/*
 * La classe ComportementCombiné implements l'interface Comportement
 * et permet de combiner deux comportements : 
 */
public class ComportementCombiné implements Comportement {
	Comportement c1, c2;
	Movement move, move1, move2;

	/*
	 * un constructor ComportementCombine qui prend deux param de type
	 * Comportement
	 */
	public ComportementCombiné(Comportement first, Comportement second) {
		this.c1 = first;
		this.c2 = second;
	}

	/**
	 * l'appel à getProchainMouvement() renvoie une instance de Mouvement qui
	 * est la somme (vecto- rielle) de chaque getProchainMouvement() de le
	 * Comportement qui etait passse a la contractor
	 */
	@Override
	public Movement getProchainMouvement(int x, int y, int n) {

		move = c1.getProchainMouvement(x, y, n);
		System.out.println("");

		move1 = c2.getProchainMouvement(x, y, n);
		System.out.println("");
		System.out.println(this);
		x += (move.x - x) + (move1.x - x);
		y += (move.y - y) + (move1.y - y);
		move2 = new Movement(x, y);

		return move2;
	}

	/**
	 * La méthode toString est utilisée pour obtenir un objet String
	 * représentant la valeur de l'objet Nombre.
	 */
	public String toString() {
		return "ComportementCombiné";
	}

}

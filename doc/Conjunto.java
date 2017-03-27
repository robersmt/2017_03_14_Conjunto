


package org.tunombre.gradle;


import java.util.ArrayList;

public class Conjunto {

	private static int NO_ESTA = -1;
	private ArrayList<Double> elementos;

	public Conjunto() {
		elementos = new ArrayList<Double>();
	}

	public String aTexto() {
		StringBuilder texto = new StringBuilder();
		for (double v : elementos) {
			texto.append(" ").append(v);
		}
		return texto.toString();
	}

	public void vaciar() {
		elementos.clear();
	}

	public int talla() {
		int t = this.elementos.size();
		return t;
	}

	private int donde(double v) {
		for (int i = 0; i <= elementos.size() - 1; i++) {
			if (elementos.get(i) == v) {
				return i;
			}
		}
		return NO_ESTA;
	}

	public boolean contiene(double v) {
		int u = this.donde(v);
		if (u == NO_ESTA) {
			return false;
		}
		return true;
	}

	public void anyadir(double v) {
		boolean u = this.contiene(v);
		if (u == false) {
			elementos.add(v);
		}
	}//() 

	public void eliminar(double v) {
		int i = this.donde(v);
		if (i != NO_ESTA) {
			elementos.remove(i);
		}
	}

	public Conjunto unir(Conjunto a) {
		Conjunto union = new Conjunto();
		for (int i = 0; i <= a.talla() - 1; i++) {
			union.anyadir(elementos.get(i));
		}
		for (int i = 0; i <= a.talla() - 1; i++) {
			union.anyadir(a.elementos.get(i));
		}
		return union;
	}

}

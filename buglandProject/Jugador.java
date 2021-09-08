package buglandProject;

public class Jugador extends Personaje {
	// atributes
	private int numeroBotiquines;

	public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
		super(nombre, sexo, posicionX, posicionY, damage);
		this.setNumeroBotiquines(0);
	}

	// methods
	public void moverDerecha(double d) {
		double nuevaPosicionX = this.getPosicionX() + d;
		this.setPosicionX(nuevaPosicionX);

	}

	public void moverIzquierda(double d) {
		double nuevaPosicionX = this.getPosicionX() - d;
		this.setPosicionX(nuevaPosicionX);

	}

	public void moverArriba(double d) {
		double nuevaPosicionY = this.getPosicionY() + d;
		this.setPosicionY(nuevaPosicionY);

	}

	public void moverAbajo(double d) {
		double nuevaPosicionY = this.getPosicionY() - d;
		this.setPosicionY(nuevaPosicionY);

	}

	public void recogerBotiquin() {
		numeroBotiquines += 1;

	}

	public void usarBotiquin() {
		if (numeroBotiquines > 0) {
			if (this.getVida() + 5 > 100) {
				numeroBotiquines--;
				this.setVida(100);
			} else {
				numeroBotiquines--;
				double masVidaBotiquin = this.getVida() + 5;
				this.setVida(masVidaBotiquin);
			}

		}

	}

	public void golpear(Enemigo p) {
		super.golpear(p);
		p.evolucionar();

	}
//	public void golpear(Personaje p) {		
//
//	}

	public int getNumeroBotiquines() {
		return numeroBotiquines;
	}

	public void setNumeroBotiquines(int numeroBotiquines) {
		this.numeroBotiquines = numeroBotiquines;
	}
}

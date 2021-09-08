package buglandProject;

public class Personaje {
	// atributes
	private String nombre;
	private char sexo;
	private double posicionX;
	private double posicionY;
	private double damage;
	private double vida;

	// build method

	public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
		this.setNombre(nombre);
		this.setSexo(sexo);
		this.setPosicionX(posicionX);
		this.setPosicionY(posicionY);
		this.setDamage(damage);
		this.setVida(100);
	}

	// methods
	public void golpear(Personaje p) {
		double d = calcularDistanciaRespectoPersonaje(p);
		double impacto = this.damage / d;
		p.recibirImpacto(impacto);

	}

	public void recibirImpacto(double d) {
		if (this.vida >= d) {
			this.vida -= d;
		} else if (this.vida < d) {
			this.vida = 0;
		}

	}

	public double calcularDistanciaRespectoPersonaje(Personaje p) {

		// para obtener la posicion usamos teorema de pitagoras
		double rectaX = p.posicionX - this.posicionX;
		double rectaY = p.posicionY - this.posicionY;
		rectaX = rectaX * rectaX;
		rectaY = rectaY * rectaY;

		double distancia = Math.sqrt(rectaX + rectaY);

		return distancia;

	}

	// getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

}

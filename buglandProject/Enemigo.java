package buglandProject;

public class Enemigo extends Personaje {
	// atributes
	private int evolucionesAplicadas;
	private int resistencia;

	public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
		super(nombre, sexo, posicionX, posicionY, damage);
		this.setEvolucionesAplicadas(0);
		this.setResistencia(1);
	}

	// methods
	public void evolucionar() {
		if (this.getVida()<=30 && this.getEvolucionesAplicadas() == 0) {
			double masDamage = this.getDamage() + 20;
			int masEvoluciones = this.getEvolucionesAplicadas() + 1;
			this.setDamage(masDamage);
			this.setEvolucionesAplicadas(masEvoluciones);
			
		}
		
		if(this.getVida()<= 10 && this.getEvolucionesAplicadas() == 1) {
			int masResistencia = this.getResistencia()+1;
			int masEvoluciones = this.getEvolucionesAplicadas() + 1;
			this.setResistencia(masResistencia);
			this.setEvolucionesAplicadas(masEvoluciones);
			
		}
		

	}

	@Override
	public void recibirImpacto(double d) {
		
		if (this.getEvolucionesAplicadas()==2) {
			
			double vidaMasResistencia = d/2;
			super.recibirImpacto(vidaMasResistencia);
			
			
		}else {	
			super.recibirImpacto(d);
		}
		
		

	}
	// getter and setter

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getEvolucionesAplicadas() {
		return evolucionesAplicadas;
	}

	public void setEvolucionesAplicadas(int evolucionesAplicadas) {
		this.evolucionesAplicadas = evolucionesAplicadas;
	}
}

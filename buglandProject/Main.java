package buglandProject;

public class Main {

	public static void main(String[] args) {
		Jugador j = new Jugador("Exploradora", 'f', -1, -1, 130);
		Enemigo e = new Enemigo("Virico", 'f', 1, 1, 120);
		
		System.out.println("Inicio");
		
		j.golpear(e);
		j.golpear(e);
		
		
		j.usarBotiquin();
		
	
		
		j.recogerBotiquin();
		j.usarBotiquin();
		j.moverArriba(2);
	
		e.golpear(j);

	}

	public static void estado(Jugador p) {
		System.out.println("\n-------------------");
		System.out.println("nombre " + p.getNombre());
		System.out.println("posicion (x, y): (" + p.getPosicionX() + ", " + p.getPosicionY() + ")");
		System.out.println("daño: " + p.getDamage());
		System.out.println("vida: " + p.getVida());
		System.out.println("Botiquines: " + p.getNumeroBotiquines());
		System.out.println("-------------------\n");
	}

	public static void estado(Enemigo p) {
		System.out.println("\n-------------------");
		System.out.println("nombre " + p.getNombre());
		System.out.println("posicion (x, y): (" + p.getPosicionX() + ", " + p.getPosicionY() + ")");
		System.out.println("daño: " + p.getDamage());
		System.out.println("vida: " + p.getVida());
		System.out.println("Evoluciones: " + p.getEvolucionesAplicadas());
		System.out.println("Resistencia: " + p.getResistencia());
		System.out.println("#####################\n");
	}

}

package simCard;

public class Main {

	public static void main(String[] args) {
		SIMCard cliente = new SIMCard("3015328969");
		
		cliente.recargarSaldo(50000);
		
		cliente.comprarDatos(12);
		cliente.consumirDatos(3);
		cliente.gestionarEncendidoCelular();
		cliente.llamar(120);
		cliente.gestionarModoAvion();
		cliente.gestionarDatos();
		cliente.gestionarModoAvion();
		cliente.gestionarDatos();
		cliente.consumirDatos(3);
		cliente.gestionarEncendidoCelular();
		imprimirEstado(cliente);

	}

	public static void imprimirEstado(SIMCard cliente) {
		String empresa = cliente.getEmpresaTelefonia();
		double saldo = cliente.getSaldo();
		String numero = cliente.getNumeroTelefono();
		boolean celularApagado = cliente.isCelularApagado();
		boolean modoAvion = cliente.isModoAvionActivado();
		boolean datosActivos = cliente.isDatosActivados();
		int saldoDatos = cliente.getSaldoDatos();

		String fmt = "\n---------------------------------\n" + "Empresa telefonia: %s\n" + "Saldo: %.0f\n"
				+ "Numero de telefono: %s\n" + "Celular apagado: %b\n" + "Modo avion: %b\n" + "Datos activos: %b\n"
				+ "Saldo datos: %d\n";
		System.out.printf(fmt, empresa, saldo, numero, celularApagado, modoAvion, datosActivos, saldoDatos);
	}

}

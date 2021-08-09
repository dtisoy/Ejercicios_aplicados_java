package simCard;

public class SIMCard {
	// atributos
	private String empresaTelefonia;
	private double saldo;
	private String numeroTelefono;
	private boolean celularApagado;
	private boolean modoAvionActivado;
	private boolean datosActivados;
	private int saldoDatos;

	public SIMCard(String numeroTelefono) {
		this.empresaTelefonia = "HI";
		this.saldo = 0;
		this.numeroTelefono = numeroTelefono;
		this.celularApagado = true;
		this.modoAvionActivado = false;
		this.datosActivados = false;
		this.saldoDatos = 0;
	}
	// métodos

	public void comprarDatos(int c) {
		double valor = 0;
		int gb = c;
		// 10 0 menos: GB a 3000
		if (c <= 10) {
			valor = c * 3000;
		} else if (c <= 30) {
			// hasta 10: 3000 y 11 a 30 a 2500
			// valor de 10 = 30000
			c -= 10; // ya sabemos el valor de 10GB
			valor = (c * 2500) + 30000;
		} else if (c > 30) {
			// hasta 20: 3000 y más de 30: 1500
			// valor de 20 = 60000
			c -= 20;
			valor = (c * 1500) + 60000;

		}

		// solo comprarDatos si hay suficiente saldo
		if (valor < this.saldo) {
			this.saldo -= valor;
			this.saldoDatos += gb;
		}

	}

	public void consumirDatos(int c) {
		if (this.celularApagado == false && this.modoAvionActivado == false) {
			// solo usar si hay suficiente saldoDatos
			if (this.saldoDatos > c) {
				this.saldoDatos -= c;
			}
		}

	}

	public void llamar(int s) {
		double valor = 0;
		
		if (this.celularApagado == false && this.modoAvionActivado == false) {
			if (s<=60) {
				// llamada <= 60s = 1 peso cd s
				valor = s*1;
			}else {
				// llamada > 60s: 60s = 60 pesos y el resto a (1/2) pesos
				s-=60;
				valor = (s*0.5)+60;
				
			}
			
			// solo llamar si hay suficiente saldo
			if (this.saldo > valor) {
				this.saldo -= valor;
			}

		}

	}

	public void recargarSaldo(double s) {
		this.saldo += s;

	}

	public void gestionarEncendidoCelular() {
		// enciende el celular
		if (this.celularApagado == true) {
			celularApagado = false;
		} else {
			celularApagado = true;
			modoAvionActivado = false;
			datosActivados = false;
		}

	}

	public void gestionarModoAvion() {
		// comprar que el celular este encendido
		if (this.celularApagado == false) {
			// modo avion activo, los datos se apagan
			if (this.modoAvionActivado == false) {
				modoAvionActivado = true;
				datosActivados = false;
			} else {
				modoAvionActivado = false;// desactiva el modo avion
			}
		}

	}

	public void gestionarDatos() {
		// el celular debe estar encendido y el modo avion apagado
		if (this.celularApagado == false && this.modoAvionActivado == false) {
			if (this.datosActivados == true) {
				this.datosActivados = false;
			} else {
				this.datosActivados = true;
			}

		}

	}

	// getters
	public String getEmpresaTelefonia() {
		return this.empresaTelefonia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public boolean isCelularApagado() {
		return this.celularApagado;
	}

	public boolean isDatosActivados() {
		return this.datosActivados;
	}

	public boolean isModoAvionActivado() {
		return this.modoAvionActivado;
	}

	public int getSaldoDatos() {
		return this.saldoDatos;
	}
	
}

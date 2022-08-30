package taller3.televisores;

public class TV {
	private static int numTV;
	private Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	private Control control;
	
	public TV(Marca m, boolean e) {
		this.marca = m;
		this.estado = e;
		numTV++;
	}
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void setMarca(Marca m) {
		this.marca = m;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control c) {
		this.control = c;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if (this.estado = true) {
			if (volumen >= 1 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		if (this.estado = true) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado == true) {
			if (canal >= 1 && canal < 120) {
				this.setCanal((this.canal) + 1);
			}
		}
	}
	
	public void canalDown() {
		if (estado == true) {
			if (canal > 1 && canal <= 120) {
				this.setCanal((this.canal) - 1);
			}
		}
	}
	
	public void volumenUp() {
		if (estado == true) {
			if (volumen >= 1 && volumen < 7) {
				this.setVolumen((this.volumen) + 1);
			}
		}
	}

	public void volumenDown() {
		if (estado == true) {
			if (volumen > 1 && volumen <= 7) {
				this.setVolumen((this.volumen) - 1);
			}
		}
	}
}

package taller3.televisores;

public class Control {
	private TV tv;

	public TV getTv() {
		return tv;
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void canalUp() {
		if (tv.estado == true) {
			if (tv.canal < 120) {
				tv.setCanal(tv.canal + 1);
			}	
		}
	}
	
	public void canalDown() {
		if (tv.estado == true) {
			if (tv.canal > 1) {
				tv.setCanal(tv.canal - 1);
			}	
		}
	}
	
	public void volumenUp() {
		if (tv.estado == true) {
			if (tv.volumen < 7) {
				tv.setVolumen(tv.volumen + 1);
			}
		}
	}

	public void volumenDown() {
		if (tv.estado == true) {
			if (tv.volumen > 1) {
				tv.setVolumen(tv.volumen - 1);
			}
		}
	}
	
	public void setCanal(int canal) {
		if (tv.estado == true) {
			if (this.tv.canal <= 120) {
				tv.setCanal(canal);
			}
		}
	}
}

package died.lab01.problema01;

public class Punto {
	
	float x;
	float y;
	
	public Punto(float x, float y){
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float nuevoValor) {
		this.x = nuevoValor;
	}

	public float getY() {
		return y;
	}

	public void setY(float nuevoValor) {
		this.y = nuevoValor;
	}
	
	public boolean equals(Punto punto) {
		if(punto instanceof Punto && punto.x==punto.y) {
			return true;
		}else {
			return false;
		}
	}
	
}

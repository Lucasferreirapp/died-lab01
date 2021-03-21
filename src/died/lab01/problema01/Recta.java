package died.lab01.problema01;

public class Recta {
	
	Punto p1;
	Punto p2;
	
	public Recta(Punto p1,Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public float pendiente() {
		float m = (this.p2.y - this.p1.y)/(this.p2.x - this.p1.x);
		return m;
	}
	
	public boolean paralelas(Recta otraRecta) {
		if(this.pendiente() == otraRecta.pendiente()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Recta otraRecta) {
		if(otraRecta instanceof Recta && this.paralelas(otraRecta)) {
			Recta aux = new Recta(this.p1 , otraRecta.p1);
			if(aux.paralelas(otraRecta)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
}

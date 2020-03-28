package Bycycle;

public class Bicycle {
	String bearing;
	
	public Bicycle() {
		this.bearing = "北";
	}

	public void setBearing(String direction) {
		this.bearing = direction;
	}

	public void turnLeft() {
		if ("北".equals(this.bearing)) {
			this.bearing = "西";
		}
		if ("西".equals(this.bearing)) {
			this.bearing = "南";
		}
		if ("南".equals(this.bearing)) {
			this.bearing = "東";
		}
		if ("東".equals(this.bearing)) {
			this.bearing = "北";
		}

		System.out.println("左へ曲がったので" + this.bearing + "を向きました");

	}

	public void turnRight() {

	}

	public void display() {

	}
}

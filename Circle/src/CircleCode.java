public class CircleCode {

	private double radius;
	private double Area;

	public CircleCode(double radius) {
		this.radius = radius;
		Area = (radius * radius) * Math.PI;
	}

	public double getRadius() {
		this.radius = Area / (Math.PI * radius);
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		setArea(radius);
	}

	public double getArea() {
		return Area;
	}

	public void setArea(double Area) {
		this.radius = Math.sqrt(Area/Math.PI);
		this.Area = Area;
	}

}


public class DriverMain {

	public static void main(String[] args) {
		CircleCode n = new CircleCode(2);
		
		System.out.println(n.getArea());
		
		n.setRadius (3);
		
		System.out.println(n.getArea());
		
		n.setArea (1);

		System.out.println(n.getRadius());
	}

}

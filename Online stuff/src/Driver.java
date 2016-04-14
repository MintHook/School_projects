
public class Driver {
	public static void main(String[] args) {
        try {
                String result = Fetch.getHTML("www.google.com");
                System.out.println(result);
        } catch (Exception ex) {
                ex.printStackTrace();
        }
}
}
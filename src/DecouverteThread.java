
public class DecouverteThread {

	public static void main(String[] args) throws InterruptedException {
		for (int i=0; i<300; i++) {
			Thread.sleep(500);
			if (i % 2 == 0) { coucou (i); } 
			if (i % 3 == 0) { jAiFaim (i); }
			System.out.println(" !");
		} // for
	} // main
	
	private static void coucou (int i) {
		System.out.print("Coucou");  
	} // coucou

	private static void jAiFaim (int i) {
		System.out.print(" J'ai faim ! !");  
	} // coucou

} // class DecouverteThread
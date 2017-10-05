
public class DecouverteThreader2 {

	public static void main(String[] args) {
//		Instanciation des fonctions à threader
		Coucou coucou = new Coucou();
		JAiFaim jAiFaim = new JAiFaim();
		
//		Construction des threads
		Thread coucouThread = new Thread(coucou);
		Thread jAiFaimThread = new Thread(jAiFaim);
		
//		Lancement des threads
		System.out.println("Lancement des threads");
		coucouThread.start();
		jAiFaimThread.start();
		
//		Attente de 5 minutes
		try { Thread.sleep(10000);
		} catch (InterruptedException e) { e.printStackTrace();
		} // try
		
//		Arrêt des threads
		coucou.arret = true;
		jAiFaim.arret = true;
		System.out.println("Les threads sont arrêtés");
		
	} // main

} // class DecouverteThreader2

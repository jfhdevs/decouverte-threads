
public class Coucou implements Runnable {
	public boolean arret;
	
	@Override
	public void run() {
		arret = false;
		while (!arret) {
			System.out.println("Coucou !");
			try { Thread.sleep(1000);
			} catch (InterruptedException e) { e.printStackTrace();
			} // try
		} // while
	} // run

} // class Coucou

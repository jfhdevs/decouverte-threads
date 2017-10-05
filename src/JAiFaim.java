
public class JAiFaim implements Runnable{
	public boolean arret;
	
	@Override
	public void run() {
		arret = false;
		while (!arret) {
			System.out.println("J'ai faim ! ! !");
			try { Thread.sleep(1500);
			} catch (InterruptedException e) { e.printStackTrace();
			} // try
		} // while
	} // run

}

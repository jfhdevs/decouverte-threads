
public class MsgCyclique implements Runnable {
	public boolean arret;
	private long delais;
	private String message;

//	Constructeur	
	public MsgCyclique(long delais, String message) {
		this.delais = delais;
		this.message = message;
	} // MsgCyclique

	@Override
	public void run() {
		arret = false;
		while (!arret) {
			System.out.println(this.message);
			try { Thread.sleep(this.delais);
			} catch (InterruptedException e) { e.printStackTrace();
			} // try
		} // while
	} // run
	

} // class MsgCyclique

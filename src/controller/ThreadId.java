package controller;

public class ThreadId extends Thread{

	private int idThread;
	
	//par�metros por construtor
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		int id = (int) getId();
		System.out.println(id);
	}
	
	
}

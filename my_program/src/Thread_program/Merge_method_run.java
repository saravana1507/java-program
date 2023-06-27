package Thread_program;

public class Merge_method_run extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Thread a= new Merge_method_run();
		Thread b= new Merge_method_run();
		a.start();
		Thread.sleep(500);
		b.start();
		
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(i+"=hai");}
	}

}

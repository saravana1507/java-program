package Thread_program;

	public class runable implements Runnable{

		public static void main(String[] args) {
	
			Thread t1 = new Thread(new runable());
			Thread t2 = new Thread(new runable());
			
			t1.start();
			t2.start();
		}

		public void run() {
			for( int i=1;i<=5;i++) {
				System.out.println(i+"*"+"2"+"="+ i*2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}


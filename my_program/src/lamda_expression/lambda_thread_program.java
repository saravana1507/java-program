package lamda_expression;

public class lambda_thread_program {

	public static void main(String[] args) {
		Runnable a=()->
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+". welcome");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable b=()->
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+". bye");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
	
	}
}

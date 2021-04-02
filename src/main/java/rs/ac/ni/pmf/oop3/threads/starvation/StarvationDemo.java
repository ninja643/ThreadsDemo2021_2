package rs.ac.ni.pmf.oop3.threads.starvation;

public class StarvationDemo
{
	public static void main(String[] args)
	{
		final SharedResource sharedResource = new SharedResource();

		final Thread t1 = new Thread(new MyRunnable(sharedResource, 1000));
		final Thread t2 = new Thread(new MyRunnable(sharedResource, 1000));

		t1.setName("Thread 1");
		t2.setName("Thread 2");

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}
}

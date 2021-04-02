package rs.ac.ni.pmf.oop3.threads.starvation;

public class SharedResource
{
	public synchronized void testMethod()
	{
		System.out.println(Thread.currentThread().getName() + ": processing...");
		try
		{
			Thread.sleep(20);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

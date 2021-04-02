package rs.ac.ni.pmf.oop3.threads;

public class TestObject
{
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public enum Methods
	{
		A,
		B,
		C
	}

	public void methodA()
	{
		synchronized (lock1)
		{
			System.out.println("Starting method A...");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Method A finished.");
		}
	}

	public void methodB()
	{
		synchronized (lock2)
		{
			System.out.println("Starting method B...");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Method B finished.");
		}
	}

	public void methodC()
	{
		System.out.println("Starting method C...");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Method C finished.");
	}
}

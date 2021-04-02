package rs.ac.ni.pmf.oop3.threads.starvation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyRunnable implements Runnable
{
	private final SharedResource shared;
	private final int count;

	@Override
	public void run()
	{
		for (int i = 0; i < count; ++i)
		{
			shared.testMethod();
		}
	}
}

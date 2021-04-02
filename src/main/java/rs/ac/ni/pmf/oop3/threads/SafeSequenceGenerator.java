package rs.ac.ni.pmf.oop3.threads;

public class SafeSequenceGenerator implements SequenceGenerator
{
	int value = 0;

	@Override
	public synchronized int getAndIncrease()
	{
		return value++;
	}
}

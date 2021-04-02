package rs.ac.ni.pmf.oop3.threads;

public class UnsafeSequenceGenerator implements SequenceGenerator
{
	int value = 0;

	@Override
	public int getAndIncrease()
	{
		int currentValue = value;
		value = value + 1;
		return currentValue;
	}
}

package rs.ac.ni.pmf.oop3.threads.bad;

import java.util.ArrayList;
import java.util.List;

public class BadConstructor
{
	private List<String> values;

	public BadConstructor(final List<Object> instances)
	{
		// initialization...

		instances.add(this);

		// more initialization...
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		values = new ArrayList<>();
	}

	public List<String> getValues()
	{
		return values;
	}
}

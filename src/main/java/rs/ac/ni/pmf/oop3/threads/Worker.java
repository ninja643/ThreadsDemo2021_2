package rs.ac.ni.pmf.oop3.threads;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Worker extends Thread
{
	private final SequenceGenerator generator;
	private final String name;
	private final int limit;

	@Override
	public void run()
	{
		final List<Integer> values = new ArrayList<>();

		for (int i = 0; i < limit; ++i)
		{
			values.add(generator.getAndIncrease());
		}

		saveList(values);
	}

	private void saveList(List<Integer> values)
	{
		try(final BufferedWriter out = new BufferedWriter(new FileWriter(name + ".out")))
		{
			for (final Integer value : values)
			{
				out.write(String.valueOf(value));
				out.write(' ');
			}
		}
		catch (IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
}

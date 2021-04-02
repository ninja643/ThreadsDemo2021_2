package rs.ac.ni.pmf.oop3.threads;

import java.util.ArrayList;
import java.util.List;

public class SequenceGeneratorDemo
{
	private static final int LIMIT = 10000;

	public static void main(String[] args) throws InterruptedException
	{
//		final SequenceGenerator generator = new UnsafeSequenceGenerator();
		final SequenceGenerator generator = new SafeSequenceGenerator();

		final List<Worker> workers = new ArrayList<>();

		for (int i = 0; i < 10; ++i)
		{
			workers.add(new Worker(generator, "Worker_" + i, LIMIT));
		}

		System.out.println("Starting workers...");

		for (final Worker worker : workers)
		{
			worker.start();
		}

		for (final Worker worker : workers)
		{
			worker.join();
		}

		System.out.println("Finished.");
	}
}

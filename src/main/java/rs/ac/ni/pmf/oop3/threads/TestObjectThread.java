package rs.ac.ni.pmf.oop3.threads;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestObjectThread extends Thread
{
	private final TestObject testObject;
	private final TestObject.Methods runMethod;

	@Override
	public void run()
	{
		switch (runMethod)
		{
		case A:
			testObject.methodA();
			break;
		case B:
			testObject.methodB();
			break;
		case C:
			testObject.methodC();
			break;
		}
	}
}

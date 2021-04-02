package rs.ac.ni.pmf.oop3.threads;

public class TestObjectDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		final TestObject testObject = new TestObject();

		Thread t1 = new TestObjectThread(testObject, TestObject.Methods.A);
		Thread t2 = new TestObjectThread(testObject, TestObject.Methods.B);
		Thread t3 = new TestObjectThread(testObject, TestObject.Methods.C);
		Thread t4 = new TestObjectThread(testObject, TestObject.Methods.A);
		Thread t5 = new TestObjectThread(testObject, TestObject.Methods.A);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
	}
}

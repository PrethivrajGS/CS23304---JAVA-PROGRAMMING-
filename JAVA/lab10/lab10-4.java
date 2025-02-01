class NewThread implements Runnable
{
	String name; Thread t;
	NewThread( String threadname )
	{
		name = threadname;
		t = new Thread( this , name );
		System.out.println("New Thread : " + t );
		t.start();
	}
	public void run()
	{
		try
		{
			for( int i=5 ; i>0 ; i-- )
			{
				System.out.println( name + " : " + i );
				Thread.sleep( 1000 );
			}
		}
		catch( InterruptedException e )
		{
			System.out.println("Interrupted");
			System.out.println( name + "Exiting" );
		}
	}
}
class Main
{
	public static void main( String [] args )
	{
		NewThread ob1 = new NewThread("One");
		System.out.println("Thread one is Alive : " + ob1.t.isAlive() );
		NewThread ob2 = new NewThread("Two");
		System.out.println("Thread two is Alive : " + ob2.t.isAlive() );
		NewThread ob3 = new NewThread("Three");
		System.out.println("Thread three is Alive : " + ob3.t.isAlive() );
		try
		{
			System.out.println("Waiting for Threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch( InterruptedException e )
		{
			System.out.println("Main Interrupted");
		}
		System.out.println();
		System.out.println("Thread one is Alive : " + ob1.t.isAlive() );
		System.out.println("Thread two is Alive : " + ob2.t.isAlive() );
		System.out.println("Thread three is Alive : " + ob3.t.isAlive() );
	}
}
		
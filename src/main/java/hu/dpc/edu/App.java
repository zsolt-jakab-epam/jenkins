package hu.dpc.edu;

/**
 * Hello world!
 *
 */
public class app 
{
	private String name;
	
    public static void main( String[] args )
    {
        new app().run();
    }
	

	private void run() {
		System.out.println( "Hello World! " + name.charAt(2) );
		
		for (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
			}
		}
		while(true){
			
		}

		
		or (int i = 0; i < 10; i++) {			// only references 'i'
			for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
				System.out.println("Hello");
				i++;
				j++;
				i--;
			}
		}
		
	}
}
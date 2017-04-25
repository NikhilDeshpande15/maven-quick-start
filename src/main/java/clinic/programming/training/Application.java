package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
	List<String> list = new ArrayList<>();
	public void print()
	{
		list.add("its in List..")
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.print();

    }
}
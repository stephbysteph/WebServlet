package testProject;

import java.util.ArrayList;

public class testClass {
	public static void main(String[] a) {
		try {
			new testClass().printClassLoaders();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void printClassLoaders() throws ClassNotFoundException {
		 
	    System.out.println("Classloader of this class:"
	        + testClass.class.getClassLoader());
	 
//	    System.out.println("Classloader of Logging:"
//	        + Logging.class.getClassLoader());
	 
	    System.out.println("Classloader of ArrayList:"
	        + ArrayList.class.getClassLoader());
	}
}

package object;

public class Example_1 {

	public static void main(String[] args) {
		Object obj1= new Object();
		Object obj2= new Object();
		
		boolean isEqual= obj1.equals(obj2);
		int hashcode1= obj1.hashCode();
		int hashcode2=obj2.hashCode();
		String toString1= obj1.toString();
		String toString2= obj2.toString();
		
		System.out.println("obj1 equals obj2:"+isEqual);
		System.out.println("obj1 hashcode:"+ hashcode1);
		System.out.println("obj2 hashcode:"+ hashcode2);
		System.out.println("obj1 toString:"+ toString1);
		System.out.println("obj2 toString:"+ toString2);

	}

}

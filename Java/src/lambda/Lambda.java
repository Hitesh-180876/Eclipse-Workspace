package lambda;

@FunctionalInterface
interface  MyLambda{
	void display();
}

/*
 * class My implements MyLambda{ public void display() {
 * System.out.println("Hello Java"); } }
 */
public class Lambda {
	public static void main(String[] args) {
//		MyLambda m = new My();
//		m.display();
//		
		MyLambda m = () ->System.out.println("Hello java");
		m.display();
	}

}

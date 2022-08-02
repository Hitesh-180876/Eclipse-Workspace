package lambda;

@FunctionalInterface
interface MyLambda1{
	int add(int a, int b);
}

public class Lambda1 {
	public static void main(String[] args) {
		
		MyLambda1 m = (a,b)-> a+b;
		int sum = m.add(10, 20);
		System.out.println(sum);
		
	}

}

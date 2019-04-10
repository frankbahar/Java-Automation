package pack1;

public class MainClass {

	public static void main(String[] args) {
			X x = new X();
			System.out.println(x.i);
			System.out.println("x j instance variable " + x.j);
			x.methodOfX();
			X y = new X();
			y.i=200;
			y.j=545;
			System.out.println("Static i " + y.i);
			System.out.println("Static i ");
			x.methodOfX();
			System.out.println("Instance j " + x.j);
			System.out.println("Instance j " + y.j);

	}

}

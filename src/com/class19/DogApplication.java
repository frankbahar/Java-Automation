package com.class19;

public class DogApplication {

	public static void main(String[] args) {
		Animal anim = new Animal();
		System.out.println("This is anim");
		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);
		
		System.out.println(anim.canBark());
		System.out.println(Animal.isWild());

		anim.name = "Joe";
		anim.age = 40;

		Animal anim1 = new Animal();
		System.out.println("This is anim1");
		System.out.println(anim1.age);
		System.out.println(anim1.weight);
		System.out.println(anim1.breed);
		System.out.println(anim1.name);

		Animal anim2 = new Animal();
		System.out.println("This is anim2");
		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);
		
		System.out.println(anim.canBark());
		System.out.println(Animal.isWild());
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Minimum of the array is : " + Minimum.minOfValues(array));
		System.out.println("Max of the array is : " + Minimum.maxOfValues(array));
		
		Minimum obj = new Minimum();
		obj.print();
		int a=4,b=6,c=8;
		Calculator calc = new Calculator();
		System.out.println(a + " , " + b + "," + c);
		System.out.println("Sum = " + calc.sum(a, b, c));
		System.out.println("Average = " + calc.average(a, b, c));
		System.out.println("Minium = " + calc.min(a, b, c));
		System.out.println("Maximum = " + calc.max(a, b, c));
	}

}

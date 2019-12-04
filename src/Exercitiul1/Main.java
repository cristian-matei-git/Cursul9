package Exercitiul1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Shape shape1 = new Shape("Math is easy", "plastic");
		Shape shape2 = new Shape("Quantum physics is hard", "tungsten");
		
		Triangle triangle1 = new Triangle("I reflect light", "glass", 23, 11);
		Triangle triangle2 = new Triangle("I reflect light", "glass", 23, 11);
		
		Rectangle rectangle1 = new Rectangle("Yellow rectangle", "steel", 10, 50);
		Rectangle rectangle2 = new Rectangle("Green rectangle", "hulk", 3, 23);
		
		System.out.println(shape1.getSize());
		System.out.println(triangle1.getSize());
		System.out.println(rectangle1.getSize());
		
		System.out.println(shape2.toString());
		System.out.println(triangle2.toString());
		System.out.println(rectangle2.toString());
		
		System.out.println(triangle1.equals(triangle2));
		System.out.println(rectangle2.hashCode());
		System.out.println(rectangle2.hashCode() == rectangle1.hashCode());
		System.out.println(triangle1.hashCode() == triangle2.hashCode());
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(shape1);
		shapes.add(shape2);
		shapes.add(triangle1);
		shapes.add(triangle2);
		shapes.add(rectangle1);
		shapes.add(rectangle2);
		
		for(int i = 0; i < shapes.size(); i++) {
			
			System.out.println(shapes.get(i).toString());
		}
		
		for(int i = 0; i < shapes.size(); i++) {
			
			System.out.println(shapes.get(i).getSize());
		}
		
		for(int i = 0; i < shapes.size(); i++) {
			
			if(shapes.get(i) instanceof Triangle){
				Triangle triangleRef = (Triangle)shapes.get(i);
				triangleRef.displayTriangleHeight();
			}else if(shapes.get(i) instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle)shapes.get(i);
				rectangleRef.displayRectangleHeight();
			}else {
				System.out.println("Error: unknown type of shape");
			}
			
		}
	}

}

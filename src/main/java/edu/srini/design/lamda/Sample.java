package edu.srini.design.lamda;

import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;
//Decorator Pattern
class Camera {
	Function<Color, Color> filter;
	public Camera(Function<Color, Color>... filters){
		setFilters(filters);
	}
	 private void setFilters(Function<Color, Color>... filters) {
		
		filter = Stream.of(filters)
				.reduce(Function.identity(), Function::andThen );
	}
	public Color snap(Color input){
		 return filter.apply(input);
	 }
	 
}

public class Sample{
	public static void main(String[] args) {
	 	printSnap(new Camera());
	 	
	 	printSnap(new Camera(Color::brighter));
	 	
	 	printSnap(new Camera(Color::darker));
	 	
	 	printSnap(new Camera(Color::darker, Color::brighter));
	 	
	}

	private static void printSnap(Camera camera) {
		System.out.println(camera.snap(new Color(125,125,125)));
		
	}
}
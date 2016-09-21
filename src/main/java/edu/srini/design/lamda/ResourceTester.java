package edu.srini.design.lamda;

import java.util.function.Consumer;

class Resource{
	
	Resource(){
		
	}
	
	Resource op1(){
		System.out.println("op1()...");
		return this;
	}
	Resource op2(){		
		System.out.println("op2()...");
		return this;
	}
	
	public static void use(Consumer<Resource> block){
		Resource r = new Resource();
		try{
			block.accept(r);
		}finally{
			close();
		}
	}

	public static void close() {
		System.out.println("closing...");
		
	}
		
	
	
	
}

public class ResourceTester {
	public static void main(String[] args) {
		Resource.use(r -> r.op1().op2());
	}
}

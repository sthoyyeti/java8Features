package edu.srini.design.lamda;

import java.util.function.Consumer;

//Builder or Cascade 
class Mailer{
	
	public static void print(String msg){
		System.out.println(msg);
	}
	public Mailer from(String addr){ print("from -> "+ addr); return this;}
	public Mailer to(String addr){ print("to -> "+ addr); return this;}
	public Mailer body(String body){ print("from -> "+ body); return this;}
	public static void send(Consumer<Mailer> consume){
		Mailer mailer = new Mailer();
		consume.accept(mailer);
		
		System.out.println("sending...");
	}
}

public class BuilderPattern {
	
   public static void main(String[] args) {
 	
	   Mailer.send(mailer -> mailer
			   .from("Srini@gmail.com")
			   .to("usha@gmail.com")
			   .body("I love you") );
   }	
	

}

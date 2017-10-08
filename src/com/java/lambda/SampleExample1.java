package com.java.lambda;


interface Executable{
	void execute();
}

class Runner {
	public void run(Executable e){
		System.out.println("Hello Hello....");
		e.execute();
	}
}
public class SampleExample1 {

	
	public static void main(String[] args) {
		Runner run = new Runner();
		run.run(new Executable(){
			public void execute(){
				System.out.println("Execute");
			}
		});
		
		System.out.println("=================");
		
		//Lambda expressions
		
		run.run(() -> System.out.println("Execute"));
	}
}

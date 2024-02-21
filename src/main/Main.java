package main;

import data.Mark;

public class Main {

	public static void main(String[] args) {
		Mark mark= new Mark();
	
		mark.printName();
		mark.likes();
		mark.dislikes();
		mark.favJoke();


		printHello(); 
		printHello(); //test
	}

	public static void printHello(){
		System.out.println("Hello");
	}

}

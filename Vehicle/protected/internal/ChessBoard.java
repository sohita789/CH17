package com.xworkz.protector.internal;

public class ChessBoard extends Board{

     public ChessBoard(String color, int height) {
	        super(color, height);//used to call the constructor of parent class(chaining)
	        
	        System.out.println("created the ChessBoard with color,height");
	    }
	}




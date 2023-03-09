package BookStore;

import java.io.IOException;
import java.util.Scanner;

import servicesimplementation.BookImplementation;


public class BookMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("OnlineBookStore");
	      System.out.println("1.View books list");
	      System.out.println("2.buy book");
	      System.out.println("3.sell book");
	      System.out.println("4.personal details");



	      System.out.println("Book Store");
	       BookImplementation e=new BookImplementation();

	      do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  e.findAllbook();
	    		  break;
	    	  case 2:
	    		  e.addbook();
	    		  break;
	    	  case 3:
	    		  e.updatebook();
	    		  break;
	    	  case 4:
	    		  e.deletebook();
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));

	}




	}



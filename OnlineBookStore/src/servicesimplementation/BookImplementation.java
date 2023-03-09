package servicesimplementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Book.BookInfo;
import Services.BookServices;

public class BookImplementation implements BookServices {

          List<BookInfo>list=new ArrayList<BookInfo>();
		 public BookImplementation()
		 {
			 BookInfo e1=new BookInfo("life amazing sectets",350,"text");
			 BookInfo e2=new BookInfo("the little Prince",300,"Adventure stories");
			 BookInfo e3=new BookInfo("The tale of two cities",270,"classics");
			 BookInfo e4=new BookInfo("The Godfather",355,"crime");
			 BookInfo e5=new BookInfo("Harry potter and the philosopher's stone",400,"fantasy");
			 BookInfo e6=new BookInfo("Flowers in the Attic",325,"Horror");
			 BookInfo e7=new BookInfo("The Da Vinic code",355,"Mystery");
			 BookInfo e8=new BookInfo("love story",320,"Romance");
			 BookInfo e9=new BookInfo("Nineteen Eighty-four",500,"Science fiction");
			 list.add(e1);
			 list.add(e2);
			 list.add(e3);
			 list.add(e4);
			 list.add(e5);
			 list.add(e6);
			 list.add(e7);
			 list.add(e8);
			 list.add(e9);
			 
		 }
		
	
		@Override
		public void () {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			 System.out.println("enter the bookid:");
			  int bookid=sc.nextInt();
			  System.out.println("enter the book name:");

			  String bookname=sc.next();
			  System.out.println("enter the bookprice:");

			  float bookprice=sc.nextFloat();
			  System.out.println("enter the booktype:");

			  String booktype=sc.next();
			
			  BookInfo e2=new BookInfo(bookname,bookprice,booktype);
			  list.add(e2);
	        
			
		}
		@Override
		public void updatebook() throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			 System.out.println("enter the bookid");
			  int bookid=sc.nextInt();
			  int flag=0,index=0;
			  BookInfo s=null;
			  for(BookInfo b:list)
			  {
				  if(b.getBookid()==bookid)
				  {
					flag=1;
					index=list.indexOf(b);
					s=b;
					System.out.println(s);
					break;
				  }
			  }
			  if(flag==1) {
			  System.out.println("enter the bookname");

			  String bookname=sc.next();
			  System.out.println("enter the bookprice");

			  float bookprice=sc.nextFloat();
			  System.out.println("enter the book type");

			  String booktype=sc.next();
			  s.setBookname(bookname);
			  s.setBookprice(bookprice);
			  s.setBooktype(booktype);
			  list.set(index, s);
			  System.out.println("===========================================================");
			  }
			  else
			  {
				  System.out.println("id does not exist!!"); 
			  }
	       
			  System.out.println("===========================================================");
			
			
		}
		@Override
		public void deletebook() throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the  book id");
			  int bookid=sc.nextInt();
			  int flag=0,index=0;
			  BookInfo s=null;
			  for(BookInfo b:list)
			  {
				  if(bookid==b.getBookid())
				  {
					flag=1;
					index=list.indexOf(b);
					s=b;
					System.out.println(s);
					break;
				  }
			
		}
			  System.out.println("===========================================================");
			  if(flag==0)
			  {
				  System.out.println("book id does not exist!!"); 
			  }
			  else
			  {
				  list.remove(s);
				  System.out.println("book record deleted successfully!!"); 
			  }
		}
		@Override
		public void viewallbooks() {
			// TODO Auto-generated method stub
			if(list.size()==0)
			{	
					System.out.println("No record found!!");	
			}
			for(BookInfo b1:list)
			{
				System.out.println(b1);
			}	
			
		}


		@Override
		public void buybook() throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			
			
		}


		@Override
		public void sellbook() throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void personaldetails() {
			// TODO Auto-generated method stub
			
		}
	}  



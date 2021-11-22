import java.io.*;
import java.util.*;

class Main {
  public static void main (String str[]){
    Scanner scan=new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        Book b2 = new Book("I am Malala", "Malala Yousafzai", 2012, 287, false);
        Book c = new Book("1984", "George Orwell", 1949, 328, false);
        System.out.println(b);  
        System.out.println();     
        System.out.println(c);
        System.out.println( b.getTitle() +" is hard cover, "+ b.getHardCover());
        System.out.println("Number of Pages in 1984 "+ c.getNumPages());

         System.out.println("Reset page number for Malala. Enter new page number: "); 
           int np = scan.nextInt();
            b.setNumPages(np);
          System.out.println(b);     
          Scanner it2=new Scanner(System.in);
          System.out.println("Reset author for 1984. Enter author: ");
          String up=it2.nextLine();
          c.setAuthor(up);
           System.out.println(c);     

          System.out.println("Are the books equal? "b.equals(b2));     
    }
}

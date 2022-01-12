public class Book
  
{
  //Fields/instance data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    setTitle(t);
    setAuthor(a);
    setYear(y);
    setNumPages(n);
    setHardCover(h);
  }
  //overloading the constructor
  public Book()
  {
    this("none","unknown",1900,1,false);
  }
  //accessor methods
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author;
  }
  public int getYear()
  {
    return year;
  }
  public int getNumPages()
  {
    return numPages;
  }
  public boolean getHardCover()
  {
    return hardCover;
  }
  //Mutator methods
  public void setTitle(String k)
  {
    title=k;
  }
  public void setAuthor(String f)
  {
    author=f;
  }
  public void setYear(int y)
  {
    year=y;
  }
  public void setNumPages(int s)
  {
    numPages=s;
  }
  public void setHardCover(boolean o)
  {
    hardCover=o;
  }
 
  //Other methods
  public boolean equals(Book b)
  {
    if(this.getTitle().equals(b.getTitle()))
    return true;
    else
    return false;
  }
  //What prints for our object
  public String toString()
    {
    String str="";
    str="title: "+title +" \nauthor: "+author +"\nyear: "+ year;
    str+= "\nnumPages: "+numPages + " \nhardCover: "+hardCover;
    return str;
    }
  
}
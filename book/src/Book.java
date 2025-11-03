import java.util.Arrays;

public class Book {
  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0 ;

  public Book(String name,Author[] authors,double price){
      this.name=name;
      this.authors=authors;
      this.price=price;
  }
  public Book(String name,Author[] authors,double price,int qty){
      this.name=name;
      this.authors=authors;
      this.price=price;
      this.qty=qty;
  }
  public String getName(){
      return name;
  }
  public Author[] getAuthors(){
      return  authors;
  }
  public double getPrice(){
      return price;
  }
  public int getQty(){
      return qty;
  }
  public void setPrice(double price){
      this.price=price;
  }
  public void setQty(int qty){
      this.qty=qty;
  }
  public String toString(){
      return "Book[name="+name+",authors="+ Arrays.toString(authors)+",price="+price+",qty="+qty+"]";
  }
  public String getAuthorName(){
      String authorNameStr = "";

   for (int i=0; i<authors.length; i++) {
        Author authorTemp = authors[i];
        System.out.println("Vòng lặp số: " + (i+1));
        System.out.println("Tên tác giả cần thêm vào: " + authorTemp.getName());
        System.out.println("List tên tác giả hiện tại: " + authorNameStr);
        authorNameStr += authorTemp.getName() + ", ";
        System.out.println("List tên tác giả sau khi thêm vào: " + authorNameStr);
        System.out.println("------");
//            authorNameStr += authors[i].getName() + ", ";
    }
    return authorNameStr;
  }
}
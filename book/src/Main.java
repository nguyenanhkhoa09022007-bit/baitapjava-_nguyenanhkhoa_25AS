public class Main {
    public static void main(String[] args){
        Author author = new Author(" anh khoa "," khoadhdo@gmail ", 'n');
        System.out.println(author);
        author.setEmail(" khoaddkfds@gmail ");
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        authors[2] = new Author("ko biet khoc","kobietkhoc@gmail",'n');
// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

    }
}
public class BookDriver
{
    public static void main(String[] args)
    {
        Book b1 = new Book("123456789", "Moby Dick", "The Whale Co.", "Horror");
        System.out.println(b1.toString());
        System.out.println(b1.getAuthor());
    }
}
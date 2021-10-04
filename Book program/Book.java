public class Book
{
    //instance variables
    private String isbn; //international standard book number (ISBN)
    private String author;
    private String publisher;
    private String subject;
    
    //constructor; creates a new book object
    public Book(String isbn, String author, String publisher, String subject)
    {
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.subject = subject;
    }
    
    //constructor initializes the instance variables to default "unknown"
    public Book()
    {
        isbn = "unknown";
        author = "unkown";
        publisher = "unknown";
        subject = "unknown";
    }
    
    //setter methods
    public void setIsbn()
    {
        this.isbn = isbn;
    }
    
    public void setAuthor()
    {
        this.author = author;
    }
    
    public void setPublisher()
    {
        this.publisher = publisher;
    }
    
    public void setSubject()
    {
        this.subject = subject;
    }
    
    //getter methods
    public String getIsbn()
    {
        return isbn;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    //check if you have the same book
    public boolean equals(Book other)
    {
        return this.isbn.equalsIgnoreCase(other.isbn) && this.author.equalsIgnoreCase(other.author) && this.publisher.equalsIgnoreCase(other.publisher) && this.subject.equalsIgnoreCase(other.subject);
    }
    
    //convert book to string
    public String toString()
    {
        String s = isbn + " " + author + " " + publisher + " " + subject;
        return s;
    }
}
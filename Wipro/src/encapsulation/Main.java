package encapsulation;

class Author {
    String name, email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
}

public class Main {
    public static void main(String[] args) {
        Author a = new Author("J.K. Rowling", "jkrowling@mail.com", 'F');
        Book b = new Book("Harry Potter", a, 499.99, 100);

        System.out.println("Book: " + b.name);
        System.out.println("Price: " + b.price);
        System.out.println("Stock: " + b.qtyInStock);
        System.out.println("Author: " + b.author.name + ", " + b.author.email + ", " + b.author.gender);
    }
}

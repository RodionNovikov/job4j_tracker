package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book mir = new Book(198, "mir");
        Book vojna = new Book(600, "vojna");
        Book gejsha = new Book(400, "gejsha");
        Book cleanCode = new Book(450, "cleanCode");
        Book[] books = new Book[4];
        books[0] = mir;
        books[1] = vojna;
        books[2] = gejsha;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book title = books[index];
            System.out.println(title.getName() + " - " + title.getPages());
        }

        System.out.println("Change indexes");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book title = books[index];
            System.out.println(title.getName() + " - " + title.getPages());
        }

        System.out.println("Print only book name Clean Code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(cleanCode)) {
                System.out.println(books[i].getName());
            }

        }
    }
}



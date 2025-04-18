package ClassObjectMethod;

public class ClassesObjectsMethods {
    // Класс для книг
    class Book {
        String title;
        String author;

        // Конструктор для создания книги с заданным названием и автором
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Метод для красивой печати информации о книге
        public String toString() {
            return "\"" + title + "\" от " + author;
        }
    }

    // Класс для управления библиотекой
    class Library {
        Book book1;  // Первая книга
        Book book2;  // Вторая книга

        // Метод для добавления первой книги
        public void addBook1(Book book) {
            book1 = book;
            System.out.println("Добавлена первая книга: " + book);
        }

        // Метод для добавления второй книги
        public void addBook2(Book book) {
            book2 = book;
            System.out.println("Добавлена вторая книга: " + book);
        }

        // Метод для отображения всех книг в библиотеке
        public void displayBooks() {
            System.out.println("Книги в библиотеке:");
            if (book1 != null) {
                System.out.println("1: " + book1);
            } else {
                System.out.println("Первая книга не добавлена.");
            }
            if (book2 != null) {
                System.out.println("2: " + book2);
            } else {
                System.out.println("Вторая книга не добавлена.");
            }
        }
    }

    // Основной класс для запуска программы
    public class Main {
        public void main(String[] args) {
            Library library = new Library();  // Создаем библиотеку

            // Создаем две книги
            Book book1 = new Book("Война и мир", "Лев Толстой");
            Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский");

            // Добавляем книги в библиотеку
            library.addBook1(book1);
            library.addBook2(book2);

            // Показываем все книги
            library.displayBooks();
        }
    }
}

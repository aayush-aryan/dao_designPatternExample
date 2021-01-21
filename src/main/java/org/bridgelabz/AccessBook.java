package org.bridgelabz;
import org.bridgelabz.dao.BookDao;
import org.bridgelabz.daoimplementation.BookDaoImpl;
import org.bridgelabz.model.Books;
public class AccessBook {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}

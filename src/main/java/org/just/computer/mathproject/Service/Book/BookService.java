package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.BookResp;
import org.just.computer.mathproject.Entity.Book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookResp bookResp;

    public List<Book> getAllBook() {
        return bookResp.findAll();
    }

    public void addBook(String title) {
        Book book=new Book();
        book.setTitle(title);
        bookResp.save(book);
    }

    public void deleteBookById(Integer id){
        bookResp.deleteById(id);
    }
}

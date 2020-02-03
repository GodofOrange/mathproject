package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.Book;
import org.just.computer.mathproject.Service.Book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="书")
@RequestMapping("/Book/")
public class BookController {
    @Autowired
    BookService bookService;

    @ApiOperation(value ="获得所有书")
    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @ApiOperation(value = "添加书")
    @GetMapping("/addBook")
    public Boolean getAllBook(@RequestParam String title){
        try {
            bookService.addBook(title);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除书")
    @GetMapping("/deleteBook")
    public Boolean deleteBookById(Integer id){
        try{
            bookService.deleteBookById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

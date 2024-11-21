package com.products.productdetails.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productdetails.model.Book;
import com.products.productdetails.service.BookService;
//import com.products.productdetails.service.CategoryService;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/myBookController")
public class BookController {
    @Autowired
    private BookService bs;

    // private CategoryService css;
    
    @GetMapping("showBook")
    public List<Book> getMethodName() {
        return  bs.getAllBooks();
    }

    @PostMapping("addBook")
    public String createBook(@RequestBody Book b) { 
        // List<Category> categoryList = css.getCategory();
        return bs.createBook(b);
    }

    @DeleteMapping("deleteBook")
    public String deleteBook(@RequestParam("ID") int id){
        return bs.deleteBook(id);
    }

    
    

}

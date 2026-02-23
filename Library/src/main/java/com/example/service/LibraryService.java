package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@Service
public class LibraryService {

    @Autowired
    private BookRepository repo;

    // Add one book
    public Book addBook(Book book) {
        return repo.save(book);
    }

    // Add many books
    public List<Book> addAllBooks(List<Book> books) {
        return repo.saveAll(books);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // Get by id
    public Book getBookById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // Update
    public Book updateBook(Integer id, Book book) {
        Book old = repo.findById(id).orElse(null);

        if (old != null) {
            old.setTitle(book.getTitle());
            old.setAuthor(book.getAuthor());
            old.setPrice(book.getPrice());
            return repo.save(old);
        }

        return null;
    }

    // Delete
    public String deleteBook(Integer id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}

package net.bookstore.book.store.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.bookstore.book.store.management.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}

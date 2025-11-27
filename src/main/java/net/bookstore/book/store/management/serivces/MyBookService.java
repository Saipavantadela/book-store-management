package net.bookstore.book.store.management.serivces;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import net.bookstore.book.store.management.entity.MyBookList;
import net.bookstore.book.store.management.repository.MyBookRepository;

@Service
public class MyBookService {
	@Autowired
	private MyBookRepository mybook;
	
	 public void saveMyBooks(MyBookList book) {
		 mybook.save(book);
	 } 
	 public List<MyBookList> getAllMyBooks(){
		 return mybook.findAll();
	 }
	 public void  deleteById(int id) {
		 mybook.deleteById(id);
		 
	 }
	

}

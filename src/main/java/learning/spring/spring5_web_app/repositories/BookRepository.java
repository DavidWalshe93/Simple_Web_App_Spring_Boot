package learning.spring.spring5_web_app.repositories;

import learning.spring.spring5_web_app.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Developer: David Walshe
 * Date: 10/07/2019
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

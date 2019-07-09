package learning.spring.spring5_web_app.repositories;

import learning.spring.spring5_web_app.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Developer: David Walshe
 * Date: 09/07/2019
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

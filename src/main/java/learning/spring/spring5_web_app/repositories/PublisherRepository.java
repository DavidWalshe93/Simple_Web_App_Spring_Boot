package learning.spring.spring5_web_app.repositories;

import learning.spring.spring5_web_app.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Developer: David Walshe
 * Date: 10/07/2019
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}

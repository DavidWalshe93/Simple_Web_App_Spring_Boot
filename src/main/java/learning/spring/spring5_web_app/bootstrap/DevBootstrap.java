package learning.spring.spring5_web_app.bootstrap;

import learning.spring.spring5_web_app.model.Author;
import learning.spring.spring5_web_app.model.Book;
import learning.spring.spring5_web_app.model.Publisher;
import learning.spring.spring5_web_app.repositories.AuthorRepository;
import learning.spring.spring5_web_app.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Developer: David Walshe
 * Date: 10/07/2019
 */
// Spring framework component
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    // Autowired by spring framework
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    // Code will run when context is up and running on start up.
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    // Load sample data into H2
    private void initData() {
        Author hermin = new Author("Herman", "Melville");
        Publisher harperCollins = new Publisher("Harper Collins", "USA");
        Book mobyDick = new Book("Moby Dick", "1234", harperCollins);
        hermin.getBooks().add(mobyDick);
        mobyDick.getAuthors().add(hermin);

        authorRepository.save(hermin);
        bookRepository.save(mobyDick);

        Author tolkien = new Author("John", "Tolkien");
        Publisher allenUnwin = new Publisher("Allen & Unwin", "Australia");
        Book lordOfTheRings = new Book("Lord of the Rings", "4321", allenUnwin);
        tolkien.getBooks().add(lordOfTheRings);
        lordOfTheRings.getAuthors().add(tolkien);

        authorRepository.save(tolkien);
        bookRepository.save(lordOfTheRings);
    }
}

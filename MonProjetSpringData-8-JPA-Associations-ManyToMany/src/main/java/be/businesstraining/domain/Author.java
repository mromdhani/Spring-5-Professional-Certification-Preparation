package be.businesstraining.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Authors")
public class Author {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}

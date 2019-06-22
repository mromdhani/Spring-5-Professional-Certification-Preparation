package be.businesstraining.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    private Long id;
    private  String title;

    @ManyToMany
    private List<Author> authors;
}

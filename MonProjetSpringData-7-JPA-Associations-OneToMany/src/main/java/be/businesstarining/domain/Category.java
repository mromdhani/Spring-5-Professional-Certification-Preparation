package be.businesstarining.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

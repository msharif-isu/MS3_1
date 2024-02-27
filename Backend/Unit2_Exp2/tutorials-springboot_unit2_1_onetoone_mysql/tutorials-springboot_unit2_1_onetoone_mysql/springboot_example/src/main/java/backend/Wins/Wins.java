package backend.ShopItems;

import backend.Users.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShopItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String item_name;

    @ManyToMany
    private List<User> users;
}

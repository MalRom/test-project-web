package com.tinman.project.Model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String password;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<UserIfo> userIfo;

    public User() {
    }

    public User(Long id, String name, String password, Set<UserIfo> userIfo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userIfo = userIfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserIfo> getUserIfo() {
        return userIfo;
    }

    public void setUserIfo(Set<UserIfo> userIfo) {
        this.userIfo = userIfo;
    }
}

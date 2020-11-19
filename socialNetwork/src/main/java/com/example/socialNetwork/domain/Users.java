package com.example.socialNetwork.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

/**
 * Пользователь социальной сети
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class Users {
    /**
     * Идентификатор пользователя
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Имя
     */
    @Column(name = "name", length = 100, nullable = false)
    @NotEmpty
    private String name;
    /**
     * Фамилия
     */
    @Column(name = "surname", length = 100, nullable = false)
    @NotEmpty
    private String surname;
    /**
     * Возраст
     */
    @Column(name = "age")
    private Integer age;
    /**
     * Пол
     */
    @Column(name = "gender")
    private String gender;
    /**
     * Интересы
     */
    @Column(name = "interests")
    private String interests;
    /**
     * Город
     */
    @Column(name = "city")
    private String city;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "friends",
            joinColumns = @JoinColumn(name = "first_friend"),
            inverseJoinColumns = @JoinColumn(name = "second_friend")
    )
    private Set<Users> friends = new HashSet<>();
}

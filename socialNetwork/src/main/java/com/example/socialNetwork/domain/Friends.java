package com.example.socialNetwork.domain;

import com.example.socialNetwork.domain.enums.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * Описание отношения дружбы между пользователями
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "friends")
@IdClass(FriendsPK.class)
public class Friends {
    /**
     * Идентификатор пользователя, добавляющего в друзья
     */
    @Id
    @Column(name = "first_friend", nullable = false)
    private Integer firstFriend;
    /**
     * Идентификатор пользователя, добавляемого в друзья
     */
    @Id
    @Column(name = "second_friend", nullable = false)
    private Integer secondFriend;
}

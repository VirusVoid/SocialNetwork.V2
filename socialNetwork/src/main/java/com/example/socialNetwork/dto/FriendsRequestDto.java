package com.example.socialNetwork.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * Данные пользователя для регистрации
 */
@Data
@NoArgsConstructor
public class FriendsRequestDto {
    /**
     * 1 друг
     */
    private Integer firstFriend;
    /**
     * 2 друг
     */
    private Integer secondFriend;
}

package com.example.socialNetwork.domain;

import com.example.socialNetwork.domain.enums.StatusEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class FriendsPK implements Serializable {
    private Integer firstFriend;
    private Integer secondFriend;
}

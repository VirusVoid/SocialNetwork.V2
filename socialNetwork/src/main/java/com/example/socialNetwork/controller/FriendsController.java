package com.example.socialNetwork.controller;

import com.example.socialNetwork.domain.Friends;
import com.example.socialNetwork.dto.FriendsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Обработка HTTP-запросов для работы с таблицей друзей
 */
@Component
@RequestMapping("friend")
@RequiredArgsConstructor
public class FriendsController {


//    private final FriendsService friendsService;

    /**
     * Создать новую заявку в друзья
     * @param friends заявка в друзья
     */
/*    @PostMapping
    public ResponseEntity<?> createFriend(@RequestBody @Valid FriendsRequestDto friends){
        return friendsService.createFriendRequest(friends);
    }

    /**
     * Обновить данные существующей заявки в друзья
     * @param friends заявка в друзья
     */
/*    @PutMapping("/{id}")
    public ResponseEntity<?> updateFriendRequest(@PathVariable Integer id, @RequestBody @Valid Friends friends){
        return friendsService.updateFriendRequest(id, friends);
    }*/
}
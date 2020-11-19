package com.example.socialNetwork.repository;

import com.example.socialNetwork.domain.Friends;
import com.example.socialNetwork.domain.FriendsPK;
import com.example.socialNetwork.dto.FriendsRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendsRepository extends JpaRepository<Friends, FriendsPK> {
    List<Friends> findByFirstFriend(FriendsPK id);
    List<Friends> findBySecondFriend(FriendsPK id);
    Friends findByFirstFriendOrSecondFriend(FriendsPK firstFriend, FriendsPK secondFriend);
}

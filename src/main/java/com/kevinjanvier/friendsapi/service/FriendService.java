package com.kevinjanvier.friendsapi.service;

import com.kevinjanvier.friendsapi.repository.FriendRepository;
import com.kevinjanvier.friendsapi.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendRepository repository;

    public List<Friend> getFriends() {
        return repository.findAll();
    }

    public void addFriends(Friend friend) {
        repository.save(friend);
    }

    public void updateFriend(Friend friend) {
        repository.save(friend);
    }

    public void deleteFriend(Integer id) {
        repository.deleteById(id);

    }

}

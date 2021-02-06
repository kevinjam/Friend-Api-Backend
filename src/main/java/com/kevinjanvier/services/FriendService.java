package com.kevinjanvier.services;


import com.kevinjanvier.model.Friend;
import com.kevinjanvier.repository.FriendRepository;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class FriendService {

    private final FriendRepository repository;

    public FriendService(
            FriendRepository repository
    ) {
        this.repository = repository;
    }

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

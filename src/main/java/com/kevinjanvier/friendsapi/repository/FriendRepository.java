package com.kevinjanvier.friendsapi.repository;

import com.kevinjanvier.friendsapi.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend,Integer> {}

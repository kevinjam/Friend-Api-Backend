package com.kevinjanvier.repository;

import com.kevinjanvier.model.Friend;
import io.micronaut.data.jpa.repository.JpaRepository;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public interface FriendRepository extends JpaRepository<Friend,Integer> {
    @Override
    List<Friend>findAll();
}

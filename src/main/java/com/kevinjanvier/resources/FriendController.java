package com.kevinjanvier.resources;

import com.kevinjanvier.model.Friend;
import com.kevinjanvier.services.FriendService;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("api/v1")
public class FriendController {
    private final FriendService service;

    public FriendController(
            FriendService service
    ) {
        this.service = service;
    }

    @Get("/friends")
    public List<Friend> getFriends() {
        return service.getFriends();
    }

    @Post("/friends/addnew")
    public void addFriend(@Body Friend friend) {
        service.addFriends(friend);
    }

    @Put("/friends/{id}/edit")
    public void updateFriends(@PathVariable("id") Integer id,
                              @Body Friend friend
    ) {
        service.updateFriend(friend);
    }

    @Delete("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Integer id) {
        service.deleteFriend(id);
    }

}

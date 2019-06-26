package com.example.demo.mapper;

import com.example.demo.model.Girl;

public interface GirlMapper {

    void insertGirl(Girl girl);

    Girl selectGirlByBoyFriend(long boyFriendId);
}

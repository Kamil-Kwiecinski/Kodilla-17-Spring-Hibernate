package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> listOfUser = new ArrayList<>();

    public Forum() {
        listOfUser.add(new ForumUser(0001, "DarthVader",'M', 1990, 10 , 25, 10));
        listOfUser.add(new ForumUser(0002, "BlackWidow",'F', 1994, 04 , 16, 4));
        listOfUser.add(new ForumUser(0003, "SpiderMan",'M', 2000, 01 , 02, 1));
        listOfUser.add(new ForumUser(0004, "YoungPrincess",'F', 2002, 12 , 13, 12));
        listOfUser.add(new ForumUser(0005, "AlanLuke",'M', 1985, 8 , 21, 15));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(listOfUser);
    }
}

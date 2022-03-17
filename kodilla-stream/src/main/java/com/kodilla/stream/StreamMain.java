package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> resultList = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPublishPosts() > 1)
                .filter(forumUser -> forumUser.timePeriod(LocalDate.now(), forumUser.getDateOfBirth()) < 20)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        resultList.entrySet().stream()
                .map(entry -> entry.getValue())
                .forEach(System.out::println);
    }
}

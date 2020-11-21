package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> listOfForumUsers = forum.getTheForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDay(),LocalDate.now()).getYears() >= 20 )
                .filter(forumUser -> forumUser.getPostQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));

        listOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }


}
package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();
    public Forum() {
        theForumUsersList.add(new ForumUser(001, "MatDab", 'M', LocalDate.of(1995,05,19), 99));
        theForumUsersList.add(new ForumUser(002, "DabMat", 'M', LocalDate.of(2000,01,20), 99));
        theForumUsersList.add(new ForumUser(003, "MaDa", 'M', LocalDate.of(2004,05,20), 0));
        theForumUsersList.add(new ForumUser(004, "SaTo", 'F', LocalDate.of(1998,05,19), 1));
        theForumUsersList.add(new ForumUser(005, "LokDab", 'M', LocalDate.of(1999,05,19), 6));
        theForumUsersList.add(new ForumUser(006, "ZdzJa", 'F', LocalDate.of(2010,05,10), 3 ));
    }

    public List<ForumUser> getTheForumUsersList() {
        return theForumUsersList;
    }
}

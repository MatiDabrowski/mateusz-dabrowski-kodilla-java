package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char  sex;
    private final LocalDate birthDay;
    private final int postQty;

    public ForumUser(final int id, final String userName, final char sex, final LocalDate birthDay, final int postQty) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.postQty = postQty;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostQty() {
        return postQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postQty=" + postQty +
                '}';
    }
}

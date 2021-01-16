package com.kodilla.good.patterns.challenges.order131;

public class User {
    private final String name;
    private final String surname;
    private final String nickName;

    public User(String name, String surname, String nickName){
        this.name = name;
        this.surname = surname ;
        this.nickName= nickName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickName() {
        return nickName;
    }
}

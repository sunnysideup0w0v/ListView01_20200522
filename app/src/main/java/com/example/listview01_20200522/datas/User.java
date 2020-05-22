package com.example.listview01_20200522.datas;

public class User {

    private String name;
    private String address;

    //alt+insert => 자동으로 게터 세터 만드는 기능 선택 => shift로 전체선택 생성.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ald+insert => constructor 생성
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

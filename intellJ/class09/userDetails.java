package com.syntax.intellJ.class09;

public class userDetails extends userInfo {

    userDetails(String address) {
        super(address);
    }

    public static void main(String[] args) {
        userInfo userinfo = new userInfo("6670 roderick loop");
        userClass userclass = new userClass("harry", "666-666-5667");
        userclass.display();


    }
}

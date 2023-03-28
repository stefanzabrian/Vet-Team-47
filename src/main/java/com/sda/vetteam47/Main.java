package com.sda.vetteam47;

import com.sda.vetteam47.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        SessionManager.shutDown();
    }
}
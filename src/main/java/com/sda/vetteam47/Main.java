package com.sda.vetteam47;

import com.sda.vetteam47.util.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        SessionManager.shutDown();
    }
}
package com.sda.vetteam47.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager{
    private static final SessionManager INSTANCE = new SessionManager();
    private SessionManager(){

    }
    public static SessionFactory getSessionFactory()
    {
        return INSTANCE.getSessionFactory("vet_team_47");
    }

    public static void shutDown()
    {
        INSTANCE.shutdownSessionManager();
    }
    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
    }
}

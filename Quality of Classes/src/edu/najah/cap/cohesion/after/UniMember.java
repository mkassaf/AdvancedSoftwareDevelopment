package edu.najah.cap.cohesion.after;

import java.lang.reflect.Member;

public class UniMember implements Member {
    private String name;
    private String id;
    private String email;
    private String phone;

    public UniMember(String name, String id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public Class<?> getDeclaringClass() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public boolean isSynthetic() {
        return false;
    }


    public String toString() {
        return name;
    }
}

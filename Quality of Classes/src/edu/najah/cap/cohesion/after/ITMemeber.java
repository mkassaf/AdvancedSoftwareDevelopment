package edu.najah.cap.cohesion.after;

import java.lang.reflect.Member;

public class ITMemeber implements Member {
    private String name;

    public ITMemeber(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "IT : " + name;
    }
}

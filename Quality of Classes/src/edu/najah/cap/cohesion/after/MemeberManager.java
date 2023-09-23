package edu.najah.cap.cohesion.after;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemeberManager {
    List<Member> members;

    public MemeberManager() {
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        System.out.println("Member " + member + " added");
    }

    public void removeMember(Member member) {
        System.out.println("Member " + member + " removed");
    }

    public void updateMember(Member member) {
        System.out.println("Member " + member + " updated");
    }

    public List<Member> getMembers() {
        return members;
    }
}

package edu.najah.cap.advance.isp.exmaple5;

import java.util.ArrayList;
import java.util.List;

public class VM {
    List<Baverage> baverageList;
    Payment payment;

    VM(Payment payment) {
        this.payment = payment;
        baverageList = new ArrayList<>();
    }

    void addBaverge(Baverage baverage) {
        baverageList.add(baverage);
    }
}

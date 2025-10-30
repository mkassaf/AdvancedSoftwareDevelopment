package edu.najah.cap.advance.liskov.exmaple3;

public class SuperAdmin extends Admin {

    /**
     * This class breaks Liskov pricicple becasue it changes the behaviour of getName
     *
     *
     * @return
     */
    @Override
    public String getName() {
        return "********";
    }

}

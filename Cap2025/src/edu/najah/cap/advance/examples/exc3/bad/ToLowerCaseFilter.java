package edu.najah.cap.advance.examples.exc3.bad;

public class ToLowerCaseFilter implements IToLowerCaseFilter {

    public String applyToLowerCaseFilter(String result) {
        return result.toLowerCase();//first filter
    }
}

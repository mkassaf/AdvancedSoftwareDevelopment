package edu.najah.cap.advance.examples.exc3.correct;

import java.util.List;

public class TextProccesser {

    private List<Filter> filters;

    public  TextProccesser(List<Filter> filters) {
        this.filters = filters;
    }


    public String proccess(String text) {
        String result = text;

        for (Filter filter : filters) {
            result = filter.applyFilter(result);
        }

        return result;

    }


}

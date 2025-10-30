package edu.najah.cap.advance.examples.exc3.correct;

public class MaskFilter implements Filter {

    public String applyFilter(String result) {
        return result.replaceAll("password", "*****");//third filter
    }
}

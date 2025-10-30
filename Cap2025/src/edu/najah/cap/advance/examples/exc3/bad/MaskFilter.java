package edu.najah.cap.advance.examples.exc3.bad;

public class MaskFilter implements IMaskFilter {

    public String applyMaskFilter(String result) {
        return result.replaceAll("password", "*****");//third filter
    }
}

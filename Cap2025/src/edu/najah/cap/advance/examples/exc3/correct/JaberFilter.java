package edu.najah.cap.advance.examples.exc3.correct;

public class JaberFilter implements Filter {
    @Override
    public String applyFilter(final String result) {
        var response = result;
        return response.replace("Salah", "Jaber");
    }
}

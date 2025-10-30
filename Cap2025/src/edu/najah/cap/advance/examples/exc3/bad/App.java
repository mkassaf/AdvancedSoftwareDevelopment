package edu.najah.cap.advance.examples.exc3.bad;

public class App {

    private static TextProccesser textProccesser = new TextProccesser(
            new ToLowerCaseFilter(),
            new MaskFilter(),
            new TrimFilter(),
            new SalahFilter()
    );

    public static void main(String[] args) {
        String text = " Hi every one, this is my Password!!! ";
        System.out.println(textProccesser.proccess(text));
    }
}

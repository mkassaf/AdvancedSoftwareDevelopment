package edu.najah.cap.advance.decorator.exmaple3;

public class App {

    public static void main(String[] args) {

        Text text = new PureText();

        Text textWithBold = new BoldText(text);
        Text textWithBoldWithItalic = new ItalicText(textWithBold);
        Text textWithBoldWithItalicWithStronge = new StrongText(textWithBoldWithItalic);

        System.out.println(textWithBoldWithItalicWithStronge.getText("Sami"));
    }
}

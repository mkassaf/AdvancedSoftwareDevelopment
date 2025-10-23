package edu.najah.cap.advance.quality_classes.coupling;

public class App {

    public static void main(String[] args) {

        Listener listener = new Listener();

        listener.listen(new SmsEvent("Message 1"));
        listener.listen(new SmsEvent("Message 2"));
        listener.listen(new TextEvent("Message 3"));
        listener.listen(new WifiEvent());

        listener.listen(() -> "New event");//Extra - no need to understand it


        Topic topic = new Topic();

        System.out.println("Topic :: " + topic.getTopic());
    }

    public static class Topic {

        public String getTopic() {
            //Connect to database
            return "topic ";
        }
    }
}

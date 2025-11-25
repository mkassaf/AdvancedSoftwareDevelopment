package edu.najah.cap.advance.template.exmaple1;

public abstract class FileTemplate {

    protected abstract void open();

    protected abstract void read();

    protected abstract void close();

    public final void process() {
        try {
            open();
            read();
        } finally {
            try {
                close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

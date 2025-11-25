package edu.najah.cap.advance.template.exmaple2.myFile;

public abstract class File {
    protected abstract void open();
    protected abstract void read();
    protected abstract void close();

    public final void proccess() {
        try {
            open();
            read();
        } finally {
            close();
        }
    }
}

package edu.najah.cap.advance.compostition.exmaple3;

public class App {
    public static void main(String[] args) {
        Menu main = new Menu("File");
        Menu edit = new Menu("Edit");
        edit.addMenu(new MenuItem("Copy"));
        edit.addMenu(new MenuItem("Cut"));
        var refactor = new Menu("Refactor");
        refactor.addMenu(new MenuItem("Rename"));
        refactor.addMenu(new MenuItem("Remove duplicate"));
        edit.addMenu(refactor);

        main.addMenu(new MenuItem("Close"));
        main.addMenu(edit);

        main.display();

    }
}

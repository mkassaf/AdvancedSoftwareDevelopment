package edu.najah.cap.advance.oop.abstraction;

public class App {

    //Dependcy injection
    public static MySQl mySQl = new MySQl();
    public static Postgress postgress = new Postgress();

    public static void main(String[] args) {

        proccess(mySQl); // as a database
        proccess(postgress);

        doAnother(mySQl);// as printable
        //edit(mySQl);//MySql does not implement pritable
        edit(postgress);//

        Printable printable = new Print();
        printable.print();
    }


    public static void proccess(Database database) {
        database.insert("data");
        database.get();
    }

    public static void doAnother(Printable printable) {
        printable.print();
    }

    public static void edit(Editable editable) {
        editable.edit("data");
    }

}

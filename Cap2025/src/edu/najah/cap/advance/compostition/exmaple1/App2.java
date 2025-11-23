package edu.najah.cap.advance.compostition.exmaple1;

public class App2 {

    public static void main(String[] args) {
        IntValue[] primitve = new IntValue[5];
        IntValue x = new IntValue(10);

        primitve[0] = x;//

        primitve[0].value = 20;


        System.out.println(primitve[0].value);
        System.out.println(x.value);
    }


    static class IntValue {
        public int value;

        public IntValue(int value) {
            this.value = value;
        }
    }
}

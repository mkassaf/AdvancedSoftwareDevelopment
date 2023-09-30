package edu.najah.cap.v2.items;

public class Milk implements Extra {

        private String name;
        private double price;
        private String desc;

        public Milk() {
            this.name = "Milk";
            this.price = 0.5;
            this.desc = "Milk";
        }

        public String getName() {
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }

        public String getDesc() {
            return this.desc;
        }
}

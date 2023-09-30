package edu.najah.cap.v2.items;

public class Sugger implements Extra {

            private String name;
            private double price;
            private String desc;

            public Sugger() {
                this.name = "Sugger";
                this.price = 0.5;
                this.desc = "Sugger";
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

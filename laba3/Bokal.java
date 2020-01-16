package Dish;

public class Bokal extends Dish {

        private String razmer;
        public String getRazmer() {
            return razmer;
        }
        public void setRazmer(String razmer) {
            this.razmer = razmer;
        }
        public Bokal(String material, String color, String razmer) {
            super(material, color);
            this.razmer = razmer;
        }
        @Override
        public String toString() {
            return "Bokal:" +
                    "razmer=>'" + razmer + '\'' +
                    ", material=>'" + material + '\'' +
                    ", color=>'" + color + '\'' ;
        }
    }
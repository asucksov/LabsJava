package laba2;

public class circle {
        final double PI = 3.1415;
        private double radius = 0;
        private double diameter = 0;
        private double lenght = 0;
        private double square = 0;
        circle(double radius){
            this.radius = radius;
        }
        public double getRadius(){
            return radius;
        }
        public double getDiametert(){
            return 2 * radius;
        }
        public double getLenght(){
            return 2 * PI * radius;
        }
        public double getSquare(){
            return PI * radius * radius;
        }
    }


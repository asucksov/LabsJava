package laba2;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга> ");
        Scanner info = new Scanner(System.in);
        double radius = info.nextDouble();
        circle circle = new circle(radius);
        System.out.println("Радиус круга> "+circle.getRadius());
        System.out.println("Диаметр круга> " + circle.getDiametert());
        System.out.println("Длина круга> " + circle.getLenght());
        System.out.println("Площадь круга> "+ circle.getSquare());
        info.close();
    }
}
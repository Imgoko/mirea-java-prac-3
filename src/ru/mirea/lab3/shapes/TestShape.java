package ru.mirea.lab3.shapes;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);                   // Вызовется Circle.toString() (динамическое связывание / полиморфизм)
        System.out.println(s1.getArea());         // Вызовется Circle.getArea()
        System.out.println(s1.getPerimeter());    // Вызовется Circle.getPerimeter()
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());    // ОШИБКА КОМПИЛЯЦИИ: ссылка s1 имеет тип Shape, в классе Shape нет метода getRadius()

        Circle c1 = (Circle) s1;                  // Downcast обратно к Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());       // Теперь работает, т.к. c1 имеет тип Circle

        // Shape s2 = new Shape();                // ОШИБКА КОМПИЛЯЦИИ: Shape — абстрактный класс, нельзя создать его экземпляр напрямую

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast Rectangle to Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());    // ОШИБКА КОМПИЛЯЦИИ: в классе Shape нет метода getLength()

        Rectangle r1 = (Rectangle) s3;            // Downcast к Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);               // Upcast Square to Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());      // ОШИБКА КОМПИЛЯЦИИ: в классе Shape нет метода getSide()

        Rectangle r2 = (Rectangle) s4;            // Downcast Shape s4 к суперклассу Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());      // ОШИБКА КОМПИЛЯЦИИ: ссылка r2 типа Rectangle, а метод getSide() определен только в Square
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;                 // Downcast Rectangle r2 к Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
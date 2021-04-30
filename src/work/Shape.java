package work;
interface Shape {//声明接口Shape
    final float PI = 3.14f; // 定义常量圆周率
    abstract void area();//定义抽象方法面积
    abstract void perimeter();//定义抽象方法周长
}
class bian {
    double width;// 定义变量宽
    double length;// 定义变量长
    double radius; // 定义变量半径
    double S;// 定义变量面积
    double C;// 定义变量周长
    public bian(double width, double length, double radius) {
        this.width = width;
        this.length = length;
        this.radius = radius;
    }
}
class Rectangle extends bian implements Shape {//实现接口
    public Rectangle(double width, double length, double radius) {
        super(width, length, radius);
    }
    public void area() {
        S = width * length;
        System.out.println("矩形面积:" + S);// 输出
    }
    public void perimeter() {
        C = (width + length) * 2;
        System.out.println("矩形周长:" + C);// 输出
    }
}
class Circle extends bian implements Shape {//实现接口
    public Circle(double width, double length, double radius) {
        super(width, length, radius);
    }
    public void area() {
        S = PI * radius * radius;
        System.out.println("圆形面积:" + S);// 输出
    }
    public void perimeter() {
        C = 2 * PI * radius;
        System.out.println("圆形周长:" + C);// 输出
    }
}
class Square extends bian implements Shape {//实现接口
    public Square(double width, double length, double radius) {
        super(width, length, radius);
    }
    public void area() {
        S = width * width;
        System.out.println("正方形面积:" + S);// 输出
    }
    public void perimeter() {
        C = (width + width) * 2;
        System.out.println("正方形周长:" + C);// 输出


    }
}
class jiekoutuxing {
    public static void main(String[] args) {
        Shape p1;//声明接口变量
        p1 = new Rectangle(4.0, 5.0, 0);//实现类对象赋值接口变量
        p1.area();//接口回调
        p1.perimeter();//接口回调
        p1 = new Circle(0, 0, 2.0);//实现类对象赋值接口变量
        p1.area();
        p1.perimeter();
        p1 = new Square(3.0, 0, 0);//实现类对象赋值接口变量
        p1.area();
        p1.perimeter();
    }
}


public  class Main {
    public  static   void main(String[] args) {
       Circle circle = new Circle(2.0);
       Circle circle1 = new Circle(1.1);
       Circle circle2 = new Circle();

            System.out.println(circle2);
            System.out.println(circle1);
            System.out.println("circle" + circle. getRadius()+"and area of "+ circle.getArea(circle.getRadius()));
    }
}

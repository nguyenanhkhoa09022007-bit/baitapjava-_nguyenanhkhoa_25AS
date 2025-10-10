public class Circle {
   private double radius;
   private String color;

   public  Circle() {
       this.radius= 1.0;
       this.color= "red";
   }

   public Circle(double r) {
       this.radius = r;
   }
   public  double getRadius(){
       return  radius;
   }
   public  double getArea(double radius){
       double area =  Math.PI*radius*radius;
       return area;
   }
   public void setRadius(double radius){

   };

}
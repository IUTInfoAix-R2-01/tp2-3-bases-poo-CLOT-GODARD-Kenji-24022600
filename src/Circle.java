public class Circle {
    public static void main(String[] args) {

    } 

    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
        return "[Color : " + this.color + ", Radius : " + this.radius + "]";
    }
}
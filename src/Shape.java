public class Shape {
protected double width;
protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return width*height;
    }


}

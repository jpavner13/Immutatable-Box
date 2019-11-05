public class Box{

    private double width ;
    private double height ;
    private double length ;

    public Box(double width, double height, double length){
        this.width = width ;
        this.height = height ;
        this.length = length ;
    }

    public double FindVolume(){
        return this.width * this.height * this.length ;
    }

    private double faceArea(){
        return this.width * this.height ;
    }

    private double bottomTopArea(){
        return this.width * this.length ;
    }

    private double sideArea(){
        return this.length * this.height ;
    }

    public double FindArea(){
        return (2 * (faceArea())) + (2 * (bottomTopArea()) + 2 * (sideArea())) ;
    }

    public double getWidth(){
        return this.width ;
    }

    public double getHeight(){
        return this.height ;
    }

    public double getLength(){
        return this.length ;
    }

    public static Box biggerBox(Box oldBox){
        double width ;
        double height ;
        double length ;

        width = oldBox.getWidth();
        height = oldBox.getHeight();
        length = oldBox.getLength();

        Box biggerBox = new Box((width * 1.25), (height * 1.25), (length * 1.25));

        return biggerBox;
    }

    public static Box smallerBox(Box oldBox){
        double width ;
        double height ;
        double length ;

        width = oldBox.getWidth();
        height = oldBox.getHeight();
        length = oldBox.getLength();

        Box smallerBox = new Box((width * .75), (height * .75), (length * .75));

        return smallerBox;
    }

    public static boolean fitBox(Box box1, Box box2){
        boolean fit = false ;

        if ((box1.getLength() < box2.getLength()) && (box1.getHeight() < box2.getHeight()) &&
            (box1.getWidth() < box2.getWidth())){
                fit = true ;
        }

        return fit ;
    }
}
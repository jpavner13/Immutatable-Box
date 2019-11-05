public class ImmutatableBox{

    public static void main(String[] args){
        Box box1 = new Box(2.5, 5.0, 6.0);
        Box box2 = new Box(box1.getWidth(), box1.getHeight(), box1.getLength());

        Box biggerBox = Box.biggerBox(box1);
        Box smallerBox = Box.smallerBox(box1);

        System.out.println("Surface Area " + box1.FindArea() + "\nVolume " + box1.FindVolume());
        System.out.println("\nSurface Area " + box2.FindArea() + "\nVolume " + box2.FindVolume());
        System.out.println("\nSurface Area " + biggerBox.FindArea() + "\nVolume " + biggerBox.FindVolume());
        System.out.println("\nSurface Area " + smallerBox.FindArea() + "\nVolume " + smallerBox.FindVolume());

        System.out.println("Does small box: Box1 \t Fit into big box: Box3?\n" + Box.fitBox(box1, biggerBox));
    } 
}
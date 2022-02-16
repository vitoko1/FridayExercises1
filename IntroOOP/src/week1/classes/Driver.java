package week1.classes;

public class Driver {


    public static void main(String[] args) {
        Integer width=5;
        Integer height=7 ;
        String color="Blue";
        Rectangle r1= new Rectangle( width,  height,  color);
        r1.draw();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Integer widthR2=10;
        Integer heightR2=2 ;
        String colorR2="Green";
        Rectangle r2= new Rectangle( widthR2,  heightR2,  colorR2);
        r2.draw();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Integer widthR3=15;
        Integer heightR3=12 ;
        String colorR3="Red";
        Rectangle r3= new Rectangle( widthR3,  heightR3,  colorR3);
        r3.draw();
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}

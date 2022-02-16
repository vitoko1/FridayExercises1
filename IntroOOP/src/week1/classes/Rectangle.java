package week1.classes;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

    private Integer width;
    private Integer height;
    private String color;

    public Rectangle(Integer width, Integer height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.length() > 2 && color.length() < 20) {
            Scanner lineScan = new Scanner(color);
            String colorCapitalized = "";
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                colorCapitalized += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
            this.color = colorCapitalized;
        } else {
            this.color = "Blue";
        }
    }

    public void setHeight(Integer height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public void setWidth(Integer width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }

    }

    public void draw(){

      char colorLetter=  getColor().charAt(0);
      int width= getWidth();
      int height = getHeight();

      for (int i= 0; i <= height-1 ; i++ ){
          System.out.println("");
          System.out.print(colorLetter);

          for(int j = 0; j <=width-2 ; j++){

              System.out.print(colorLetter);

          }
      }


    }


}

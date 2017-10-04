import java.awt.*;
import java.util.Scanner;

public class FlipPicture {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // read in the picture specified by command-line argument
        Picture picture = new Picture(args[0]);
        int width  = picture.width();
        int height = picture.height();
        picture.show();

        Picture flippedPicture = new Picture(width, height);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                Color color1 = picture.get(x,y);
                Color color2 = picture.get(width-x-1,y);
                flippedPicture.set(x,y,color2);
                flippedPicture.set(width-x-1,y,color1);
            }
            flippedPicture.show();
            //sc.nextLine();
        }
        flippedPicture.show();
    }

}

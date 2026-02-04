import images.APImage;
import images.Pixel;

public class ImageProcessor {

    public static APImage toGrayscale(APImage img) {
        APImage result = img.clone();

        for (Pixel p : result) {
            int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        }

        return result;
    }
}


 
package baitap.a3;

import java.awt.*;

public class shapefactory {
    static shape createshape(shapetype shapetype){
        switch (shapetype){
            case Rectangle -> {
                return Rectangle.getInstance();
            }
            case Triangle -> {
                return triangle.getInstance();
            }
            case Cricle -> {
                return Cricle.getInstance();
            }
            default -> {
                throw new IllegalComponentStateException("ko co hinh");
            }
        }

    }
}

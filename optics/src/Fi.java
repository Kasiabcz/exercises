import java.util.Scanner;

public class Fi {
    public double getRmax() {
        return Rmax;
    }

    public void setRmax(double rmax) {
        Rmax = rmax;
    }

    public double getPDop() {
        return PDop;
    }

    public void setPDop(double PDop) {
        this.PDop = PDop;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    private double Rmax;
    private double PDop;
    private double width;
    private double space;

}

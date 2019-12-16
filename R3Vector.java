import java.util.Scanner;
import java.util.Vector;

public class R3Vector {
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
    private double z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void show(R3Vector a) {
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
    }

    public static R3Vector plus(R3Vector a, R3Vector b) {
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);

    }

    public static R3Vector minus(R3Vector a, R3Vector b) {

        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static R3Vector mult(R3Vector a, double k) {

        return new R3Vector(k * a.x, k * a.y, k * a.z);
    }

    public static double scale(R3Vector a, R3Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.y;
    }

    public static R3Vector translate(R3Vector a, double k) {
        return new R3Vector(k * a.x, k * a.y, k * a.z);
    }

    public static R3Vector vector(R3Vector a, R3Vector b) {
        return new R3Vector(a.y * b.z - b.y * a.z, a.x * b.z - b.x * a.z, a.x * b.y - b.x * a.y);
    }
}
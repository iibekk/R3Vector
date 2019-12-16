public class Main {
    public static void main(String []args){

        R3Vector a =new R3Vector(3,2,1);
        R3Vector b =new R3Vector(1,1,1);
        R3Vector c =new R3Vector(3,1,1);

        System.out.println("Сложение:" );
        R3Vector.show(R3Vector.plus(a,b));
        System.out.println("Вычитание:");
        R3Vector.show(R3Vector.minus(a,b));
        System.out.println("Умножение на число");
        R3Vector.show(R3Vector.mult(a,2));
        System.out.println("Скалярное произведение:"+R3Vector.scale(a,b));
        System.out.println("Векторное произведение:");
        R3Vector.show(R3Vector.vector(a,b));
        R3Vector.show(R3Vector.translate(a, 4));
    }
}
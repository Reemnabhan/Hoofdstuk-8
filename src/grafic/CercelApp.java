package grafic;

public class CercelApp {

        public static void main(String[] args) {

            Circel c = new Circel();
            System.out.println(c.getRadius());
            System.out.println("Area" + c.getArea());
            System.out.println("Perimeter" + c.getPerimeter());
            System.out.println("-".repeat(30));
            c.grow(5);
            System.out.println(c.getRadius());
            System.out.println("-".repeat(30));
            Circel c2 = new Circel(10);
            System.out.println(Circel.getCount());
            System.out.println(c2.getArea());
        }
    }


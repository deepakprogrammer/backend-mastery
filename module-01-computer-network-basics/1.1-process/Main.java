//record Point(int x, int y){}

public class Main{
    public static void main(String[] args) {
        // Point p = new Point(3, 4);
        // System.out.println(p.x());
        // System.out.println(p);
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        System.out.println((p1 == p2));
    }
}

record Point(int x, int y){}
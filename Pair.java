public class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void lineFromPoints(Pair P, Pair Q) {
        // We can set the following values,
        // a = y2 - y1
        int a = Q.y - P.y;
        // b = x1 - x2
        int b = P.x - Q.x;
        // c = ax1 + by1
        int c = a * (P.x) + b * (Q.x);

        // now that we have the values of a, b and c we can calculate the line
        // in the coordinate plane
        if (b < 0) {
            System.out.println("The line passing trough points P and Q is:" + a + "x" + b + "y = " + c);
        } else {
            System.out.println("The line passing through points P and Q is: " + a + "x+" + b + "y = " + c);
        }
        ;

    }
}
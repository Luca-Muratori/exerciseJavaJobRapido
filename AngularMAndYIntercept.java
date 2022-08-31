public class AngularMAndYIntercept {
    // alpha= angle create with the interception with the x-axis
    // q= y-intercept value
    double alpha, q;

    public AngularMAndYIntercept(double alpha, double q) {
        this.alpha = alpha;
        this.q = q;
    }

    static void lineFromMAndQ(AngularMAndYIntercept data) {
        // 1) we need to convert the angular value in radians
        double radians = Math.toRadians(data.alpha);

        // 2) then we calculate the tangent to calculate the angular coefficient
        // m=tan(alpha)
        // and we save the value in the variable m
        double m = Math.tan(radians);

        // 3) now we calculate the definition of the line with m and q
        if (data.q < 0) {
            System.out.println("the value if the line is: y= " + m + "x " + data.q);

        } else {

            System.out.println("the value if the line is: y= " + m + "x +" + data.q);
        }
    }

}

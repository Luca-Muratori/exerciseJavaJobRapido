public class DoublePair {
    int xA, yA;
    int xB, yB;
    static float mLineA, qLineA;
    static float mLineB, qLineB;
    static float xPointIntercept, yPointIntercept;

    public DoublePair(int xA, int yA, int xB, int yB) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }

    static void checkParallelism(DoublePair LineA, DoublePair LineB) {
        // to check if the two lines are parallel we need to calculate the slope each
        // line,
        // with the formula: (yB-yA)/(xB-xA), and if they are the same it means that
        // they are parallel, otherwise no
        if ((LineA.xB - LineA.xA) != 0 && (LineB.xB - LineB.xA) != 0) {
            mLineA = (LineA.yB - LineA.yA) / (LineA.xB - LineA.xA);
            mLineB = (LineB.yB - LineB.yA) / (LineB.xB - LineB.xA);
            if (mLineA == mLineB) {
                System.out.println("The two line are parallel");
            } else {
                System.out.println("The two line aren't parallel");
            }
        } else {
            System.out.println("Impossible to calculate the slope of the line, change the values");
        }

    }

    static void checkPerpendicular(DoublePair LineA, DoublePair LineB) {
        // to check the perpendicularity of two line we need to check the angular
        // coefficient (mLine); if the two m , mLineA and mLineB, are reciprocal than
        // the two line are perpendicular

        if ((LineA.xB - LineA.xA) != 0 && (LineB.xB - LineB.xA) != 0) {
            mLineA = (LineA.yB - LineA.yA) / (LineA.xB - LineA.xA);
            mLineB = (LineB.yB - LineB.yA) / (LineB.xB - LineB.xA);
            if (mLineA == -1 / mLineB || mLineB == -1 / mLineA) {
                System.out.println("The two line are perpendicular");
            } else {
                System.out.println("The two line aren't perpendicular");
            }
        } else {
            System.out.println("Impossible to calculate the slope of the line, change the values");
        }
    }

    static void checkIncidence(DoublePair LineA, DoublePair LineB) {
        // first we need to define lineA, using the angular coefficient mLine, and the
        // y-interecept, qLine

        mLineA = (LineA.yB - LineA.yA) / (LineA.xB - LineA.xA);
        qLineA = LineA.yA - mLineA * (LineA.xA);

        mLineB = (LineB.yB - LineB.yA) / (LineB.xB - LineB.xA);
        qLineB = LineB.yA - mLineB * (LineB.xA);

        // if the m is equal in both of the lines than we return the function that
        // control if they are parallel, with no incident points
        if (mLineA == mLineB) {
            checkParallelism(LineA, LineB);
        } else {
            // if mLine is not equal, we than calculate the incident points
            xPointIntercept = ((qLineB - qLineA) / (mLineA - mLineB));
            yPointIntercept = mLineA * xPointIntercept + qLineA;
            System.out.println("The line intercept in the point with coordinates: ");
            System.out.println("x: " + xPointIntercept);
            System.out.println("y: " + yPointIntercept);

        }

        // now we need to calculate the coordinates of the intercept;

    }

}

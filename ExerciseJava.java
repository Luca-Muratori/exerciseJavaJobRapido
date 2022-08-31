//Definition of a line by means of two points

public class ExerciseJava {
    public static void main(String[] args) {
        String space = "=====================";

        // exercise 1
        Pair P = new Pair(3, 2);
        Pair Q = new Pair(2, 6);

        System.out.println("Exercise 1-Definition of a line by means of two points: ");
        Pair.lineFromPoints(P, Q);
        System.out.println(space);

        // exercise 2
        AngularMAndYIntercept data = new AngularMAndYIntercept(30.0, 2.4);

        System.out.println("Exercise 2- Definition of a line by means of gradient and y-intercept: ");
        AngularMAndYIntercept.lineFromMAndQ(data);
        System.out.println(space);

        // exercise 3-4-5
        DoublePair lineA = new DoublePair(1, 2, 3, 4);
        DoublePair lineB = new DoublePair(1, 3, 5, 6);

        System.out.println("Exercise 3- Condition of parallelism of two lines: ");
        DoublePair.checkParallelism(lineA, lineB);
        System.out.println(space);

        System.out.println("Exercise 4- Condition of perpendicularity of two lines: ");
        DoublePair.checkPerpendicular(lineA, lineB);
        System.out.println(space);

        System.out.println("Exercise 5- Condition of incidence of two lines and definition of the incidence point: ");
        DoublePair.checkIncidence(lineA, lineB);

    }

    // this function will return the definition of the line given two points

}
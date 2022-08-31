import org.junit.Test;

public class AppTest {
    @Test
    public void test1() {
        Pair P = new Pair(3, 2);
        Pair Q = new Pair(2, 6);

        Pair.lineFromPoints(P, Q);
    }

    @Test
    public void test2() {
        AngularMAndYIntercept data = new AngularMAndYIntercept(30.0, 2.4);
        AngularMAndYIntercept.lineFromMAndQ(data);
    }

    @Test
    public void test3() {
        DoublePair lineA = new DoublePair(1, 2, 3, 4);
        DoublePair lineB = new DoublePair(1, 3, 5, 6);

        DoublePair.checkParallelism(lineA, lineB);

    }

    @Test
    public void test4() {
        DoublePair lineA = new DoublePair(1, 2, 3, 4);
        DoublePair lineB = new DoublePair(1, 3, 5, 6);

        DoublePair.checkPerpendicular(lineA, lineB);

    }

    @Test
    public void test5() {
        DoublePair lineA = new DoublePair(1, 2, 3, 4);
        DoublePair lineB = new DoublePair(1, 3, 5, 6);

        DoublePair.checkIncidence(lineA, lineB);

    }
}
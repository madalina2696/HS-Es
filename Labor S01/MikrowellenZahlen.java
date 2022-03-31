import java.awt.Point;

public class MikrowellenZahlen {

    public static void main(String[] args) {

        String sec = args[0];

        double distanceSec = 0;
        for (int i = 0; i < sec.replace("*", "").length(); i++) {
            distanceSec = distanceSec + distanceCalc(sec, i);
        }

        String min = secToMin(Integer.parseInt(sec.replace("*", "")));

        double distanceMin = 0;
        for (int i = 0; i < min.replace("*", "").length(); i++) {
            distanceMin = distanceMin + distanceCalc(min, i);
        }

        if (distanceMin > distanceSec) {
            System.out.println(sec);
        } else if (distanceSec > distanceMin) {
            System.out.println(min);
        } else if (distanceMin == distanceSec) {
            System.out.println(sec);
        }
    }

    private static double distanceCalc(String value, int row) {

        Point one = new Point(0, 0);
        Point two = new Point(1, 0);
        Point three = new Point(2, 0);
        Point four = new Point(0, 1);
        Point five = new Point(1, 1);
        Point six = new Point(2, 1);
        Point seven = new Point(0, 2);
        Point eight = new Point(1, 2);
        Point nine = new Point(2, 2);
        Point zero = new Point(1, 3);
        Point star = new Point(2, 3);

        Point R1 = new Point();
        Point R2 = new Point();

        if (value.charAt(row) == '1') {
            R1 = one;
        } else if (value.charAt(row) == '2') {
            R1 = two;
        } else if (value.charAt(row) == '3') {
            R1 = three;
        } else if (value.charAt(row) == '4') {
            R1 = four;
        } else if (value.charAt(row) == '5') {
            R1 = five;
        } else if (value.charAt(row) == '6') {
            R1 = six;
        } else if (value.charAt(row) == '7') {
            R1 = seven;
        } else if (value.charAt(row) == '8') {
            R1 = eight;
        } else if (value.charAt(row) == '9') {
            R1 = nine;
        } else if (value.charAt(row) == '0') {
            R1 = zero;
        } else if (value.charAt(row) == '*') {
            R1 = star;
        }

        if (value.charAt(row + 1) == '1') {
            R2 = one;
        } else if (value.charAt(row + 1) == '2') {
            R2 = two;
        } else if (value.charAt(row + 1) == '3') {
            R2 = three;
        } else if (value.charAt(row + 1) == '4') {
            R2 = four;
        } else if (value.charAt(row + 1) == '5') {
            R2 = five;
        } else if (value.charAt(row + 1) == '6') {
            R2 = six;
        } else if (value.charAt(row + 1) == '7') {
            R2 = seven;
        } else if (value.charAt(row + 1) == '8') {
            R2 = eight;
        } else if (value.charAt(row + 1) == '9') {
            R2 = nine;
        } else if (value.charAt(row + 1) == '0') {
            R2 = zero;
        } else if (value.charAt(row + 1) == '*') {
            R2 = star;
        }

        return R1.distance(R2);
    }

    private static String secToMin(int sec) {

        int coreMin;
        int min;
        int rest;

        if (sec / 60 != 0) {
            coreMin = sec / 60;
            rest = sec % 60;
            min = coreMin * 100 + rest;
        } else {
            min = sec;
        }
        return min + "*";

    }

}
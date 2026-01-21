package se.kth.DD2480;


public class CMV {
    public CMV() {
    }

    boolean lic0(double length, Point[] points) {
        int l = points.length;
        for (int i = 0; i < l - 1; ++i) {
            if (points[i].distance(points[i + 1]) > length) return true;
        }
        return false;
    }
}

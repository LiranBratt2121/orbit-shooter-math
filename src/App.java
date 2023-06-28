public class App {
    public static void main(String[] args) {
        final double RAD2DEG = 180 / Math.PI;
        final int DY = 7;
        final double V = 13.298;

        for (double i = 0.5; i < 20; i += 0.5) {
            double dx = i;
            double k = (4.9 * dx * dx) / (V * V);

            double a = DY * DY + dx + dx;
            double b = 2 * k * DY - (dx * dx);
            double c = k * k;

            double[] result = calcQuadratic(a, b, c);

            System.out.println("Delta X distance: " + i);

            for (var root : result) {
                if (root >= 0 && root <= 1) {
                    double angle = Math.acos(Math.sqrt(root)) * RAD2DEG;
                    System.out.println(angle);

                    double negativeAngle = -angle;
                    System.out.println(negativeAngle);
                }
            }
        }
    }

    public static double[] calcQuadratic(double a, double b, double c) {
        double[] result = new double[2];

        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            result[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            result[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        }

        return result;
    }
}

package moduleTwice.labwork24.labwork247;

class GravityCalculator {
    private static final double Acceleration = -9.81;
    private static double velocity = 0;
    private static double position = 0;

    public static double calculateDistance(double time) {
        return 0.5 * Acceleration * (time * 2) + velocity * time + position;
    }
}
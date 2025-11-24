public class AeroCalculator {

    final double airDensity = 1.225; // kg/m3 constant

    public double staticMargin(Aircraft a) {
        return ((a.neutralPoint - a.cg) / a.mac) * 100;
    }

    public String stabilityStatus(double margin) {
        if (margin > 5) return "Stable";
        else if (margin >= 0) return "Marginally Stable";
        else return "Unstable";
    }

    public double liftCoefficient(Aircraft a) {
        return (2 * a.weight) / (airDensity * Math.pow(a.velocity, 2) * a.area);
    }

    public double stallSpeed(Aircraft a) {
        return Math.sqrt((2 * a.weight) / (airDensity * a.area * a.clMax));
    }

    public boolean canTakeoff(Aircraft a) {
        double requiredDistance = Math.pow((stallSpeed(a) * 1.3), 2);
        return requiredDistance < a.runwayLength;
    }
}

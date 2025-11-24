public class Aircraft {
    String name;
    double mac, cg, neutralPoint, weight, area, velocity, clMax, runwayLength;

    public Aircraft(String name, double mac, double cg, double neutralPoint,
                    double weight, double area, double velocity, double clMax, double runwayLength) {
        this.name = name;
        this.mac = mac;
        this.cg = cg;
        this.neutralPoint = neutralPoint;
        this.weight = weight;
        this.area = area;
        this.velocity = velocity;
        this.clMax = clMax;
        this.runwayLength = runwayLength;
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AFSPA_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AeroCalculator calc = new AeroCalculator();

        System.out.println("\n===== Aero Flight Stability & Performance Analyzer =====\n");

        System.out.print("Enter Aircraft Name: ");
        String name = sc.nextLine();

        try {
            System.out.print("Enter MAC (m): ");
            double mac = sc.nextDouble();

            System.out.print("Enter CG location (m): ");
            double cg = sc.nextDouble();

            System.out.print("Enter Neutral Point (m): ");
            double np = sc.nextDouble();

            System.out.print("Enter Weight (Newtons): ");
            double weight = sc.nextDouble();

            System.out.print("Enter Wing Area (m²): ");
            double area = sc.nextDouble();

            System.out.print("Enter Cruise Velocity (m/s): ");
            double velocity = sc.nextDouble();

            System.out.print("Enter Cl_max: ");
            double clMax = sc.nextDouble();

            System.out.print("Enter Available Runway Length (m): ");
            double runway = sc.nextDouble();

            Aircraft a = new Aircraft(name, mac, cg, np, weight, area, velocity, clMax, runway);

            double margin = calc.staticMargin(a);
            double cl = calc.liftCoefficient(a);
            double vStall = calc.stallSpeed(a);

            System.out.println("\n-------- ANALYSIS RESULT --------");
            System.out.printf("Static Margin: %.2f%% → %s%n", margin, calc.stabilityStatus(margin));
            System.out.printf("Lift Coefficient (Cl): %.3f%n", cl);
            System.out.printf("Stall Speed: %.2f m/s%n", vStall);
            System.out.println("Takeoff Feasibility: " + (calc.canTakeoff(a) ? "Possible" : "Not Possible"));

            saveResults(a.name, margin, cl, vStall, calc.canTakeoff(a));
            System.out.println("\nResults saved to: aircraft_results.csv");

        } catch (Exception e) {
            System.out.println("\nInvalid input. Please enter numbers only.");
        }

        System.out.println("\n--------------------------------------------");
        System.out.println("Program Completed.");
    }

    public static void saveResults(String name, double margin, double cl, double stallSpeed, boolean canTakeoff) {
        try(FileWriter file = new FileWriter("aircraft_results.csv", true)) {
            file.append(name + "," + margin + "," + cl + "," + stallSpeed + "," + canTakeoff + "\n");
        } catch(IOException e) {
            System.out.println("Error saving data file.");
        }
    }
}

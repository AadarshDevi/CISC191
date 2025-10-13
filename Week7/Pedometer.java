package week_7;

public class Pedometer {
    private final int steps;

    public Pedometer(int steps) throws NegativeNumberException {
        if (steps < 0) throw new NegativeNumberException();
        this.steps = steps;
    }

    public double stepsToMiles() {
        return (double) ((steps) / 2000);
    }

}

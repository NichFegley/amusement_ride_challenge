// test
public class AmusementRide
{
    // instance variables
    int age;
    double height; // height in cm
    boolean healthCondition; // true for health condition present, false if no health condition

    public AmusementRide(int a, double h, boolean hC)
    {
        age = a;
        height = h;
        healthCondition = hC;
    }

    public boolean canRide()
    {
        if (age<10) {
            return false; //not old enough
        }
        if (height<140.0){
            return false; //not tall enough
        }
        if (healthCondition==true){
            return false; //unsafe for rider
        }
        else {
            return true;
        }
    }
}
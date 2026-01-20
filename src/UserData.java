/**
 * JavaDocs go here.
 * 
 */
public class UserData {
    //Put all instance variables here
    private double dailyDrivingHours;

    /**
     * The constructor for the UserData class
     * @param dailyDrivingHours the average nuber of hours driven each day
     */
    public UserData(double dailyDrivingHours) {
        this.dailyDrivingHours = dailyDrivingHours;
    }

    /**
     * The 'getter' method for the dailyDrivingHours variable
     * @return the dailyDrivingHours value from the object
     */
    public double getDailyDrivingHours () {
        return dailyDrivingHours;
    }
    
    /**
     * Calculates the net carbon impact of the user
     * @return the net carbon impact of the user
     */
    public double getNetCarbonImpact () {
        return 0.0;
    }
}

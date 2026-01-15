/**
 * JavaDocs go here
 * 
 */

public class UserData {
    //Put all instance variables here
    public double dailyDrivingHours;

    //Constructor
    //Put any values that you want to enter upon object creation here - e.g. dailyDrivingHours
    public UserData(double dailyDrivingHours) {
        this.dailyDrivingHours = dailyDrivingHours;
    }

    //DailyDrivingHours 'getter' command
    public double getDailyDrivingHours () {
        return dailyDrivingHours;
    }
}

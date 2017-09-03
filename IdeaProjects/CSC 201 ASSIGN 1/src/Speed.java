/**GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007

 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *
 */
public class Speed {
/** the class computes a speed with a predetermined time and distance*/
public  static float velocity  (float miles , float totTimehr)
/** the velocity() function computes the average speed km/hr */
    {
    final float One_Mileto_Km = (float) 1.6;
    float avgspeed;
        avgspeed = (float) ((miles * One_Mileto_Km)/ totTimehr);
        System.out.println("The average speed in km/hr is " + avgspeed);

        return avgspeed;
    } ;

public static void main (String[] args ){
    //variables are of type float
                float miles = 24 ;
                float hour = 1;
                float min =  40;
                float secs = 35;
                float totTimehr = hour + ( min/60) + (secs / 3600);
    /**the velocity method calls the velocity function with args
     * of miles and time in hours only
     */
    velocity ( miles,totTimehr );


};



};

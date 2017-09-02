

public class Speed {

public  static float velocity  (float miles , float totTimehr)
    {
    final float One_Mileto_Km = (float) 1.6;
    float avgspeed;
        avgspeed = (float) ((miles * One_Mileto_Km)/ totTimehr);
        System.out.println("The average speed in km/hr is " + avgspeed);

        return avgspeed;
    } ;

public static void main (String[] args ){
                float miles = 24 ;
                float hour = 1;
                float min =  40;
                float secs = 35;
                float totTimehr = hour + ( min/60) + (secs / 3600);

                velocity ( miles,totTimehr );


};



};
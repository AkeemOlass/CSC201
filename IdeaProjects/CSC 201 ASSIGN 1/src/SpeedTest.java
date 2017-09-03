import org.junit.Assert;
/** test the validity of the class Speed*/
public class SpeedTest {
    @org.junit.Test
    public void velocity()  {

            float expected_result = Speed.velocity ( 24, (float) 1.676) ;
            Assert.assertEquals( expected_result ,45, 0.0002);
            //System.out.println(Speed.velocity(5,8));

        };

    }



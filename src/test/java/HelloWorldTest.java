import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;



import static org.junit.Assert.*;

public class HelloWorldTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        HelloWorld test = new HelloWorld();
        Assert.assertTrue(test.getTrue());
    }

    @Test
    public void testNetworkResponse() {
        given().
                when().get("http://www.google.com").
                then().statusCode(200);
    }
}
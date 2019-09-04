import org.junit.*;

public class DefaultTest {

    private String target=new String("asdfgh");

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Se ruleaza beforeClass");
    }

    @Before
    public void init(){
        System.out.println("Se ruleaza before");
    }

    @Test
    public void testInitial(){
        System.out.println("In testul nr 1");
    }

    @Test
    public void testInitial2(){
        System.out.println("In testul nr 2");
    }

    @After
    public void destroy(){
        System.out.println("Se ruleaza after");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Se ruleaza afterClass");
    }
}

import com.sudharsanan.Addition;
import org.junit.Test;
public class AdditionTest{

@Test
public void testadd()
{
    int a=10, b=8;
    Addition additionObj=new Addition();
    int c= additionObj.add(a,b);
    System.out.println(c);
   
}
}
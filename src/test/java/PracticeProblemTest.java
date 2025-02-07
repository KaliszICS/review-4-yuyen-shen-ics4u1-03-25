import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();

   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }
   
   @Test
   public void testQ1_1()
   {
     InputStream originalIn = System.in;
      String data = "6";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input an integer: 61\n", bos.toString());
   }

    @Test
   public void testQ1_2()
   {
     InputStream originalIn = System.in;
      String data = "0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input an integer: 55\n", bos.toString());
   }

    @Test
   public void testQ2_1()
   {
     InputStream originalIn = System.in;
      String data = "2.5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: 45.93\n", bos.toString());
   }

    @Test
   public void testQ2_2()
   {
     InputStream originalIn = System.in;
      String data = "5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: 456.4\n", bos.toString());
   }

    @Test
   public void testQ3_1()
   {
     InputStream originalIn = System.in;
      String data = "false\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a boolean: true\n", bos.toString());
   }

    @Test
   public void testQ3_2()
   {
     InputStream originalIn = System.in;
      String data = "true\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a boolean: false\n", bos.toString());
   }

    @Test
   public void testQ4_1()
   {
     InputStream originalIn = System.in;
      String data = "5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input an integer: 7\n", bos.toString());
   }

    @Test
   public void testQ4_2()
   {
     InputStream originalIn = System.in;
      String data = "8\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input an integer: U\n", bos.toString());
   }

   @Test
   public void testQ5_1()
   {
     InputStream originalIn = System.in;
      String data = "1";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input an integer: 5.0\n", bos.toString());
   }

    @Test
   public void testQ5_2()
   {
     InputStream originalIn = System.in;
      String data = "25";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input an integer: 125.0\n", bos.toString());
   }

    @Test
   public void testQ6_1()
   {
     InputStream originalIn = System.in;
      String data = "55.5";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a number: 155\n", bos.toString());
   }

    @Test
   public void testQ6_2()
   {
     InputStream originalIn = System.in;
      String data = "42.1";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a number: 142\n", bos.toString());
   }
   
}

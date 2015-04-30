package JUnit 4; 
import calc.Calculator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
　private static Calculator calculator = new Calculator();
　@Before public void clearCalculator() {
calculator.clear();
　}
　@Test public void add() {
calculator.add(1); 
calculator.add(1);
assertEquals(calculator.getResult()， 2);
　}
　@Test public void subtract() {
calculator.add(10);
calculator.subtract(2);
assertEquals(calculator.getResult()， 8);
　}
　@Test public void divide() {
calculator.add(8);
calculator.divide(2);
assert calculator.getResult() == 5;
　}
　@Test(expected = ArithmeticException.class)
　public void divideByZero() {
calculator.divide(0);
　}
　@Ignore("not ready yet")
　@Test 
　public void multiply() {
calculator.add(10);
calculator.multiply(10);
assertEquals(calculator.getResult()， 100);
　}
} 

package junit3;
import calc.Calculator;
import junit.Framework.TestCase;
public class CalculatorTest extends TestCase {
　private static Calculator calculator = new Calculator();
　@Override protected void setUp() { calculator.clear(); }
　public void testAdd() { 
calculator.add(1); 
calculator.add(1); 
assertEquals(calculator.getResult()， 2);
　}
　public void testSubtract() {
calculator.add(10); 
calculator.subtract(2);
assertEquals(calculator.getResult()， 8);
　}
　public void testDivide() { 
calculator.add(8);
calculator.divide(2);
assert calculator.getResult() == 5;
　}
　public void testDivideByZero() {
try { 
　calculator.divide(0);
　fail();
}
catch (ArithmeticException e) { }
　}
　public void notReadyYetTestMultiply() {
calculator.add(10);
calculator.multiply(10);
assertEquals(calculator.getResult()， 100);
　}
} 

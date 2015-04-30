package calc;
public class Calculator {
　private static int result; //存储结果的静态变量
　public void add(int n) {
result = result + n;
　}
　public void substract(int n) {
result = result - 1; //错误：应该是"result = result - n"
　}
　public void multiply(int n) {} //还没实现
　public void divide(int n) {
result = result / n;
　}
　public void square(int n) {
result = n * n;
　}
　public void squareRoot(int n) {
for (; ;) ; //错误：无限循环
　}
　public void clear() { //清除结果
result = 0;
　}
　public void switchOn() { //打开屏幕，显示"hello"，并报警
result = 0; //实现其它的计算器功能
　}
　public void switchOff() { } //显示"bye bye"，报警，并关闭屏幕
　public int getResult() {
return result;
　}
} 

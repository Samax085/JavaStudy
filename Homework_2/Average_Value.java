package Homework_2;

public class Average_Value {

    public int a, b, c;

    public Average_Value(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //    public void resultCalculate(){
//        int averNum = calculate();
//        System.out.println(averNum);
//    }

    public int calculate(){
        int result = a + b;
        int averNum = result / 2;
        return averNum;
    }

    public int calculate1(){
        int result = a + b + c;
        int averNum1 = result / 3;
        return averNum1;
    }
}


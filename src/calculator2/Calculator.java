package calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }
    public List<Integer> getResults(){
        return this.results;
    }
    public void setResults(List<Integer> results){
        this.results = results;
    }


    public int sum (int number, int number2) {
        int result = number + number2;
        results.add(result);
        System.out.println("result = " + result);
        return result;

    }

    public int sub (int number, int number2) {
        int result = number - number2;
        results.add(result);
        System.out.println("result = " + result);
        return number - number2;

    }

    public int mul (int number, int number2) {
        int result= number * number2;
        results.add(result);
        System.out.println("result = " + result);
        return number * number2;

    }

    public int div (int number, int number2) {
        int result= number / number2;
        if (number2 == 0) {
            System.out.println("0으로는 나누기를 할 수 없습니다!");
        }
        results.add(result);
        System.out.println("result = " + result);
        return number / number2;
    }
}

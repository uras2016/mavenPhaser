package ua.goit.java;

public class Runner {

    public static void main(String[] args) {
        SquareSumRealization square = new SquareSumRealization();

        int[] value = new int [10000];

        for (int i = 0; i < value.length; i++) {
            value[i] = (int)(10+(Math.random()*(100-10)));// 10-100

        }

        Long result = square.getSquareSum(value, 4);
        System.out.println(result);
    }
}

package Homework;

public class HomeworkOne {
//    public char reverse(char ch) {
//        if ((int) ch <= 'Z' && (int) ch >= 'A') {
//            ch += 32;
//        }
//        if ((int) ch <= 'z' && (int) ch >= 'a') {
//            ch -= 32;
//        }
//        return ch;
//    }
//
//    public boolean isTrangle(int a, int b, int c) {
//        boolean is = false;
//        if (a + b > c && a + c > b && b + c > a) {
//            is = true;
//        }
//        return is;
//    }
//
//    public void printPrimeNum() {
//        for (int i = 2; i < 100; i++) {
//            boolean is = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    is = false;
//                    break;
//                }
//            }
//            if (is) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public void sort(int[] a) {
//        for (int k = 1; k < a.length - 1; k++) {
//            for (int i = 0; i <= a.length; i++) {
//                if (i + 1 < a.length) {
//                    if (a[i] > a[i + 1]) {
//                        int j = a[i];
//                        a[i] = a[i + 1];
//                        a[i + 1] = j;
//                    }
//                }
//            }
//        }
//    }
//
//    public int carryNum(int num1, int num2) {
//        int result = 0;
//        int j=0;
//        for (int i = 0; i < 5; i++) {
//            if (num1 / Math.pow(10,i)%10  + num2 / Math.pow(10,i)%10+j>=10) {
//                result += 1;
//                j=1;
//            }
//            else j=0;
//    }
//            return result;
//        }
//
//        public int sum(int[] array,int n){
//        int sum=0;
//            for (int j : array) {
//                sum += j;
//            }
//            return sum;
//        }
//
//        public long fib(int n){
//            long[] fibonacci=new long[n+1];
//            fibonacci[0]=1;
//            fibonacci[1]=1;
//            for (int i = 2; i <n; i++) {
//                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
//            }
//            return fibonacci[n-1];
//        }


    private String name;
    int age;

    HomeworkOne(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    public int age(){
//        this.age+=1;
//        return this.age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void age(){
        age+=1;
        System.out.println(age);
    }
    void assingWork(int x){
        System.out.println("老师布置了"+x+"道作业");
    }
}



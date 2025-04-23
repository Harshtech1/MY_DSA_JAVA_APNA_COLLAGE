package OOPS;

class Calculator {
    public static void main(String[] args) {
        Calculator_ cal = new Calculator_();
        int G = cal.sum(5, 10);
        float f = cal.sum(5.5f, 10.5f);
        int h = cal.sum(3, 4, 6);
        System.out.println("Sum of 2 ints: " + G);
        System.out.println("Sum of 2 floats: " + f);
        System.out.println("Sum of 3 ints: " + h);
    }
}

class Calculator_ {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

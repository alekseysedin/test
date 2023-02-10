public class Main {
    private static void say(String s) {
        System.out.println((s));
    }

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int d = calc.multiply.apply(2, 4);
            int e = calc.devide.apply(6, 0);
            int f = calc.pow.apply(6);
            int g = calc.abs.apply(-6);
            boolean h = calc.isPositive.test(6);
            int c = calc.devide.apply(2, 3);
            calc.println.accept(a);


//        OnTaskDoneListener Listener = System.out::println;
//        OnTaskErrorListener ListenerError = System.out::println;
//        Worker worker = new Worker(Listener, ListenerError);
//        worker.start();


    }
}
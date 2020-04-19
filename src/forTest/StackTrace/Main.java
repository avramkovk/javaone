package forTest.StackTrace;

/* Стэктрейс для method2()
0 getStackTrace - всегда первый в массиве
1 method2       - второй текущий метод
2 method1       - метод, который вызван из текущего
3 main          - и так до самого первого метода main(), всегда последний в массиве

методы в порядке вызова: main() -> method1() -> method2()
*/
public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(i + " " + stackTraceElements[i].getMethodName());
        }

    }
}

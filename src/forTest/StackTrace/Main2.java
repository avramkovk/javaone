package forTest.StackTrace;


/*
Стек-трейс длиной 10 вызовов

Каждый метод возвращает массив StackTraceElement[]
Поэтому у каждого метода можно вызвать .length() , то есть узнать длину массива
method10() имеет длину массива в три элемента: main-method10()-getStackTrace()
Соответственно method1() 12 элементов: main->method1()...method10()-getStackTrace()

При вызове из main метода method1() получается следующая последовательность:
1) main вызывает method1()
2) method1() вызывает method2()
3) method2() вызывает method3()
4) method3() вызывает method4()
5) method4() вызывает method5()
6) method5() вызывает method6()
7) method6() вызывает method7()
8) method7() вызывает method8()
9) method8() вызывает method9()
10) method9() вызывает method10()
11) method10() вызывает getStackTrace()
12) собственно сам getStackTrace()

Итого: 12 элементов массива Стека и, соответственно, длина этого массива method1().length тоже равна 12.

А при вызове из main метода method10() получается следующая последовательность:
1) main вызывает method10()
2) method10() вызывает getStackTrace()
3) собственно сам getStackTrace()

Итого: 3 элемента массива Стека и, соответственно, длина этого массива method10().length тоже равна 3.
*/


public class Main2 {
    public static void main(String[] args)
    {
        int stackTraceLength = (method1().length - method10().length) + 1;
        System.out.println(stackTraceLength);
        method10();
    }

    public static StackTraceElement[] method1() {//12
/*        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement s:stackTraceElements){
            System.out.println(s.getMethodName());
        }*/
        return method2();
    }

    public static StackTraceElement[] method2() {//11
        return method3();
    }

    public static StackTraceElement[] method3() {//10
        return method4();
    }

    public static StackTraceElement[] method4() {//9
        return method5();
    }

    public static StackTraceElement[] method5() {//8
        return method6();
    }

    public static StackTraceElement[] method6() {//7
        return method7();
    }

    public static StackTraceElement[] method7() {//6
        return method8();
    }

    public static StackTraceElement[] method8() {//5
        return method9();
    }

    public static StackTraceElement[] method9() {//4

        return method10();
    }

    public static StackTraceElement[] method10() {//3
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement s:stackTraceElements){
            System.out.println(s.getMethodName());
        }
        return Thread.currentThread().getStackTrace();
    }
}

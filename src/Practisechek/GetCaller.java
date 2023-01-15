package Practisechek;
import java.util.logging.*;

public class GetCaller {


    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        return (stackTraceElements.length < 3 ? null : stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName());
    }
}


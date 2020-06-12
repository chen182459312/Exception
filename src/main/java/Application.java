import java.io.PrintWriter;
import java.io.StringWriter;

public class Application {
    public static void main(String[] args) {
        try {
//            postThrowd();
//            nullThrowd();
            A a = new A();
            a.callA();
        } catch (Exception e) {
            System.out.println("--begin------------------\n");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            System.out.println(stringWriter.toString());
            System.out.println("--end------------------\n");
        } finally {
            System.out.println("--finally------------------\n");
        }
    }

    static void postThrowd() throws Exception {
        throw new Exception();
    }

    static void nullThrowd() throws NullPointerException {

    }
}


class A {
    B b = new B();
    public void callA() throws Exception {
        b.callB();
    }
}

class B {
    public void callB() throws Exception{
        throw new NullPointerException();
    }
}

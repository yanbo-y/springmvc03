package demo;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/8.
 */
public class user {
    @Test
    public void aa() {
        // int a,b=6;
        int a =1;
        int b =2;
        if (a>b && b>a++) {
            System.out.println(a ==b);
            System.out.println(a);
            System.out.println("this's in my controlxxx44x");
        } else {
            System.out.println("that's impossible");
            System.out.println(a);
        }
    }
}

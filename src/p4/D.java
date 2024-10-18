package p4;



import p1.*;
import p1.p2.p3.*;
import p4.p5.E;

import static p1.p2.B.method1;



public class D {
    
   A i = new A(1);
   C e = new C(1);
   E x = new E();

  int a = method1(i.mar, e.v , x.l);

    public void pk() {
        System.out.println(a);
    }
}

class H {
    public static void main(String[] args) {
        D k = new D();
        k.pk();


    }

}
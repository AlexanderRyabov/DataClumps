package com.aurea.antipatterns.dataclump.usecase2;

//CHECKSTYLE:OFF
public class Class2 {
    public void methodA(String a, int b, int c, int d, int e) {
        Class3 class3 = new Class3();
        class3.methodZ(a, b, c, d);
    }

    public void methodX(int x, int y, int z) {
        Class3 class3 = new Class3();
        class3.methodX(x, y, z, "dummy");
    }
}


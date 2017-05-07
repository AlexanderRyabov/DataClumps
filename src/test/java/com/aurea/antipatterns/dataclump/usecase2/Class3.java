package com.aurea.antipatterns.dataclump.usecase2;

//CHECKSTYLE:OFF
public class Class3 {
    public void methodX(int x, int y, int z, String m) {
        methodY(x, y, z);
    }

    public void methodY(int x, int y, int z) {}

    public void methodZ(String a, int b, int c, int d) {};
}


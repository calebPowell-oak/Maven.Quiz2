package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer in;
    public WuTangConcatenator(Integer input) {
        this.in = input;
    }

    public Boolean isWu() {
        return (in % 3 == 0);
    }

    public Boolean isTang() {
        return (in % 5 == 0);
    }

    public Boolean isWuTang() {
        return (in % 3 == 0 && in % 5 == 0);
    }
}

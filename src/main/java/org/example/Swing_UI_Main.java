package org.example;

import jdepend.swingui.JDepend;

public class Swing_UI_Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("E:\\www\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}

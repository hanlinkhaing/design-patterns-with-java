package com.smiles.basic;

public class InheritanceEg {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.enable();
    }

    static class UIControl {
        public void enable() {
            System.out.println("Enabled");
        }
    }

    static class CheckBox extends UIControl {

    }
}

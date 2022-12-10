package com.smiles.basic;

public class PolymorphismEg {
    public static void main(String[] args) {
        UIControl ui = new CheckBox();
        ui.enable();
        ui.draw();
        ui = new TextBox();
        ui.enable();
        ui.draw();
    }

    static abstract class UIControl {
        public void enable() {
            System.out.println("Enabled");
        }

        public abstract void draw();
    }

    static class CheckBox extends UIControl {

        @Override
        public void draw() {
            System.out.println("Draw CheckBox");
        }
    }

    static class TextBox extends UIControl {

        @Override
        public void draw() {
            System.out.println("Draw TextBox");
        }
    }
}

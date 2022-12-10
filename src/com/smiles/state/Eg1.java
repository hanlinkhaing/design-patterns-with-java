package com.smiles.state;

public class Eg1 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    static class Canvas {
        private Tool currentTool;

        public Tool getCurrentTool() {
            return currentTool;
        }

        public void setCurrentTool(Tool currentTool) {
            this.currentTool = currentTool;
        }

        public void mouseDown() {
            currentTool.mouseDown();
        }

        public void mouseUp() {
            currentTool.mouseUp();
        }
    }

    interface Tool {
        void mouseDown();
        void mouseUp();
    }

    static class Brush implements Tool {

        @Override
        public void mouseDown() {
            System.out.println("Brush Icon");
        }

        @Override
        public void mouseUp() {
            System.out.println("Draw A Line");
        }
    }

    static class Eraser implements Tool {

        @Override
        public void mouseDown() {
            System.out.println("Eraser Icon");
        }

        @Override
        public void mouseUp() {
            System.out.println("Erase Something");
        }
    }
}

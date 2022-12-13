package com.smiles.command.composite;

public class Eg2 {
    public static void main(String[] args) {
        CompositeCommand command = new CompositeCommand();
        command.addCommand(new ResizeCommand());
        command.addCommand(new BlackAndWhiteCommand());
        command.execute();
    }
}

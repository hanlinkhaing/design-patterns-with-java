package com.smiles.command.composite;

import com.smiles.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Command");
    }
}

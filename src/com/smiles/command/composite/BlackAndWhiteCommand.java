package com.smiles.command.composite;

import com.smiles.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black And White Command");
    }
}

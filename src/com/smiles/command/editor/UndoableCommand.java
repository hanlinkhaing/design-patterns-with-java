package com.smiles.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}

package com.smiles.command.editor;

public class Eg1 {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand command = new BoldCommand(document, history);
        command.execute();
        System.out.println(document.getContent());

        UndoCommand undoableCommand = new UndoCommand(history);
        undoableCommand.execute();
        System.out.println(document.getContent());
    }
}

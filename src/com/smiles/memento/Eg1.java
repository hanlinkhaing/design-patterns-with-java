package com.smiles.memento;

import java.util.ArrayList;
import java.util.List;

public class Eg1 {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");

        history.push(editor.createState());
        editor.setContent("ab");

        history.push(editor.createState());
        editor.setContent("abc");

        System.out.println("Current change: " + editor.getContent());
        editor.restore(history.pop());
        System.out.println("Restored previous state: " + editor.getContent());
    }

    static class Editor {
        private String content;

        public EditorState createState() {
            return new EditorState(content);
        }

        public void restore(EditorState state) {
            content = state.getContent();
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    static class EditorState {
        private final String content;

        public EditorState(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    static class History {
        private List<EditorState> states = new ArrayList<EditorState>();

        public void push(EditorState state) {
            this.states.add(state);
        }

        public EditorState pop() {
            int lastIndex = states.size() - 1;
            EditorState lastState = this.states.get(lastIndex);
            this.states.remove(lastState);

            return lastState;
        }
    }
}

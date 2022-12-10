package com.smiles.memento;

import java.util.ArrayList;
import java.util.List;

public class Eg2 {
    public static void main(String[] args) {
        Document document = new Document("Time new Romance", 16);
        DocumentHistory history = new DocumentHistory();

        document.setContent("abcd");

        history.push(document.createState());
        document.setContent("abcdefg");

        System.out.println(document.toString());
        document.restore(history.pop());
        System.out.println(document.toString());
    }

    static class Document {
        private String content;
        private String fontName;
        private int fontSize;

        public Document(String fontName, int fontSize) {
            this.content = "";
            this.fontName = fontName;
            this.fontSize = fontSize;
        }

        public DocumentState createState() {
            return new DocumentState(content, fontName, fontSize);
        }

        public void restore(DocumentState documentState) {
            this.content = documentState.content;
            this.fontName = documentState.fontName;
            this.fontSize = documentState.fontSize;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setFontName(String fontName) {
            this.fontName = fontName;
        }

        public void setFontSize(int fontSize) {
            this.fontSize = fontSize;
        }

        public String toString() {
            return content + " " + fontName + " " + fontSize;
        }
    }

    static class DocumentState {
        private final String content;
        private final String fontName;
        private final int fontSize;

        public DocumentState(String content, String fontName, int fontSize) {
            this.content = content;
            this.fontName = fontName;
            this.fontSize = fontSize;
        }
    }

    static class DocumentHistory {
        private List<DocumentState> documentStates = new ArrayList<DocumentState>();

        public void push(DocumentState documentState) {
            this.documentStates.add(documentState);
        }

        public DocumentState pop() {
            int lastIndex = this.documentStates.size() - 1;
            DocumentState lastDocument = this.documentStates.get(lastIndex);
            this.documentStates.remove(lastIndex);

            return lastDocument;
        }
    }
}

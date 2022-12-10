package com.smiles.iterator;

import java.util.ArrayList;
import java.util.List;

public class Eg1 {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("url 1");
        history.push("url 2");
        history.push("url 3");

        Iterator iterator = history.createListIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }

    static class BrowserHistory {
        private List<String> urls = new ArrayList<String>();

        public void push(String url) {
            this.urls.add(url);
        }

        public Iterator createListIterator() {
            return new ListIterator(this);
        }

        static class ListIterator implements Iterator {
            private BrowserHistory browserHistory;
            private int index;

            public ListIterator(BrowserHistory browserHistory) {
                this.browserHistory = browserHistory;
            }

            @Override
            public boolean hasNext() {
                return index < browserHistory.urls.size();
            }

            @Override
            public String current() {
                return browserHistory.urls.get(index);
            }

            @Override
            public void next() {
                index++;
            }
        }
    }
}

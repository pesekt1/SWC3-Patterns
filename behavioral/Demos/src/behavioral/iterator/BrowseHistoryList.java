package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryList {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private BrowseHistoryList history;
        private int index;

        public ListIterator(BrowseHistoryList history) {
            this.history = history;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

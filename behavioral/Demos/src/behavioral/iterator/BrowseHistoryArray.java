package behavioral.iterator;

public class BrowseHistoryArray {
  private String[] urls = new String[10];
  private int count;

  public void push(String url) {
    urls[count++] = url;
  }

  public String pop() {
    return urls[--count];
  }

  public Iterator createIterator() {
    return new ArrayIterator(this);
  }

  public class ArrayIterator implements Iterator {
    private BrowseHistoryArray history;
    private int index;

    public ArrayIterator(BrowseHistoryArray history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return (index < history.count);
    }

    @Override
    public String current() {
      return history.urls[index];
    }

    @Override
    public void next() {
      index++;
    }
  }

}

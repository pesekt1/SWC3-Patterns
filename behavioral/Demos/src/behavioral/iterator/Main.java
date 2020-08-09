package behavioral.iterator;

//Main class does not know about the implementation:
//BrowseHistoryArray use an array to store urls
//BrowseHistoryList uses an ArrayList to store urls
//Yet, we can iterate over them in the same way,
// we dont know what structures we are iterating over.
public class Main {
    public static void main(String[] args) {
        var browseHistoryArray = new BrowseHistoryArray();
        browseHistoryArray.push("ulr1");
        browseHistoryArray.push("ulr2");
        browseHistoryArray.push("ulr3");

        while (browseHistoryArray.createIterator().hasNext()) {
            System.out.println(browseHistoryArray.pop());
        }

        var browseHistoryList = new BrowseHistoryList();
        browseHistoryList.push("url1");
        browseHistoryList.push("url2");
        browseHistoryList.push("url3");

        while (browseHistoryList.createIterator().hasNext()) {
            System.out.println(browseHistoryList.pop());
        }
    }
}
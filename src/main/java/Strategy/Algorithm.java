package Strategy;

public class Algorithm {
    Sorter sorter;

    public Algorithm() {}

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sort() {
        sorter.sort();
    }
}

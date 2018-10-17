

public class Cell {

    private String data;

    public Cell() {
        data = "";
    }

    public Cell(String cell_data) {
        data = cell_data;
    }

    public Cell computeCell() {
        return this;
    }

    public String toString() {
        return data;
    }
}

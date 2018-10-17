

import java.util.List;
import java.util.LinkedList;

public class Line {

    private List<Cell> cells;

    public  Line() {
        cells = new LinkedList<Cell>();
    }

    public Line(List<Cell> list_of_cells) {
        if (cells != null) {
            cells = list_of_cells;
        } else {
            cells = new LinkedList<Cell>(list_of_cells);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Cell c : this.cells) {
            result.append(c.toString());
            result.append(" ");
        }

        return result.toString();
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sameenislam on 19/02/2016.
 */
public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);

    }
}

import java.util.HashSet;
import java.util.Set;

public class Vertex<E>{
    private E value;
    private Set<Vertex<E>> neighbour=null;

    public Vertex(E value){
        this.value=value;
        this.neighbour= new HashSet<>();//make the set a new hashSet
    }

    public E getValue() {
        return this.value;
    }
    public void connect(Vertex<E> neighbours){//how to connect with neighbor
        //if vertex is connected then add list/
        //building the ability to connect
        this.neighbour.add(neighbours);

    }
    public boolean connected(Vertex<E> neighbours){
        return this.neighbour.contains(neighbours);
    }
    public Set<Vertex<E>> getNeighbour() {
        return this.neighbour;
    }

    public static void main(String[] args) {
        Vertex<String> vA= new Vertex<String>("A");
        Vertex<String> vB= new Vertex<String>("B");
        Vertex<String> vC= new Vertex<String>("C");
        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vA);
        vC.connect(vB);
    }
}

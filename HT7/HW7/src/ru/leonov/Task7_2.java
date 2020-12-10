package ru.leonov;

import ru.leonov.graph.MyGraph;
import ru.leonov.graph.Vertex;

public class Task7_2 {
    //    Задание 7.2
    //    Реализуйте базовые методы графа.
    public static void Task() {
        MyGraph graph = new MyGraph(10);
        graph.addVertex(new Vertex("A"));
        graph.addVertex(new Vertex("B"));
        graph.addVertex(new Vertex("C"));
        graph.addVertex(new Vertex("D"));
        graph.addVertex(new Vertex("E"));
        graph.addVertex(new Vertex("F"));

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 5);

        //       A
        //     / | \
        //    B  C  D
        //    |
        //    E
        //    |
        //    F

        graph.displayVertex();
        graph.displayEdge();
    }

    public static void main(String[] args) {
        Task();
    }
}

package ru.leonov;

import ru.leonov.graph.MyGraph;
import ru.leonov.graph.Vertex;
import ru.leonov.utils.NanoTimeHelper;

public class Task7_4 {
    //    Задание 7.4
    //    В базовом графе из задания 7.2 реализуйте метод обхода в ширину.
    //    Выполните оценку времени с помощью System.nanoTime().
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

        System.out.println("Обход в ширину с индекса 0");
        NanoTimeHelper.start();
        graph.inWidth(0);
        NanoTimeHelper.printTime("");

        System.out.println("Обход в ширину с индекса 2");
        NanoTimeHelper.start();
        graph.inWidth(2);
        NanoTimeHelper.printTime("");
    }

    public static void main(String[] args) {
        Task();
    }
}

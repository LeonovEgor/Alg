package ru.leonov.graph;

import java.util.LinkedList;
import java.util.Queue;

public class MyGraph {
    int MaxVertex;
    int size = 0;
    Vertex[] vertices;

    boolean[][] edges;


    public MyGraph(int MaxVertex) {
        this.MaxVertex = MaxVertex;
        vertices = new Vertex[MaxVertex];
        edges = new boolean[MaxVertex][MaxVertex];
    }

    public void addVertex(Vertex vertex) {
        this.vertices[size++] = vertex;
    }

    public void addEdge(int index1, int index2) {
        edges[index1][index2] = true;
        edges[index2][index1] = true;
    }


    public void displayVertex() {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < size; index++) {
            sb.append(vertices[index].name).append(" ");
        }
        System.out.println(sb.toString());
    }

    public void displayEdge() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");

        for (int index = 0; index < size; index++) {
            sb.append(vertices[index].name).append("      ");
        }
        sb.append("\n");

        for (int i = 0; i < size; i++) {
            sb.append(vertices[i]).append(" ");
            for (int j = 0; j < size; j++) {
                sb.append(edges[i][j]).append("  ");
                if (edges[i][j]) sb.append(" "); //True короче на 1 букву
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public void inDepth(int currentIndex) {
        inDepthRecursion(currentIndex);
        clearVisited();
    }

    private void inDepthRecursion(int currentIndex) {
        vertices[currentIndex].isVisited = true;
        System.out.println(vertices[currentIndex].name);

        for (int i = 0; i < size; i++) {
            if (edges[currentIndex][i] && !vertices[i].isVisited) {
                inDepthRecursion(i);
            }
        }
    }

    private void clearVisited() {
        for (int i = 0; i < size; i++) {
            vertices[i].isVisited = false;
        }
    }

    public void inWidth(int startIndex) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println(vertices[startIndex]);
        vertices[startIndex].isVisited = true;
        queue.add(startIndex);

        int childIndex;
        while (!queue.isEmpty()) {
            int currentIndex = queue.remove();
            while ((childIndex = getNotVisitedVertex(currentIndex)) != -1) {
                System.out.println(vertices[childIndex]);
                vertices[childIndex].isVisited = true;
                queue.add(childIndex);
            }
        }

        clearVisited();
    }

    private int getNotVisitedVertex(int index) {
        for (int i = 0; i < size; i++) {
            if (edges[index][i] && !vertices[i].isVisited)
                return i;
        }

        return -1;
    }

}
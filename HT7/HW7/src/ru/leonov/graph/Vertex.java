package ru.leonov.graph;

public class Vertex {
    public String name;
    public boolean isVisited;

    public Vertex(String name) {
        this.name = name;
        this.isVisited = false;
    }

    public String toString() {
        return name;
    }

}
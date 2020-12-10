package ru.leonov.tree;

//    Задание 6.2
//    Реализуйте класс узла дерева и базовый шаблон дерева с базовыми методами.
public class MyTree<T extends Comparable<T> & IPrint> {
    Node<T> rootNode;


    //    Задание 6.3
    //    Реализуйте методы поиска и вставки узла в дерево
    //region 6.3
    public void insert(T item) throws Exception {
        Node<T> newNode = new Node<>(item);

        if (rootNode == null) {
            rootNode = newNode;
            return;
        }

        Node<T> parent = findParent(item);

        if (parent == null) throw new Exception("Не найдено куда добавлять");

        if (parent.item.compareTo(item) > 0) parent.leftChild = newNode;
        else parent.rightChild = newNode;

    }

    private Node<T> findParent(T item) {
        Node<T> currentNode = rootNode;
        Node<T> parentNode = null;

        while (currentNode != null) {
            parentNode = currentNode;

            int res = currentNode.item.compareTo(item);
            if (res == 0) return null;
            else if (res > 0) currentNode = currentNode.leftChild;
            else currentNode = currentNode.rightChild;
        }

        return parentNode;
    }

    public Node<T> find(T item) {
        return findRecursive(rootNode, item);
    }

    private Node<T> findRecursive(Node<T> currentNode, T item) {
        if (currentNode == null) return null;

        int res = currentNode.item.compareTo(item);
        if (res == 0) return currentNode;

        return res > 0
                ? findRecursive(currentNode.leftChild, item)
                : findRecursive(currentNode.rightChild, item);
    }
    //endregion

    //    Задание 6.4
    //    Реализуйте базовые методы обхода дерева и метода дисплей.
    //    Реализуйте поиск максимума и минимума.

    //region 6.4
    public T min() {
        return getMin(rootNode).item;
    }

    private Node<T> getMin(Node<T> node) {
        return node.leftChild == null ? node : getMin(node.leftChild);
    }

    public T max() {
        return getMax(rootNode).item;
    }

    private Node<T> getMax(Node<T> node) {
        return node.rightChild == null ? node : getMax(node.rightChild);
    }

    public void inOrder() {
        inOrderRecursion(rootNode);
    }

    private void inOrderRecursion(Node<T> node) {
        if (node != null) {
            inOrderRecursion(node.leftChild);
            node.print();
            inOrderRecursion(node.rightChild);
        }
    }
    //endregion

    // 6.5 Удаление узла
    public void delete(T item) {
        rootNode = deleteRecursive(rootNode, item);
    }

    private Node<T> deleteRecursive(Node<T> currentNode, T toDelete) {
        if (currentNode == null) return null;

        int res = currentNode.item.compareTo(toDelete);
        if (res == 0) {
            // Нет дочерних элементов
            if (currentNode.leftChild == null && currentNode.rightChild == null) return null;

            // 1 дочерний элемент
            if (currentNode.rightChild == null) return currentNode.leftChild;
            if (currentNode.leftChild == null) return currentNode.rightChild;

            // 2 дочерних элемента
            Node<T> minNode = getMin(currentNode.rightChild);
            currentNode.item = minNode.item;
            currentNode.rightChild = deleteRecursive(currentNode.rightChild, minNode.item);
            return currentNode;

        } else if (res > 0) { // Текущий больше удаляемого
            currentNode.leftChild = deleteRecursive(currentNode.leftChild, toDelete);
            return currentNode;
        }

        currentNode.rightChild = deleteRecursive(currentNode.rightChild, toDelete);
        return currentNode;
    }

//
//    public void displayTree(){
//
//    }
}

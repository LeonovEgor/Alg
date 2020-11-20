package hw4;
// Немного переделал, сделал класс LinkListM общим для стека и очереди
// и при извлечении элементов методы выдают объект <Link>, а не имя.

class Link {
    public String name;
    public int age;
    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", age: " + age);
    }
}

class LinkedListM {
    public Link first, last;

    public LinkedListM() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    public void add(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) first = newLink;
        else last.next = newLink;
        last = newLink;
    }

    public Link remove(){
        Link temp=first;
        if (first.next==null) last=null;
        first=first.next;
        return temp;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class StackList {
    private LinkedListM list;

    public StackList() {
        list = new LinkedListM();
    }

    public void push(String name, int age) {
        list.insert(name, age);
    }

    public Link pop() {
        return list.delete();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}

class QueueM {
    private LinkedListM queue;

    public QueueM() {
        queue = new LinkedListM();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void add(String name, int age) {
        queue.add(name, age);
    }

    public Link remove() {
        return queue.remove();
    }

    public void display() {
        queue.display();
    }
}

public class MyStLn {
    public static void main(String[] args) {
        StackList myS = new StackList();
        System.out.println("\n[My Stack]\n");
        myS.push("User 1", 30);
        myS.push("User 2", 40);
        myS.push("User 3", 35);
        myS.display();

        while (!myS.isEmpty()) {
            Link tmp = myS.pop();
            System.out.println("Элемент " + tmp.name + ", age " +
                    tmp.age + ": удален!");
        }

        System.out.println("\n[My Queue]\n");
        QueueM q = new QueueM();
        q.add("User 1", 30);
        q.add("User 2", 25);
        q.add("User 3", 40);
        q.display();
        while (!q.isEmpty()) {
            Link t = q.remove();
            System.out.println("Элемент " + t.name + ", age " +
                    t.age + ": удален!");
        }
    }
}
/*

[My Stack]

Name: User 3, age: 35
Name: User 2, age: 40
Name: User 1, age: 30
Элемент User 3, age 35: удален!
Элемент User 2, age 40: удален!
Элемент User 1, age 30: удален!

[My Queue]

Name: User 1, age: 30
Name: User 2, age: 25
Name: User 3, age: 40
Элемент User 1, age 30: удален!
Элемент User 2, age 25: удален!
Элемент User 3, age 40: удален!
 */
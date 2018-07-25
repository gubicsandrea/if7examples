package company;

import java.util.List;

public class Node {

    private String name;
    private List<Node> employees;

    public Node(String name, List<Node> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Node> getEmployees() {
        return employees;
    }
}

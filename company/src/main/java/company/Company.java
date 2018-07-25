package company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public List<String> listAllEmployees(Node node) {
        List<String> names = new ArrayList<>();
        List<Node> nodes = node.getEmployees();

        names.add(node.getName());

        for (Node n : nodes) {
            names.addAll(listAllEmployees(n));
        }

        return names;
    }
}

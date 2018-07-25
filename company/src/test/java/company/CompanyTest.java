package company;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CompanyTest {

    private Node bigboss;

    @Before
    public void initCompany() {
        Node employee1 = new Node("Pista", Collections.emptyList());
        Node employee2 = new Node("Marcsi", Collections.emptyList());
        Node employee3 = new Node("Kata", Collections.emptyList());
        Node boss = new Node("Fecó", Arrays.asList(employee2, employee3));
        bigboss = new Node("Józsi", Arrays.asList(employee1, boss));
    }

    @Test
    public void testListAllEmployees() {
        Company company = new Company();
        List<String> employees = company.listAllEmployees(bigboss);
        System.out.println(employees);

        assertThat(employees.size(), equalTo(5));
    }

}

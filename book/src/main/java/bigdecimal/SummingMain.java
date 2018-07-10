package bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SummingMain {

    public static void main(String[] args) {
        List<BigDecimal> lista = Arrays.asList(new BigDecimal("3.24567"),
                                                new BigDecimal("2.568894"),
                                                new BigDecimal("0.000567"));
        Summming summming = new Summming(lista);

        BigDecimal sum = summming.sumAllInList();
        System.out.println(sum);

        double anum = 0.1;
        System.out.println(anum);
        summming.print();
    }
}

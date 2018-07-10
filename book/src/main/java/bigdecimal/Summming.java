package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Summming {

    private BigDecimal number = new BigDecimal(0.1);
    private BigDecimal number2 = BigDecimal.valueOf(10,5);
    private BigDecimal number3 = new BigDecimal("0.1");

    private List<BigDecimal> numbers;

    public Summming(List<BigDecimal> numbers) {
        this.numbers = numbers;
    }

    public void print(){
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
    }

    public BigDecimal addAll(){
        return number.add(number2).add(number3);
    }

    public BigDecimal sumAllInList(){
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal number: numbers){
            result = result.add(number);
        }
        return result.setScale(3, RoundingMode.HALF_EVEN);
    }
}

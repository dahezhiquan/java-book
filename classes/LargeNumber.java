package classes;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * java大数处理方案
 */
public class LargeNumber {
    public static void main(String[] args) {
        // BigInteger
        BigInteger bigInteger = new BigInteger("11111111111111111111111");
        BigInteger bigInteger1 = new BigInteger("12345678910");
        // +
        BigInteger addRes = bigInteger.add(bigInteger1);
        System.out.println(addRes);
        // -
        BigInteger subRes = bigInteger.subtract(bigInteger1);
        System.out.println(subRes);
        // *
        BigInteger mulRes = bigInteger.multiply(bigInteger1);
        System.out.println(mulRes);
        // /
        BigInteger divRes = bigInteger.divide(bigInteger1);
        System.out.println(divRes);

        // BigDecimal
        BigDecimal bigDecimal = new BigDecimal("1.1111111111111111111999999999999");
        BigDecimal bigDecimal1 = new BigDecimal("1.234567");
        System.out.println(bigDecimal);
        // +
        BigDecimal daddRes = bigDecimal.add(bigDecimal1);
        System.out.println(daddRes);
        // -
        BigDecimal dsubRes = bigDecimal.subtract(bigDecimal1);
        System.out.println(dsubRes);
        // *
        BigDecimal dmulRes = bigDecimal.multiply(bigDecimal1);
        System.out.println(dmulRes);
        // /，注意：如果不指定精度，结果是死循环小数，会抛出一个异常
        BigDecimal ddivRes = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING);
        System.out.println(ddivRes);
    }
}

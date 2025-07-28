import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = strtoint(num1);
        BigInteger b = strtoint(num2);
        BigInteger c = a.multiply(b);
        return convert(c);
    }

    private BigInteger strtoint(String str) {
        // Custom manual parsing (optional)
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch - '0';
            result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }
        return result;

        // Or: return new BigInteger(str); // Cleaner if manual parsing isn't needed
    }

    private String convert(BigInteger number) {
        if (number.equals(BigInteger.ZERO)) return "0";

        StringBuilder sb = new StringBuilder();
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divMod = number.divideAndRemainder(BigInteger.TEN);
            number = divMod[0];
            sb.append((char) ('0' + divMod[1].intValue()));
        }
        return sb.reverse().toString();
    }
}


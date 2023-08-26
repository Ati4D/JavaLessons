package com.company.Practice;

import static java.lang.System.out;

/**
 * byte, short, int, long. Числа с плавающей точкой (иначе вещественные) - float, double. Логический - boolean.
 */

public class WrapperTest {
    public static void main(String[] args) {
        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 10);
        Byte b3 = new Byte((byte) 10);
        Byte b4 = Byte.parseByte("10");

        Short s1 = 10;
        Short s2 = Short.valueOf((short) 10);
        Short s3 = new Short((short) 10);
        Short s4 = Short.parseShort("10");

        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Long l1 = 10L;
        Long l2 = Long.valueOf(10L);
        Long l3 = new Long(10L);
        Long l4 = Long.parseLong("10");

        Float f1 = 10f;
        Float f2 = Float.valueOf(10f);
        Float f3 = new Float(10f);
        Float f4 = Float.parseFloat("10");

        Double d1 = 10.;
        Double d2 = Double.valueOf(10);
        Double d3 = new Double(10);
        Double d4 = Double.parseDouble("10.1");

        Boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = new Boolean(true);
        Boolean bool4 = Boolean.parseBoolean("true");

        Character c1 = '1';
        Character c2 = Character.valueOf('1');
        Character c3 = new Character('1');
        Character c4 = "absolute".charAt(0);

        Double d = 2.31;
        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        float f = d.floatValue();
        long l = d.longValue();

        Double zero = 0.;
        Double nonZero = 1.;
        Double nanValue = zero / zero;
        Double infinityValue = nonZero / zero;
        out.println("NaNValue = " + nanValue);
        out.println("InfinityValue = " + infinityValue);

        if (nanValue.isNaN()) {
            out.println("Переменная nanValue = NaN");
        }
        if (nanValue.isInfinite()) {
            out.println("Переменная nanValue = Infinity");
        }

        if (infinityValue.isNaN()) {
            out.println("Переменная infinityValue = NaN");
        }
        if (infinityValue.isInfinite()) {
            out.println("Переменная infinityValue = Infinity");
        }

        Long long1 = 120L;
        Long long2 = 120L;
        out.println("Long1(" + long1 + ") == Long2(" + long2 + ") ==> " + (long1 == long2));
        long1 = 1200L;
        long2 = 1200L;
        out.println("Long1(" + long1 + ") == Long2(" + long2 + ") ==> " + (long1 == long2));

    }
}

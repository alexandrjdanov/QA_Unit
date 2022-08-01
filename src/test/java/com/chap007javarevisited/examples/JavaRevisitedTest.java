package com.chap007javarevisited.examples;

import com.chap006domainentities.examples.AdminUser;
import com.chap006domainentities.examples.EmptyUser;
import com.chap006domainentities.examples.User;
import net.bytebuddy.pool.TypePool;
import org.junit.Test;
import java.util.*;

import static com.chap006javarevisited.examples.JavaRevisited.addHttp;
import static com.chap006javarevisited.examples.JavaRevisited.likelyGenderIs;
import static org.junit.Assert.*;

public class JavaRevisitedTest {

    @Test
    public void variableNaming() {
        String $aString = "bob";
        float owed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A0123456 = "ugh";

        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456);
    }

    @Test
    public void Booleantype() {
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);
        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;
        assertTrue(truthy);
        assertFalse(falsey);
    }

    @Test
    public void IntegerTypes() {
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;
        System.out.println("* 'byte' range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("* 'short' range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("* 'int' range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("* 'long' range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        aLongHas8Bytes = 0L;
        assertEquals(0, aLongHas8Bytes);
        aByteHas1Byte = 0xA;
        assertEquals(10, aByteHas1Byte);
        anIntHas4Bytes = 010;
        assertEquals(8, anIntHas4Bytes);
        aShortHas2Bytes = 0b0010;
        assertEquals(2, aShortHas2Bytes);
        aLongHas8Bytes = 9_000_000_000L;
        assertEquals(9000000000L, aLongHas8Bytes);
    }

    @Test
    public void FloatingPointTypes() {
        float singlePrecision32bit;
        double doublePrecision64bit;
        System.out.println("* 'float' range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("* 'double' range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        singlePrecision32bit = 10.0F;
        assertEquals(10F, singlePrecision32bit, 0);
        doublePrecision64bit = 20.0;
        assertEquals(20D, doublePrecision64bit, 0);
    }

    @Test
    public void CharacterType() {
        char aChar = '\u0026';
        assertEquals(aChar, '&');
    }

    @Test
    public void TraditionalOperatorsExplored() {
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9 % 2);
    }

    @Test
    public void assignmentOperatorsExplored() {
        String ab = "ab";
        assertEquals("ab", ab);
        int num = 10;
        assertEquals(10, num);
        num += 2;
        assertEquals("+= increments by ", 12, num);
        num -= 4;
        assertEquals("-= decrements by ", 8, num);
        num *= 2;
        assertEquals("*= multiplies by ", 16, num);
        num /= 4;
        assertEquals("/= dividess by ", 4, num);
        num %= 3;
        assertEquals("%= modulus by ", 1, num);
    }

    @Test
    public void incrementDecrementOperatorsExplore() {
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperatorsExplored() {
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(4 > 2);
        assertTrue(4 >= 4);
        assertTrue(4 <= 4);
        assertTrue(4 <= 7);
        assertTrue(!false);
        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored() {
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && true);
    }

    @Test
    public void ternaryOperatorsExplored() {
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5 >= 4 ? true : false);
    }

    @Test
    public void someStringMethods(){
        String aString = "abcdef";
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }

    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("one", numbers0123[1]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] numbers0123 = {"zero", "one", "two", "three"};
        List<String> numbers0123List = Arrays.asList(numbers0123);
        for (String numberText : numbers0123List) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123List.get(0));
        assertEquals("one", numbers0123List.get(1));
    }

    @Test
    public void simpleDynamicCollectionExample() {
        List<String> numbers0123 = new ArrayList<>();
        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("one", numbers0123.get(1));
    }

    @Test
    public void setDoesntAllowDuplicates() {
        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        assertEquals(1, workdays.size());
    }

    @Test
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString = "";
        String yourAge;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + ageAsString + " years old";
        }
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    @Test
    public void ifElseNested() {
        String url = "seleniumsimplified.com";
        if (url.startsWith("http"));
        else {
            if (!url.startsWith("www"))
                url = "www." + url;
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void switchExample() {
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    @Test
    public void inheritanceExample1() {
        EmptyUser em = new EmptyUser();
        assertEquals("username", em.getUsername());
        assertEquals("password", em.getPassword());
    }

    @Test
    public void aUserWithNormalPermissions() {
        var aUser = new User();
        assertEquals("normal", aUser.getPermission());
    }

    @Test
    public void inheritanceExample2() {
        var anAdminUser = new AdminUser();
        assertEquals("admin", anAdminUser.getUsername());
        assertEquals("pass123", anAdminUser.getPassword());
        assertEquals("elevated", anAdminUser.getPermission());
    }

    @Test
    public void inheritanceExample3() {
        var anAdminUser = new AdminUser("adminUs", "pwd123");
        assertEquals("adminUs", anAdminUser.getUsername());
        assertEquals("pwd123", anAdminUser.getPassword());
        assertEquals("elevated", anAdminUser.getPermission());
    }
}

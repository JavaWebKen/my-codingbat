
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Logic1Tests {

    Logic1 logic1 = new Logic1();

    @Disabled
    @Test
    public void cigarParty() {
        assertEquals(false, logic1.cigarParty(30, false));
        assertEquals(true, logic1.cigarParty(50, false));
        assertEquals(true, logic1.cigarParty(70, true));
        assertEquals(false, logic1.cigarParty(30, true));
        assertEquals(true, logic1.cigarParty(50, true));
        assertEquals(true, logic1.cigarParty(60, false));
        assertEquals(false, logic1.cigarParty(61, false));
        assertEquals(true, logic1.cigarParty(40, false));
        assertEquals(false, logic1.cigarParty(39, false));
        assertEquals(true, logic1.cigarParty(40, true));
        assertEquals(false, logic1.cigarParty(39, true));
    }

    @Disabled
    @Test
    public void dateFashion() {
        assertEquals(2, logic1.dateFashion(5, 10));
        assertEquals(0, logic1.dateFashion(5, 2));
        assertEquals(1, logic1.dateFashion(5, 5));
        assertEquals(1, logic1.dateFashion(3, 3));
        assertEquals(0, logic1.dateFashion(10, 2));
        assertEquals(0, logic1.dateFashion(2, 9));
        assertEquals(2, logic1.dateFashion(9, 9));
        assertEquals(2, logic1.dateFashion(10, 5));
        assertEquals(0, logic1.dateFashion(2, 2));
        assertEquals(1, logic1.dateFashion(3, 7));
        assertEquals(0, logic1.dateFashion(2, 7));
        assertEquals(0, logic1.dateFashion(6, 2));
    }

    @Disabled
    @Test
    public void squirrelPlay() {
        assertEquals(true, logic1.squirrelPlay(70, false));
        assertEquals(false, logic1.squirrelPlay(95, false));
        assertEquals(true, logic1.squirrelPlay(95, true));
        assertEquals(true, logic1.squirrelPlay(90, false));
        assertEquals(true, logic1.squirrelPlay(90, true));
        assertEquals(false, logic1.squirrelPlay(50, false));
        assertEquals(false, logic1.squirrelPlay(50, true));
        assertEquals(false, logic1.squirrelPlay(100, false));
        assertEquals(true, logic1.squirrelPlay(100, true));
        assertEquals(false, logic1.squirrelPlay(105, true));
        assertEquals(false, logic1.squirrelPlay(59, false));
        assertEquals(false, logic1.squirrelPlay(59, true));
        assertEquals(true, logic1.squirrelPlay(60, false));
    }

    @Disabled
    @Test
    public void caughtSpeeding() {
        assertEquals(0, logic1.caughtSpeeding(60, false));
        assertEquals(1, logic1.caughtSpeeding(65, false));
        assertEquals(0, logic1.caughtSpeeding(65, true));
        assertEquals(1, logic1.caughtSpeeding(80, false));
        assertEquals(2, logic1.caughtSpeeding(85, false));
        assertEquals(1, logic1.caughtSpeeding(85, true));
        assertEquals(1, logic1.caughtSpeeding(70, false));
        assertEquals(1, logic1.caughtSpeeding(75, false));
        assertEquals(1, logic1.caughtSpeeding(75, true));
        assertEquals(0, logic1.caughtSpeeding(40, false));
        assertEquals(0, logic1.caughtSpeeding(40, true));
        assertEquals(2, logic1.caughtSpeeding(90, false));
    }

    @Disabled
    @Test
    public void sortaSum() {
        assertEquals(7, logic1.sortaSum(3, 4));
        assertEquals(20, logic1.sortaSum(9, 4));
        assertEquals(21, logic1.sortaSum(10, 11));
        assertEquals(9, logic1.sortaSum(12, -3));
        assertEquals(9, logic1.sortaSum(-3, 12));
        assertEquals(9, logic1.sortaSum(4, 5));
        assertEquals(20, logic1.sortaSum(4, 6));
        assertEquals(21, logic1.sortaSum(14, 7));
        assertEquals(20, logic1.sortaSum(14, 6));
    }

    @Disabled
    @Test
    public void alarmClock() {
        assertEquals("7:00", logic1.alarmClock(1, false));
        assertEquals("7:00", logic1.alarmClock(5, false));
        assertEquals("10:00", logic1.alarmClock(0, false));
        assertEquals("10:00", logic1.alarmClock(6, false));
        assertEquals("off", logic1.alarmClock(0, true));
        assertEquals("off", logic1.alarmClock(6, true));
        assertEquals("10:00", logic1.alarmClock(1, true));
        assertEquals("10:00", logic1.alarmClock(3, true));
        assertEquals("10:00", logic1.alarmClock(5, true));
    }

    @Disabled
    @Test
    public void love6() {
        assertEquals(true, logic1.love6(6, 4));
        assertEquals(false, logic1.love6(4, 5));
        assertEquals(true, logic1.love6(1, 5));
        assertEquals(true, logic1.love6(1, 6));
        assertEquals(false, logic1.love6(1, 8));
        assertEquals(true, logic1.love6(1, 7));
        assertEquals(false, logic1.love6(7, 5));
        assertEquals(true, logic1.love6(8, 2));
        assertEquals(true, logic1.love6(6, 6));
        assertEquals(false, logic1.love6(-6, 2));
        assertEquals(true, logic1.love6(-4, -10));
        assertEquals(false, logic1.love6(-7, 1));
        assertEquals(true, logic1.love6(7, -1));
        assertEquals(true, logic1.love6(-6, 12));
        assertEquals(false, logic1.love6(-2, -4));
        assertEquals(true, logic1.love6(7, 1));
        assertEquals(false, logic1.love6(0, 9));
        assertEquals(false, logic1.love6(8, 3));
        assertEquals(true, logic1.love6(3, 3));
        assertEquals(false, logic1.love6(3, 4));
    }

    @Disabled
    @Test
    public void in1To10() {
        assertEquals(true, logic1.in1To10(5, false));
        assertEquals(false, logic1.in1To10(11, false));
        assertEquals(true, logic1.in1To10(11, true));
        assertEquals(true, logic1.in1To10(10, false));
        assertEquals(true, logic1.in1To10(10, true));
        assertEquals(true, logic1.in1To10(9, false));
        assertEquals(false, logic1.in1To10(9, true));
        assertEquals(true, logic1.in1To10(1, false));
        assertEquals(true, logic1.in1To10(1, true));
        assertEquals(false, logic1.in1To10(0, false));
        assertEquals(true, logic1.in1To10(0, true));
        assertEquals(false, logic1.in1To10(-1, false));
        assertEquals(true, logic1.in1To10(-1, true));
        assertEquals(false, logic1.in1To10(99, false));
        assertEquals(true, logic1.in1To10(-99, true));
    }

    @Disabled
    @Test
    public void specialEleven() {
        assertEquals(true, logic1.specialEleven(22));
        assertEquals(true, logic1.specialEleven(23));
        assertEquals(false, logic1.specialEleven(24));
        assertEquals(false, logic1.specialEleven(21));
        assertEquals(true, logic1.specialEleven(11));
        assertEquals(true, logic1.specialEleven(12));
        assertEquals(false, logic1.specialEleven(10));
        assertEquals(false, logic1.specialEleven(9));
        assertEquals(false, logic1.specialEleven(8));
        assertEquals(true, logic1.specialEleven(0));
        assertEquals(true, logic1.specialEleven(1));
        assertEquals(false, logic1.specialEleven(2));
        assertEquals(true, logic1.specialEleven(121));
        assertEquals(true, logic1.specialEleven(122));
        assertEquals(false, logic1.specialEleven(123));
        assertEquals(false, logic1.specialEleven(46));
        assertEquals(false, logic1.specialEleven(49));
        assertEquals(false, logic1.specialEleven(52));
        assertEquals(false, logic1.specialEleven(54));
        assertEquals(true, logic1.specialEleven(55));
    }

    @Disabled
    @Test
    public void more20() {
        assertEquals(false, logic1.more20(20));
        assertEquals(true, logic1.more20(21));
        assertEquals(true, logic1.more20(22));
        assertEquals(false, logic1.more20(23));
        assertEquals(false, logic1.more20(25));
        assertEquals(false, logic1.more20(30));
        assertEquals(false, logic1.more20(31));
        assertEquals(false, logic1.more20(59));
        assertEquals(false, logic1.more20(60));
        assertEquals(true, logic1.more20(61));
        assertEquals(true, logic1.more20(62));
        assertEquals(false, logic1.more20(1020));
        assertEquals(true, logic1.more20(1021));
        assertEquals(false, logic1.more20(1000));
        assertEquals(true, logic1.more20(1001));
        assertEquals(false, logic1.more20(50));
        assertEquals(false, logic1.more20(55));
        assertEquals(false, logic1.more20(40));
        assertEquals(true, logic1.more20(41));
        assertEquals(false, logic1.more20(39));
        assertEquals(true, logic1.more20(42));
    }

    @Disabled
    @Test
    public void old35() {
        assertEquals(true, logic1.old35(3));
        assertEquals(true, logic1.old35(10));
        assertEquals(false, logic1.old35(15));
        assertEquals(true, logic1.old35(5));
        assertEquals(true, logic1.old35(9));
        assertEquals(false, logic1.old35(8));
        assertEquals(false, logic1.old35(7));
        assertEquals(true, logic1.old35(6));
        assertEquals(false, logic1.old35(17));
        assertEquals(true, logic1.old35(18));
        assertEquals(false, logic1.old35(29));
        assertEquals(true, logic1.old35(20));
        assertEquals(true, logic1.old35(21));
        assertEquals(false, logic1.old35(22));
        assertEquals(false, logic1.old35(45));
        assertEquals(true, logic1.old35(99));
    }

    @Disabled
    @Test
    public void less20() {
        assertEquals(true, logic1.less20(18));
        assertEquals(true, logic1.less20(19));
        assertEquals(false, logic1.less20(20));
        assertEquals(false, logic1.less20(8));
        assertEquals(false, logic1.less20(17));
        assertEquals(false, logic1.less20(23));
        assertEquals(false, logic1.less20(25));
        assertEquals(false, logic1.less20(30));
        assertEquals(false, logic1.less20(31));
        assertEquals(true, logic1.less20(58));
        assertEquals(true, logic1.less20(59));
        assertEquals(false, logic1.less20(60));
        assertEquals(false, logic1.less20(61));
        assertEquals(false, logic1.less20(62));
        assertEquals(false, logic1.less20(1017));
        assertEquals(true, logic1.less20(1018));
        assertEquals(true, logic1.less20(1019));
        assertEquals(false, logic1.less20(1020));
        assertEquals(false, logic1.less20(1021));
        assertEquals(false, logic1.less20(1022));
        assertEquals(false, logic1.less20(1023));
        assertEquals(false, logic1.less20(37));
    }

    @Disabled
    @Test
    public void nearTen() {
        assertEquals(true, logic1.nearTen(12));
        assertEquals(false, logic1.nearTen(17));
        assertEquals(true, logic1.nearTen(19));
        assertEquals(true, logic1.nearTen(31));
        assertEquals(false, logic1.nearTen(6));
        assertEquals(true, logic1.nearTen(10));
        assertEquals(true, logic1.nearTen(11));
        assertEquals(true, logic1.nearTen(21));
        assertEquals(true, logic1.nearTen(22));
        assertEquals(false, logic1.nearTen(23));
        assertEquals(false, logic1.nearTen(54));
        assertEquals(false, logic1.nearTen(155));
        assertEquals(true, logic1.nearTen(158));
        assertEquals(false, logic1.nearTen(3));
        assertEquals(true, logic1.nearTen(1));
    }

    @Disabled
    @Test
    public void teenSum() {
        assertEquals(7, logic1.teenSum(3, 4));
        assertEquals(19, logic1.teenSum(10, 13));
        assertEquals(19, logic1.teenSum(13, 2));
        assertEquals(19, logic1.teenSum(3, 19));
        assertEquals(19, logic1.teenSum(13, 13));
        assertEquals(20, logic1.teenSum(10, 10));
        assertEquals(19, logic1.teenSum(6, 14));
        assertEquals(19, logic1.teenSum(15, 2));
        assertEquals(19, logic1.teenSum(19, 19));
        assertEquals(19, logic1.teenSum(19, 20));
        assertEquals(19, logic1.teenSum(2, 18));
        assertEquals(16, logic1.teenSum(12, 4));
        assertEquals(22, logic1.teenSum(2, 20));
        assertEquals(19, logic1.teenSum(2, 17));
        assertEquals(19, logic1.teenSum(2, 16));
        assertEquals(13, logic1.teenSum(6, 7));
    }

    @Disabled
    @Test
    public void answerCell() {
        assertEquals(true, logic1.answerCell(false, false, false));
        assertEquals(false, logic1.answerCell(false, false, true));
        assertEquals(false, logic1.answerCell(true, false, false));
        assertEquals(true, logic1.answerCell(true, true, false));
        assertEquals(true, logic1.answerCell(false, true, false));
        assertEquals(false, logic1.answerCell(true, true, true));
    }

    @Disabled
    @Test
    public void teaParty() {
        assertEquals(1, logic1.teaParty(6, 8));
        assertEquals(0, logic1.teaParty(3, 8));
        assertEquals(2, logic1.teaParty(20, 6));
        assertEquals(2, logic1.teaParty(12, 6));
        assertEquals(1, logic1.teaParty(11, 6));
        assertEquals(0, logic1.teaParty(11, 4));
        assertEquals(0, logic1.teaParty(4, 5));
        assertEquals(1, logic1.teaParty(5, 5));
        assertEquals(1, logic1.teaParty(6, 6));
        assertEquals(2, logic1.teaParty(5, 10));
        assertEquals(1, logic1.teaParty(5, 9));
        assertEquals(0, logic1.teaParty(10, 4));
        assertEquals(2, logic1.teaParty(10, 20));
    }

    @Disabled
    @Test
    public void fizzvoid() {
        assertEquals("Fizz", logic1.fizzString("fig"));
        assertEquals("Buzz", logic1.fizzString("dib"));
        assertEquals("FizzBuzz", logic1.fizzString("fib"));
        assertEquals("abc", logic1.fizzString("abc"));
        assertEquals("Fizz", logic1.fizzString("fooo"));
        assertEquals("booo", logic1.fizzString("booo"));
        assertEquals("Buzz", logic1.fizzString("ooob"));
        assertEquals("FizzBuzz", logic1.fizzString("fooob"));
        assertEquals("Fizz", logic1.fizzString("f"));
        assertEquals("Buzz", logic1.fizzString("b"));
        assertEquals("Buzz", logic1.fizzString("abcb"));
        assertEquals("Hello", logic1.fizzString("Hello"));
        assertEquals("Buzz", logic1.fizzString("Hellob"));
        assertEquals("af", logic1.fizzString("af"));
        assertEquals("bf", logic1.fizzString("bf"));
        assertEquals("FizzBuzz", logic1.fizzString("fb"));
    }

    @Disabled
    @Test
    public void fizzvoid2() {
        assertEquals("1!", logic1.fizzString2(1));
        assertEquals("2!", logic1.fizzString2(2));
        assertEquals("Fizz!", logic1.fizzString2(3));
        assertEquals("4!", logic1.fizzString2(4));
        assertEquals("Buzz!", logic1.fizzString2(5));
        assertEquals("Fizz!", logic1.fizzString2(6));
        assertEquals("7!", logic1.fizzString2(7));
        assertEquals("8!", logic1.fizzString2(8));
        assertEquals("Fizz!", logic1.fizzString2(9));
        assertEquals("FizzBuzz!", logic1.fizzString2(15));
        assertEquals("16!", logic1.fizzString2(16));
        assertEquals("Fizz!", logic1.fizzString2(18));
        assertEquals("19!", logic1.fizzString2(19));
        assertEquals("Fizz!", logic1.fizzString2(21));
        assertEquals("44!", logic1.fizzString2(44));
        assertEquals("FizzBuzz!", logic1.fizzString2(45));
        assertEquals("Buzz!", logic1.fizzString2(100));
    }

    @Disabled
    @Test
    public void twoAsOne() {
        assertEquals(true, logic1.twoAsOne(1, 2, 3));
        assertEquals(true, logic1.twoAsOne(3, 1, 2));
        assertEquals(false, logic1.twoAsOne(3, 2, 2));
        assertEquals(true, logic1.twoAsOne(2, 3, 1));
        assertEquals(true, logic1.twoAsOne(5, 3, -2));
        assertEquals(false, logic1.twoAsOne(5, 3, -3));
        assertEquals(true, logic1.twoAsOne(2, 5, 3));
        assertEquals(false, logic1.twoAsOne(9, 5, 5));
        assertEquals(true, logic1.twoAsOne(9, 4, 5));
        assertEquals(true, logic1.twoAsOne(5, 4, 9));
        assertEquals(true, logic1.twoAsOne(3, 3, 0));
        assertEquals(false, logic1.twoAsOne(3, 3, 2));
    }

    @Disabled
    @Test
    public void inOrder() {
        assertEquals(true, logic1.inOrder(1, 2, 4, false));
        assertEquals(false, logic1.inOrder(1, 2, 1, false));
        assertEquals(true, logic1.inOrder(1, 1, 2, true));
        assertEquals(false, logic1.inOrder(3, 2, 4, false));
        assertEquals(true, logic1.inOrder(2, 3, 4, false));
        assertEquals(true, logic1.inOrder(3, 2, 4, true));
        assertEquals(false, logic1.inOrder(4, 2, 2, true));
        assertEquals(false, logic1.inOrder(4, 5, 2, true));
        assertEquals(true, logic1.inOrder(2, 4, 6, true));
        assertEquals(true, logic1.inOrder(7, 9, 10, false));
        assertEquals(true, logic1.inOrder(7, 5, 6, true));
        assertEquals(false, logic1.inOrder(7, 5, 4, true));
    }

    @Disabled
    @Test
    public void inOrderEqual() {
        assertEquals(true, logic1.inOrderEqual(2, 5, 11, false));
        assertEquals(false, logic1.inOrderEqual(5, 7, 6, false));
        assertEquals(true, logic1.inOrderEqual(5, 5, 7, true));
        assertEquals(false, logic1.inOrderEqual(5, 5, 7, false));
        assertEquals(false, logic1.inOrderEqual(2, 5, 4, false));
        assertEquals(false, logic1.inOrderEqual(3, 4, 3, false));
        assertEquals(false, logic1.inOrderEqual(3, 4, 4, false));
        assertEquals(false, logic1.inOrderEqual(3, 4, 3, true));
        assertEquals(true, logic1.inOrderEqual(3, 4, 4, true));
        assertEquals(true, logic1.inOrderEqual(1, 5, 5, true));
        assertEquals(true, logic1.inOrderEqual(5, 5, 5, true));
        assertEquals(false, logic1.inOrderEqual(2, 2, 1, true));
        assertEquals(false, logic1.inOrderEqual(9, 2, 2, true));
        assertEquals(false, logic1.inOrderEqual(0, 1, 0, true));
    }

    @Disabled
    @Test
    public void lastDigit() {
        assertEquals(true, logic1.lastDigit(23, 19, 13));
        assertEquals(false, logic1.lastDigit(23, 19, 12));
        assertEquals(true, logic1.lastDigit(23, 19, 3));
        assertEquals(true, logic1.lastDigit(23, 19, 39));
        assertEquals(false, logic1.lastDigit(1, 2, 3));
        assertEquals(true, logic1.lastDigit(1, 1, 2));
        assertEquals(true, logic1.lastDigit(1, 2, 2));
        assertEquals(false, logic1.lastDigit(14, 25, 43));
        assertEquals(true, logic1.lastDigit(14, 25, 45));
        assertEquals(false, logic1.lastDigit(248, 106, 1002));
        assertEquals(true, logic1.lastDigit(248, 106, 1008));
        assertEquals(true, logic1.lastDigit(10, 11, 20));
        assertEquals(true, logic1.lastDigit(0, 11, 0));
    }

    @Disabled
    @Test
    public void lessBy10() {
        assertEquals(true, logic1.lessBy10(1, 7, 11));
        assertEquals(false, logic1.lessBy10(1, 7, 10));
        assertEquals(true, logic1.lessBy10(11, 1, 7));
        assertEquals(false, logic1.lessBy10(10, 7, 1));
        assertEquals(true, logic1.lessBy10(-10, 2, 2));
        assertEquals(false, logic1.lessBy10(2, 11, 11));
        assertEquals(true, logic1.lessBy10(3, 3, 30));
        assertEquals(false, logic1.lessBy10(3, 3, 3));
        assertEquals(true, logic1.lessBy10(10, 1, 11));
        assertEquals(true, logic1.lessBy10(10, 11, 1));
        assertEquals(false, logic1.lessBy10(10, 11, 2));
        assertEquals(true, logic1.lessBy10(3, 30, 3));
        assertEquals(true, logic1.lessBy10(2, 2, -8));
        assertEquals(true, logic1.lessBy10(2, 8, 12));
    }

    @Disabled
    @Test
    public void withoutDoubles() {
        assertEquals(5, logic1.withoutDoubles(2, 3, true));
        assertEquals(7, logic1.withoutDoubles(3, 3, true));
        assertEquals(6, logic1.withoutDoubles(3, 3, false));
        assertEquals(5, logic1.withoutDoubles(2, 3, false));
        assertEquals(9, logic1.withoutDoubles(5, 4, true));
        assertEquals(9, logic1.withoutDoubles(5, 4, false));
        assertEquals(11, logic1.withoutDoubles(5, 5, true));
        assertEquals(10, logic1.withoutDoubles(5, 5, false));
        assertEquals(7, logic1.withoutDoubles(6, 6, true));
        assertEquals(12, logic1.withoutDoubles(6, 6, false));
        assertEquals(7, logic1.withoutDoubles(1, 6, true));
        assertEquals(7, logic1.withoutDoubles(6, 1, false));
    }

    @Disabled
    @Test
    public void maxMod5() {
        assertEquals(3, logic1.maxMod5(2, 3));
        assertEquals(6, logic1.maxMod5(6, 2));
        assertEquals(3, logic1.maxMod5(3, 2));
        assertEquals(12, logic1.maxMod5(8, 12));
        assertEquals(7, logic1.maxMod5(7, 12));
        assertEquals(6, logic1.maxMod5(11, 6));
        assertEquals(2, logic1.maxMod5(2, 7));
        assertEquals(0, logic1.maxMod5(7, 7));
        assertEquals(9, logic1.maxMod5(9, 1));
        assertEquals(9, logic1.maxMod5(9, 14));
        assertEquals(2, logic1.maxMod5(1, 2));
    }

    @Disabled
    @Test
    public void redTicket() {
        assertEquals(10, logic1.redTicket(2, 2, 2));
        assertEquals(0, logic1.redTicket(2, 2, 1));
        assertEquals(5, logic1.redTicket(0, 0, 0));
        assertEquals(1, logic1.redTicket(2, 0, 0));
        assertEquals(5, logic1.redTicket(1, 1, 1));
        assertEquals(0, logic1.redTicket(1, 2, 1));
        assertEquals(1, logic1.redTicket(1, 2, 0));
        assertEquals(1, logic1.redTicket(0, 2, 2));
        assertEquals(1, logic1.redTicket(1, 2, 2));
        assertEquals(0, logic1.redTicket(0, 2, 0));
        assertEquals(0, logic1.redTicket(1, 1, 2));
    }

    @Disabled
    @Test
    public void greenTicket() {
        assertEquals(0, logic1.greenTicket(1, 2, 3));
        assertEquals(20, logic1.greenTicket(2, 2, 2));
        assertEquals(10, logic1.greenTicket(1, 1, 2));
        assertEquals(10, logic1.greenTicket(2, 1, 1));
        assertEquals(10, logic1.greenTicket(1, 2, 1));
        assertEquals(0, logic1.greenTicket(3, 2, 1));
        assertEquals(20, logic1.greenTicket(0, 0, 0));
        assertEquals(10, logic1.greenTicket(2, 0, 0));
        assertEquals(0, logic1.greenTicket(0, 9, 10));
        assertEquals(10, logic1.greenTicket(0, 10, 0));
        assertEquals(20, logic1.greenTicket(9, 9, 9));
        assertEquals(10, logic1.greenTicket(9, 0, 9));
    }

    @Disabled
    @Test
    public void blueTicket() {
        assertEquals(10, logic1.blueTicket(9, 1, 0));
        assertEquals(0, logic1.blueTicket(9, 2, 0));
        assertEquals(10, logic1.blueTicket(6, 1, 4));
        assertEquals(0, logic1.blueTicket(6, 1, 5));
        assertEquals(10, logic1.blueTicket(10, 0, 0));
        assertEquals(5, logic1.blueTicket(15, 0, 5));
        assertEquals(10, logic1.blueTicket(5, 15, 5));
        assertEquals(5, logic1.blueTicket(4, 11, 1));
        assertEquals(5, logic1.blueTicket(13, 2, 3));
        assertEquals(0, logic1.blueTicket(8, 4, 3));
        assertEquals(10, logic1.blueTicket(8, 4, 2));
        assertEquals(0, logic1.blueTicket(8, 4, 1));
    }

    @Disabled
    @Test
    public void shareDigit() {
        assertEquals(true, logic1.shareDigit(12, 23));
        assertEquals(false, logic1.shareDigit(12, 43));
        assertEquals(false, logic1.shareDigit(12, 44));
        assertEquals(true, logic1.shareDigit(23, 12));
        assertEquals(true, logic1.shareDigit(23, 39));
        assertEquals(false, logic1.shareDigit(23, 19));
        assertEquals(true, logic1.shareDigit(30, 90));
        assertEquals(false, logic1.shareDigit(30, 91));
        assertEquals(true, logic1.shareDigit(55, 55));
        assertEquals(false, logic1.shareDigit(55, 44));
    }

    @Disabled
    @Test
    public void sumLimit() {
        assertEquals(5, logic1.sumLimit(2, 3));
        assertEquals(8, logic1.sumLimit(8, 3));
        assertEquals(9, logic1.sumLimit(8, 1));
        assertEquals(50, logic1.sumLimit(11, 39));
        assertEquals(11, logic1.sumLimit(11, 99));
        assertEquals(0, logic1.sumLimit(0, 0));
        assertEquals(99, logic1.sumLimit(99, 0));
        assertEquals(99, logic1.sumLimit(99, 1));
        assertEquals(124, logic1.sumLimit(123, 1));
        assertEquals(1, logic1.sumLimit(1, 123));
        assertEquals(83, logic1.sumLimit(23, 60));
        assertEquals(23, logic1.sumLimit(23, 80));
        assertEquals(9001, logic1.sumLimit(9000, 1));
        assertEquals(90000001, logic1.sumLimit(90000000, 1));
        assertEquals(9000, logic1.sumLimit(9000, 1000));
    }

}

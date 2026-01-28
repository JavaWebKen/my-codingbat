
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Logic2Tests {

    Logic2 logic2 = new Logic2();

    @Disabled
    @Test
    public void makeBricks() {
        assertEquals(true, logic2.makeBricks(3, 1, 8));
        assertEquals(false, logic2.makeBricks(3, 1, 9));
        assertEquals(true, logic2.makeBricks(3, 2, 10));
        assertEquals(true, logic2.makeBricks(3, 2, 8));
        assertEquals(false, logic2.makeBricks(3, 2, 9));
        assertEquals(true, logic2.makeBricks(6, 1, 11));
        assertEquals(false, logic2.makeBricks(6, 0, 11));
        assertEquals(true, logic2.makeBricks(1, 4, 11));
        assertEquals(true, logic2.makeBricks(0, 3, 10));
        assertEquals(false, logic2.makeBricks(1, 4, 12));
        assertEquals(true, logic2.makeBricks(3, 1, 7));
        assertEquals(false, logic2.makeBricks(1, 1, 7));
        assertEquals(true, logic2.makeBricks(2, 1, 7));
        assertEquals(true, logic2.makeBricks(7, 1, 11));
        assertEquals(true, logic2.makeBricks(7, 1, 8));
        assertEquals(false, logic2.makeBricks(7, 1, 13));
        assertEquals(true, logic2.makeBricks(43, 1, 46));
        assertEquals(false, logic2.makeBricks(40, 1, 46));
        assertEquals(true, logic2.makeBricks(40, 2, 47));
        assertEquals(true, logic2.makeBricks(40, 2, 50));
        assertEquals(false, logic2.makeBricks(40, 2, 52));
        assertEquals(false, logic2.makeBricks(22, 2, 33));
        assertEquals(true, logic2.makeBricks(0, 2, 10));
        assertEquals(true, logic2.makeBricks(1000000, 1000, 1000100));
        assertEquals(false, logic2.makeBricks(2, 1000000, 100003));
        assertEquals(true, logic2.makeBricks(20, 0, 19));
        assertEquals(false, logic2.makeBricks(20, 0, 21));
        assertEquals(false, logic2.makeBricks(20, 4, 51));
        assertEquals(true, logic2.makeBricks(20, 4, 39));
    }

    @Disabled
    @Test
    public void loneSum() {
        assertEquals(6, logic2.loneSum(1, 2, 3));
        assertEquals(2, logic2.loneSum(3, 2, 3));
        assertEquals(0, logic2.loneSum(3, 3, 3));
        assertEquals(9, logic2.loneSum(9, 2, 2));
        assertEquals(9, logic2.loneSum(2, 2, 9));
        assertEquals(9, logic2.loneSum(2, 9, 2));
        assertEquals(14, logic2.loneSum(2, 9, 3));
        assertEquals(9, logic2.loneSum(4, 2, 3));
        assertEquals(3, logic2.loneSum(1, 3, 1));
    }

    @Disabled
    @Test
    public void luckySum() {
        assertEquals(6, logic2.luckySum(1, 2, 3));
        assertEquals(3, logic2.luckySum(1, 2, 13));
        assertEquals(1, logic2.luckySum(1, 13, 3));
        assertEquals(1, logic2.luckySum(1, 13, 13));
        assertEquals(13, logic2.luckySum(6, 5, 2));
        assertEquals(0, logic2.luckySum(13, 2, 3));
        assertEquals(0, logic2.luckySum(13, 2, 13));
        assertEquals(0, logic2.luckySum(13, 13, 2));
        assertEquals(13, logic2.luckySum(9, 4, 13));
        assertEquals(8, logic2.luckySum(8, 13, 2));
        assertEquals(10, logic2.luckySum(7, 2, 1));
        assertEquals(6, logic2.luckySum(3, 3, 13));
    }

    @Disabled
    @Test
    public void noTeenSum() {
        assertEquals(6, logic2.noTeenSum(1, 2, 3));
        assertEquals(3, logic2.noTeenSum(2, 13, 1));
        assertEquals(3, logic2.noTeenSum(2, 1, 14));
        assertEquals(18, logic2.noTeenSum(2, 1, 15));
        assertEquals(19, logic2.noTeenSum(2, 1, 16));
        assertEquals(3, logic2.noTeenSum(2, 1, 17));
        assertEquals(3, logic2.noTeenSum(17, 1, 2));
        assertEquals(19, logic2.noTeenSum(2, 15, 2));
        assertEquals(16, logic2.noTeenSum(16, 17, 18));
        assertEquals(0, logic2.noTeenSum(17, 18, 19));
        assertEquals(32, logic2.noTeenSum(15, 16, 1));
        assertEquals(30, logic2.noTeenSum(15, 15, 19));
        assertEquals(31, logic2.noTeenSum(15, 19, 16));
        assertEquals(5, logic2.noTeenSum(5, 17, 18));
        assertEquals(16, logic2.noTeenSum(17, 18, 16));
        assertEquals(0, logic2.noTeenSum(17, 19, 18));
    }

    @Disabled
    @Test
    public void roundSum() {
        assertEquals(60, logic2.roundSum(16, 17, 18));
        assertEquals(30, logic2.roundSum(12, 13, 14));
        assertEquals(10, logic2.roundSum(6, 4, 4));
        assertEquals(20, logic2.roundSum(4, 6, 5));
        assertEquals(10, logic2.roundSum(4, 4, 6));
        assertEquals(10, logic2.roundSum(9, 4, 4));
        assertEquals(0, logic2.roundSum(0, 0, 1));
        assertEquals(10, logic2.roundSum(0, 9, 0));
        assertEquals(40, logic2.roundSum(10, 10, 19));
        assertEquals(90, logic2.roundSum(20, 30, 40));
        assertEquals(100, logic2.roundSum(45, 21, 30));
        assertEquals(60, logic2.roundSum(23, 11, 26));
        assertEquals(70, logic2.roundSum(23, 24, 25));
        assertEquals(80, logic2.roundSum(25, 24, 25));
        assertEquals(70, logic2.roundSum(23, 24, 29));
        assertEquals(70, logic2.roundSum(11, 24, 36));
        assertEquals(90, logic2.roundSum(24, 36, 32));
        assertEquals(50, logic2.roundSum(14, 12, 26));
        assertEquals(40, logic2.roundSum(12, 10, 24));
    }

    @Disabled
    @Test
    public void closeFar() {
        assertEquals(true, logic2.closeFar(1, 2, 10));
        assertEquals(false, logic2.closeFar(1, 2, 3));
        assertEquals(true, logic2.closeFar(4, 1, 3));
        assertEquals(false, logic2.closeFar(4, 5, 3));
        assertEquals(false, logic2.closeFar(4, 3, 5));
        assertEquals(true, logic2.closeFar(-1, 10, 0));
        assertEquals(true, logic2.closeFar(0, -1, 10));
        assertEquals(true, logic2.closeFar(10, 10, 8));
        assertEquals(false, logic2.closeFar(10, 8, 9));
        assertEquals(false, logic2.closeFar(8, 9, 10));
        assertEquals(false, logic2.closeFar(8, 9, 7));
        assertEquals(true, logic2.closeFar(8, 6, 9));
    }

    @Disabled
    @Test
    public void blackjack() {
        assertEquals(21, logic2.blackjack(19, 21));
        assertEquals(21, logic2.blackjack(21, 19));
        assertEquals(19, logic2.blackjack(19, 22));
        assertEquals(19, logic2.blackjack(22, 19));
        assertEquals(0, logic2.blackjack(22, 50));
        assertEquals(0, logic2.blackjack(22, 22));
        assertEquals(1, logic2.blackjack(33, 1));
        assertEquals(2, logic2.blackjack(1, 2));
        assertEquals(0, logic2.blackjack(34, 33));
        assertEquals(19, logic2.blackjack(17, 19));
        assertEquals(18, logic2.blackjack(18, 17));
        assertEquals(16, logic2.blackjack(16, 23));
        assertEquals(4, logic2.blackjack(3, 4));
        assertEquals(3, logic2.blackjack(3, 2));
        assertEquals(21, logic2.blackjack(21, 20));
    }

    @Disabled
    @Test
    public void evenlySpaced() {
        assertEquals(true, logic2.evenlySpaced(2, 4, 6));
        assertEquals(true, logic2.evenlySpaced(4, 6, 2));
        assertEquals(false, logic2.evenlySpaced(4, 6, 3));
        assertEquals(true, logic2.evenlySpaced(6, 2, 4));
        assertEquals(false, logic2.evenlySpaced(6, 2, 8));
        assertEquals(true, logic2.evenlySpaced(2, 2, 2));
        assertEquals(false, logic2.evenlySpaced(2, 2, 3));
        assertEquals(true, logic2.evenlySpaced(9, 10, 11));
        assertEquals(true, logic2.evenlySpaced(10, 9, 11));
        assertEquals(false, logic2.evenlySpaced(10, 9, 9));
        assertEquals(false, logic2.evenlySpaced(2, 4, 4));
        assertEquals(false, logic2.evenlySpaced(2, 2, 4));
        assertEquals(false, logic2.evenlySpaced(3, 6, 12));
        assertEquals(false, logic2.evenlySpaced(12, 3, 6));
    }

    @Disabled
    @Test
    public void makeChocolate() {
        assertEquals(4, logic2.makeChocolate(4, 1, 9));
        assertEquals(-1, logic2.makeChocolate(4, 1, 10));
        assertEquals(2, logic2.makeChocolate(4, 1, 7));
        assertEquals(2, logic2.makeChocolate(6, 2, 7));
        assertEquals(0, logic2.makeChocolate(4, 1, 5));
        assertEquals(4, logic2.makeChocolate(4, 1, 4));
        assertEquals(4, logic2.makeChocolate(5, 4, 9));
        assertEquals(3, logic2.makeChocolate(9, 3, 18));
        assertEquals(-1, logic2.makeChocolate(3, 1, 9));
        assertEquals(-1, logic2.makeChocolate(1, 2, 7));
        assertEquals(1, logic2.makeChocolate(1, 2, 6));
        assertEquals(0, logic2.makeChocolate(1, 2, 5));
        assertEquals(5, logic2.makeChocolate(6, 1, 10));
        assertEquals(6, logic2.makeChocolate(6, 1, 11));
        assertEquals(-1, logic2.makeChocolate(6, 1, 12));
        assertEquals(-1, logic2.makeChocolate(6, 1, 13));
        assertEquals(0, logic2.makeChocolate(6, 2, 10));
        assertEquals(1, logic2.makeChocolate(6, 2, 11));
        assertEquals(2, logic2.makeChocolate(6, 2, 12));
        assertEquals(50, logic2.makeChocolate(60, 100, 550));
        assertEquals(6, logic2.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, logic2.makeChocolate(7, 1, 12));
        assertEquals(-1, logic2.makeChocolate(7, 1, 13));
        assertEquals(3, logic2.makeChocolate(7, 2, 13));
    }

}

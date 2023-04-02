package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    public static String testingTask01() {
        boolean result = Task01.task01(10, 15) == 15
                && Task01.task01(40, 25) == 40
                && Task01.task01(7, 7) == 7
                && Task01.task01(10, -15) == 10
                && Task01.task01(-40, 25) == 25
                && Task01.task01(-7, -7) == -7;

        return String.format("Task 01 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask02() {
        boolean result = Task02.task02(7, 6) == 1
                && Task02.task02(6, 7) == 2
                && Task02.task02(7, 7) == 0
                && Task02.task02(5, -6) == 1
                && Task02.task02(-6, 5) == 2
                && Task02.task02(-5, -5) == 0;

        return String.format("Task 02 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask03() {
        boolean result = Task03.task03(3, 5, 5)
                && Task03.task03(1, 1, 1)
                && Task03.task03(1, 1, 2)
                && Task03.task03(1, 2, 2)
                && Task03.task03(2, 1, 2)
                && !Task03.task03(2, 1, 1)
                && !Task03.task03(1, 2, 1)
                && !Task03.task03(4, 6, 5)
                && !Task03.task03(1, 1, -1)
                && !Task03.task03(-1, 1, 1)
                && !Task03.task03(1, -1, 1)
                && !Task03.task03(0, 1, 1)
                && !Task03.task03(1, 0, 1)
                && !Task03.task03(1, 1, 0)
                && !Task03.task03(0, 0, 0)
                && !Task03.task03(-1, -1, -1);

        return String.format("Task 03 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask04() {
        boolean result = !Task04.task04(4, 6, 5, 5)
                && Task04.task04(3, 5, 5, 4)
                && Task04.task04(1, 1, 1, 1)
                && Task04.task04(2, 2, 2, 2)
                && Task04.task04(1, 2, 2, 2)
                && Task04.task04(2, 1, 2, 2)
                && Task04.task04(1, 2, 1, 2)
                && Task04.task04(1, 2, 2, 1)
                && Task04.task04(2, 1, 1, 2)
                && Task04.task04(2, 1, 2, 1)
                && !Task04.task04(3, 2, 2, 2)
                && !Task04.task04(2, 3, 2, 2)
                && !Task04.task04(3, 3, 2, 2)
                && !Task04.task04(3, 3, 3, 2)
                && !Task04.task04(3, 3, 2, 3)
                && !Task04.task04(-3, 3, 2, 3)
                && !Task04.task04(3, -3, 2, 3)
                && !Task04.task04(-3, -3, 2, 3)
                && !Task04.task04(3, 3, -2, 3)
                && !Task04.task04(3, 3, 2, -3)
                && !Task04.task04(3, 3, -2, -3)
                && !Task04.task04(-3, -3, -2, -3)
                && !Task04.task04(0, 3, 2, 3)
                && !Task04.task04(3, 0, 2, 3)
                && !Task04.task04(3, 3, 0, 3)
                && !Task04.task04(3, 3, 2, 0);

        return String.format("Task 04 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask05() {
        boolean result = Task05.task05(10, 15, 2).trim().equalsIgnoreCase("20 30")
                && Task05.task05(4, 25, 8).trim().equalsIgnoreCase("34 0")
                && Task05.task05(1, 1, 8).trim().equalsIgnoreCase("8 8")
                && Task05.task05(1, 1, 1).trim().equalsIgnoreCase("1 1")
                && Task05.task05(0, 25, 3).trim().equalsIgnoreCase("0 75")
                && Task05.task05(10, 5, 4).trim().equalsIgnoreCase("40 20")
                && Task05.task05(0, 1, 10).trim().equalsIgnoreCase("0 10")
                && Task05.task05(1, 0, 10).trim().equalsIgnoreCase("10 0")
                && Task05.task05(1, 99, 4).trim().equalsIgnoreCase("7 96")
                && Task05.task05(0, 27, 8).trim().equalsIgnoreCase("2 16")
                && Task05.task05(2, 0, 5).trim().equalsIgnoreCase("10 0")
                && Task05.task05(-1, 15, 2).trim().equalsIgnoreCase("error")
                && Task05.task05(1, -15, 2).trim().equalsIgnoreCase("error")
                && Task05.task05(1, 15, -2).trim().equalsIgnoreCase("error")
                && Task05.task05(-1, -15, 2).trim().equalsIgnoreCase("error")
                && Task05.task05(-1, 15, -2).trim().equalsIgnoreCase("error")
                && Task05.task05(1, -15, -2).trim().equalsIgnoreCase("error")
                && Task05.task05(-1, -15, -2).trim().equalsIgnoreCase("error")
                && Task05.task05(0, 0, 2).trim().equalsIgnoreCase("error")
                && Task05.task05(1, 15, 0).trim().equalsIgnoreCase("error")
                && Task05.task05(0, 0, 0).trim().equalsIgnoreCase("error");

        return String.format("Task 05 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask06() {
        boolean result = Task06.task06(1, 1, 1)
                && Task06.task06(3, 4, 5)
                && Task06.task06(5, 3, 4)
                && Task06.task06(4, 5, 3)
                && !Task06.task06(1, 2, 3)
                && !Task06.task06(1, 1, 3)
                && !Task06.task06(1, 3, 1)
                && !Task06.task06(3, 1, 1)
                && !Task06.task06(-3, -4, -5)
                && !Task06.task06(-3, 4, 5)
                && !Task06.task06(3, -4, 5)
                && !Task06.task06(3, 4, -5)
                && !Task06.task06(-1, -1, -1);

        return String.format("Task 06 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask07() {
        boolean result = Task07.task07(1234) == 10
                && Task07.task07(-9999) == 36
                && Task07.task07(0) == 0
                && Task07.task07(12345) == 0
                && Task07.task07(-12345) == 0
                && Task07.task07(-123) == 6
                && Task07.task07(12) == 3
                && Task07.task07(-12) == 3
                && Task07.task07(1) == 1
                && Task07.task07(-1) == 1
                && Task07.task07(1111) == 4
                && Task07.task07(-1111) == 4
                && Task07.task07(9876) == 30
                && Task07.task07(-9876) == 30
                && Task07.task07(9000) == 9
                && Task07.task07(-9000) == 9
                && Task07.task07(9999) == 36;

        return String.format("Task 07 %s", result ? RIGHT : WRONG);
    }
}

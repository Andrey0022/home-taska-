package by.itstep.javatraining.revision.task;

/*	Task 02. Two Numbers [два числа]
 *
 *	Даны два целых числа. Программа должна вывести единицу,
 *	если первое число больше второго, двойку, если второе больше первого,
 *	или ноль, если они равны.
 *
 *	Примечание
 *	Данную задачу можно решить с использованием только встроенных в язык простых операций.
 *
 *	Формат входных данных [input]
 *	Функция принимает два любых целых числа.
 *
 *	Формат выходных данных[output]
 *	Функция должна вывести результирующее число.
 *
 *	[Sample function input  1]: 7 6
 *	[Sample function output 1]: 1
 *
 *	[input  2]: 6 7
 *	[output 2]: 2
 *
 *	[input  3]: 7 7
 *	[output 3]: 0
 */

public class Task02 {
    public static int task02(int a, int b) {
        int result = 0;
        if (a > b) {
            result = 1;
        } else if (a < b) {
            result = 2;
        }
        return result;
    }
}

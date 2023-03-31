package by.itstep.javatraining.revision.task;

/*	Task (задание) 01. Maximum Number [наибольшее число]
 *
 *	Даны два целых числа. Выведите значение наибольшего из них.
 *	Если числа равны, выведите любое из них.
 *
 *	Примечание
 *	Данную задачу можно решить с использованием только встроенных в язык простых операций.
 *
 *	Формат входных данных [input]
 *	Функция принимает два любых целых числа.
 *
 *	Формат выходных данных [output]
 *	Функция должна вывести наибольшее число.
 *
 *	[Sample function input  1] (пример передаваемых в функцию параметров): 10 15
 *	[Sample function output 1] (пример возвращаемого функцией результата): 15
 *
 *	[input  2]: 40 25
 *	[output 2]: 40
 *
 *	[input  3]: 7 7
 *	[output 3]: 7
 */

import java.util.Scanner;

public class Task01 {
    public static int task01(int a, int b) {

        if (a > b | a == b ){
            System.out.println(a);
        }else
            System.out.println(b);


        return 0;
    }






}

package by.itstep.javatraining.revision.task;

/*	Task 03. Rectangular World (1) [прямоугольный мир]
 *
 *	В прямоугольном мире свинья, раскормленная до размеров параллелепипеда,
 *	лежит в квадратной луже грязи. Определите, полностью ли основание свиньи помещается
 *	в данную лужу или нет.
 *
 *	Примечание
 *	Не забудьте про "защиту от дурака".
 *
 *	Формат входных данных [input]
 *	Функция получает на вход три целых числа W, L, S: ширину и длину прямоугольной свиньи
 *	и сторону квадратной лужи.
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить одно из булевских значений: true или false.
 *
 *	[sample function input  1]: 4 6 5
 *	[sample function output 1]: false
 *
 *	[input  2]: 3 5 5
 *	[output 2]: true
 */

public class Task03 {
    public static boolean task03(int width, int length, int side) {
        if ((width | length | side) < 0  ){
            System.out.println("error"); ;

        }else { boolean result = side >= width && side >= length;
            System.out.println(result);

        }


        return false;

    }


    }

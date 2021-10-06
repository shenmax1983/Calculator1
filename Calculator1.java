//Выполнения тестового задания консольный калькулятор

import java.util.Scanner; //Подключаем класс "Scanner" из пакета "java.util"

public class Calculator1  //Объявляем класс "Calculator1"
{
    public static int Number(String strNumber)/* Объявили метод "Number", который будет проверять первый и второй
                                               * оператор на наличие арабских или римских цифр и возвращать операторы
                                               * в целочисленном значении для проведения математических операций*/
    {
        int returnNamber=77;

        if (strNumber.equals("1") || strNumber.equals("2") || strNumber.equals("3") || strNumber.equals("4") || strNumber.equals("5"))
            returnNamber = Integer.parseInt(strNumber);
        if (strNumber.equals("6")||strNumber.equals("7")||strNumber.equals("8")||strNumber.equals("9")||strNumber.equals("10"))
            returnNamber = Integer.parseInt(strNumber);
        else if (strNumber.equals("I"))
            returnNamber=1;
        else if (strNumber.equals("II"))
            returnNamber=2;
        else if (strNumber.equals("III"))
            returnNamber=3;
        else if (strNumber.equals("IV"))
            returnNamber=4;
        else if (strNumber.equals("V"))
            returnNamber=5;
        else if (strNumber.equals("VI"))
            returnNamber=6;
        else if (strNumber.equals("VII"))
            returnNamber=7;
        else if (strNumber.equals("VIII"))
            returnNamber=8;
        else if (strNumber.equals("IX"))
            returnNamber=9;
        else if (strNumber.equals("X"))
            returnNamber=10;

        return returnNamber;
    }
    public static boolean Roma(String strNumber)/* Объявили метод "Roma", который будет проверять первый и второй
                                                 * оператор на наличие римских цифр и возвращать сигнал, если "strNumber"
                                                 * содержит арабскую цифру то метод "Roma" возвращает "false" - ложь, а
                                                 * если "strNumber" содержит римскую цифру то метод "Roma" возвращает
                                                 * "true" - истина*/
    {
        boolean returnRoma;
        if (strNumber.equals("I"))
            returnRoma=true;
        else if (strNumber.equals("II"))
            returnRoma=true;
        else if (strNumber.equals("III"))
            returnRoma=true;
        else if (strNumber.equals("IV"))
            returnRoma=true;
        else if (strNumber.equals("V"))
            returnRoma=true;
        else if (strNumber.equals("VI"))
            returnRoma=true;
        else if (strNumber.equals("VII"))
            returnRoma=true;
        else if (strNumber.equals("VIII"))
            returnRoma=true;
        else if (strNumber.equals("IX"))
            returnRoma=true;
        else if (strNumber.equals("X"))
            returnRoma=true;
        else
            returnRoma=false;

        return returnRoma;
    }
    public static String RomaResult(float Result)/* Объявили метод "RomaResult", который будет переводить результат
                                                  * вычислений из рабских чисел в римские*/
    {
        String RomaResult="Не нашлось аналога римскому числу";
        if (Result==1)
            RomaResult="I";
        else if (Result==2)
            RomaResult="II";
        else if (Result==3)
            RomaResult="III";
        else if (Result==4)
            RomaResult="IV";
        else if (Result==5)
            RomaResult="V";
        else if (Result==6)
            RomaResult="VI";
        else if (Result==7)
            RomaResult="VII";
        else if (Result==8)
            RomaResult="VIII";
        else if (Result==9)
            RomaResult="IX";
        else if (Result==10)
            RomaResult="X";
        else if (Result==11)
            RomaResult="XI";
        else if (Result==12)
            RomaResult="XII";
        else if (Result==13)
            RomaResult="XIII";
        else if (Result==14)
            RomaResult="XIV";
        else if (Result==15)
            RomaResult="XV";
        else if (Result==16)
            RomaResult="XVI";
        else if (Result==17)
            RomaResult="XVII";
        else if (Result==18)
            RomaResult="XVIII";
        else if (Result==19)
            RomaResult="XIX";
        else if (Result==20)
            RomaResult="XX";
        else if (Result==21)
            RomaResult="XXI";
        else if (Result==24)
            RomaResult="XXIV";
        else if (Result==25)
            RomaResult="XXV";
        else if (Result==27)
            RomaResult="XXVII";
        else if (Result==28)
            RomaResult="XXVIII";
        else if (Result==30)
            RomaResult="XXX";
        else if (Result==32)
            RomaResult="XXXII";
        else if (Result==35)
            RomaResult="XXXV";
        else if (Result==36)
            RomaResult="XXXVI";
        else if (Result==40)
            RomaResult="XL";
        else if (Result==42)
            RomaResult="XLII";
        else if (Result==45)
            RomaResult="XLV";
        else if (Result==48)
            RomaResult="XLVIII";
        else if (Result==49)
            RomaResult="XLIX";
        else if (Result==50)
            RomaResult="L";
        else if (Result==54)
            RomaResult="LIV";
        else if (Result==56)
            RomaResult="LVI";
        else if (Result==60)
            RomaResult="LX";
        else if (Result==63)
            RomaResult="LXIII";
        else if (Result==64)
            RomaResult="LXIV";
        else if (Result==70)
            RomaResult="LXX";
        else if (Result==72)
            RomaResult="LXXII";
        else if (Result==80)
            RomaResult="LXXX";
        else if (Result==81)
            RomaResult="LXXXI";
        else if (Result==90)
            RomaResult="CX";
        else if (Result==100)
            RomaResult="C";

        return RomaResult;
    }
    public static void main(String[] args) /* В основной функции "main", которая запускается всегда первой,
                                            * прописываем основные выражения для работы калькулятора*/
    {
        /*По условию задания оператор вводит в консоли математическое выражение в одну строну без пробелов используя
         * в виде операторов арабские или римские цифры, а в виде операнта "+", "-", "*" и "/".*/

        Scanner in = new Scanner(System.in); /* Для того чтобы прочитать данные из консоли, создадим входной поток
         * "System.in" используем метод "nextLine"*/

        System.out.print("Введите вычисляемое выражение: "); //Вывод на экран фразу "Введите вычисляемое выражение"

        String name = in.nextLine();//Считываем с консоли введенное выражение.

        /*Для того что бы произвести вычисления нужно из строковой переменной извлечь первый
         * и второй оператор и оперант. Для этого данные содержащиеся в строковой переменной "name" преобразуем в
         * символы массива*/

        /* Преобразуем строковую переменную "Name", которая содержит введенное с консоли математическое выражение в
         массив типа "char"*/

        // загружаем массив "masName" данными из переменной "Name"
        char[] masName = name.toCharArray(); /* Объявляем массив char "masName". Преобразовываем строку "Name" в массив
         * char с именем "masName"*/

        // Вычислим длину массива "masName" длина массива будет содержаться в переменной "masNameLength"
        int masNameLength = masName.length;  /* Объявляем переменную "masNameLength" в которой будет храниться значение
                                              * длины массива "masName". Вычисляем длину массива и присваиваем
                                              * полученное значение переменной "masNameLength"*/
        int indexOperanta=20; //Объявляем переменную в которой будет храниться индекс операнта
        String strNumber1="0";//Объявляем переменную которая будет хранить значение первого оператора в строковой форме
        String strNumber2="0";//Объявляем переменную которая будет хранить значение первого оператора в строковой форме
        boolean boolNumber1;  /* Объявляем переменную которая будет хранить сведения первого оператора является ли она
                               * арабской или римской цифрой*/
        boolean boolNumber2;  /* Объявляем переменную которая будет хранить сведения первого оператора является ли она
                               * арабской или римской цифрой*/
        int intNumber1=0;     //Объявляем переменную в которой будет храниться значение первого оператора
        int intNumber2=0;     //Объявляем переменную в которой будет храниться значение второго оператора
        char plus = '+', minus = '-', multiplication = '*', divisi = '/';
        float Result;

        for(int i=0; i<masNameLength;i++)
            //Находим операнд и выводим его на экран
            if(masName[i] == plus || masName[i] == minus || masName[i] == multiplication || masName[i] == divisi)
                indexOperanta = i;//Присваиваем значения индекса операнта в массиве переменной "indexOperanta"

        if(indexOperanta == 20)
        {
            // Так как оперант не был определен программа должна остановиться и прекратить работу.
            System.out.print("Оперант не найден. В веденном выражении отсутствуют знаки +, -, * и / ");
            System.out.print("\nПрограмма прекращает работать нажмите <Enter>");//
        }
        /*Зная порядковый номер операнта можно определить значения первого и второго оператора. Элементы массива у,
         *которых индексы меньше индекса операнта - это первый оператор. Элементы массива у, которых индексы больше
         * индекса операнта - это второй оператор*/
        /*Так как по условию задания калькулятор может складывать как арабские(1,2, ..., 10) так и римские цифры
         * (I, II, III, IV, V, VI, VII, VIII, IX и X) нам сначала прийдется определить сколько элементов массива
         * "masName" нужно соединить между собой, чтобы получить значение первого или второго оператора*/

        /*Если индекс элемента массива, содержащий оперант равен:
         *- "1", то нам не нужно ничего соединять, так как первый оператор состоит только из одного элемента массива с
         * индексом "0" это такие числа как I, V, X, 1, 2, ..., 9;
         *- "2", то нам нужно соединить два элемента массива с индексами "0" и "1", чтобы получить значение первого
         * оператора. Такими числами будут II, IV, VI, IX и 10;
         *- "3", то нам нужно соединить три элемента массива с индексами "0", "1" и "2", чтобы получить значение
         *  первого оператора. Такими числами будут III и VII;
         *- "4", то нам нужно соединить четыре элемента массива с индексами "0", "1", "2" и "3" чтобы получить
         *  значение первого оператора. Таким числам будет VIII.*/

        if (indexOperanta==1)
            strNumber1 = new StringBuilder().append(masName[0]).toString();
        if (indexOperanta==2)
            strNumber1 = new StringBuilder().append(masName[0]).append(masName[1]).toString();
        if (indexOperanta==3)
            strNumber1 = new StringBuilder().append(masName[0]).append(masName[1]).append(masName[2]).toString();
        if (indexOperanta==4)
            strNumber1 = new StringBuilder().append(masName[0]).append(masName[1]).append(masName[2]).append(masName[3]).toString();

        /* Таким же образом, как и первый оператор получим и второй. Но теперь будем исходить от длины строки и длины
         * первого оператора*/

        if (indexOperanta==1&&masNameLength==3)
            strNumber2 = new StringBuilder().append(masName[2]).toString();
        if (indexOperanta==1&&masNameLength==4)
            strNumber2 = new StringBuilder().append(masName[2]).append(masName[3]).toString();
        if (indexOperanta==1&&masNameLength==5)
            strNumber2 = new StringBuilder().append(masName[2]).append(masName[3]).append(masName[4]).toString();
        if (indexOperanta==1&&masNameLength==6)
            strNumber2 = new StringBuilder().append(masName[2]).append(masName[3]).append(masName[4]).append(masName[5]).toString();

        if (indexOperanta==2&&masNameLength==4)
            strNumber2 = new StringBuilder().append(masName[3]).toString();
        if (indexOperanta==2&&masNameLength==5)
            strNumber2 = new StringBuilder().append(masName[3]).append(masName[4]).toString();
        if (indexOperanta==2&&masNameLength==6)
            strNumber2 = new StringBuilder().append(masName[3]).append(masName[4]).append(masName[5]).toString();
        if (indexOperanta==2&&masNameLength==7)
            strNumber2 = new StringBuilder().append(masName[3]).append(masName[4]).append(masName[5]).append(masName[6]).toString();

        if (indexOperanta==3&&masNameLength==5)
            strNumber2 = new StringBuilder().append(masName[4]).toString();
        if (indexOperanta==3&&masNameLength==6)
            strNumber2 = new StringBuilder().append(masName[4]).append(masName[5]).toString();
        if (indexOperanta==3&&masNameLength==7)
            strNumber2 = new StringBuilder().append(masName[4]).append(masName[5]).append(masName[6]).toString();
        if (indexOperanta==3&&masNameLength==8)
            strNumber2 = new StringBuilder().append(masName[4]).append(masName[5]).append(masName[6]).append(masName[7]).toString();

        if (indexOperanta==4&&masNameLength==6)
            strNumber2 = new StringBuilder().append(masName[5]).toString();
        if (indexOperanta==4&&masNameLength==7)
            strNumber2 = new StringBuilder().append(masName[5]).append(masName[6]).toString();
        if (indexOperanta==4&&masNameLength==8)
            strNumber2 = new StringBuilder().append(masName[5]).append(masName[6]).append(masName[7]).toString();
        if (indexOperanta==4&&masNameLength==9)
            strNumber2 = new StringBuilder().append(masName[5]).append(masName[6]).append(masName[7]).append(masName[8]).toString();

        /* Определим, что хранится в переменной "strNumber1" и "strNumber2" арабские или римские цифры. Если арабские,
         * то преобразуем переменную "strNumber1" "strNumber2" из строковых в целочисленную переменную "intNumber1" и
         * "intNumber2", а если римские, то сразу присвоим целочисленной переменной "intNumber1" и "intNumber2" арабский
         * аналог римской цифры*. Для этого организуем метод "Number" который на входе будет получать значение
         * переменных "strNumber1" "strNumber2", а на выходе будет присваивать переменным "intNumber1" и "intNumber2"*
         * целочисленные значения*/

        intNumber1 = Number(strNumber1); /* Передаем в метод "Number" первый оператор в формате строка в ответ получаем
                                          * переменную целочисленного типа, которую присваиваем переменной, которая
                                          * будет участвовать в расчетах*/
        intNumber2 = Number(strNumber2); // То же самое делаем и со вторым оператором

        boolNumber1 = Roma(strNumber1); /* Передаем в метод "Number" первый оператор в формате строка в ответ получаем
                                         * переменную целочисленного типа, которую присваеваем переменной, которая
                                         * будет участвовать в расчетах*/
        boolNumber2 = Roma(strNumber2); // То же самое делаем и со вторым оператором

        switch(masName[indexOperanta])
        {
            case '+':
                Result = intNumber1 + intNumber2;
                break;
            case '-':
                Result = intNumber1 - intNumber2;
                break;
            case '*':
                Result = intNumber1 * intNumber2;
                break;
            case '/':
                Result = intNumber1 / intNumber2;
                break;
            default:
                System.out.print("Ошибка! Введен не корректный оператор");
                return;
        }
        if (boolNumber1==false&&boolNumber2==false)
        {
            System.out.print("\nРезультат вычисления выражения:\n");
            System.out.print(strNumber1 + " " + masName[indexOperanta] + " " + strNumber2 + " = " + Result);
        }
        else if (boolNumber1==true&&boolNumber2==true)
        {
            String strResult = RomaResult(Result); /* Передаем в метод "RomaResult" результат вычисления выражения
             * в ответ получаем переменную строкового типа, которая содержит
             * ответ в виде римской цифры*/
            if (strResult.equals("Не нашлось аналога римскому числу"))
            {
                System.out.print(strResult);
            }
            else
            {
                System.out.print("\nРезультат вычисления выражения:\n");
                System.out.print(strNumber1 + " " + masName[indexOperanta] + " " + strNumber2 + " = " + strResult);
            }
        }
        else
        {
            System.out.print("\nНедопустимо проводить расчет используя в качестве операторов различные типы цифр");
            System.out.print("\nОдин оператор выражен римская цифрой, а второй арабской\n");
        }
    }
}
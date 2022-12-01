public class Main {
    public static void main(String[] args) {
        // Урок Условный оператор. Часть 2
        //Задание 1
        System.out.println("Задание 1");
        //Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        byte clientOS=1;
        if (clientOS!=1){
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        //Код должен быть написан без вложенностей
        int clientDeviceYear = 2014;
        if (clientDeviceYear<2015&&clientOS!=1){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
            }
        else if (clientDeviceYear<2015&&clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        else if(clientDeviceYear>=2015&&clientOS!=1) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
            }
        else {
            System.out.println("Установите версию приложения для Android по ссылке.");
            }

        System.out.println();

        //Задание 3
        //Напишите программу, которая определяет, является ли год високосным или нет.
        System.out.println("Задание 3");
        int year =2022;
        double leapYearRule1 =year%4;//первое правило високосного года.
        double leapYearRule2 =year%100;//второе правило високосного года.
        double leapYearRule3 =year%400;//третие правило високосного года.
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        if(leapYearRule1==0&&leapYearRule2>0||leapYearRule3==0)
            System.out.println(year+" год - является високосным");
        else
            System.out.println(year+" год - является обычным");

        //Задание 4
        System.out.println("Задание 4");
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        int deliveryDistance = 95;
        int deliveryTime=deliveryDistance/40;//наш интервал равен 40 км.
        if (deliveryDistance<=20){
            deliveryTime=1; //первый интервал принудительно равен 1 дню
            System.out.println("Потребуется дней: "+deliveryTime);
        }
        else {
            deliveryTime=deliveryTime+1;//добавляем 1 день за не выполненое первое условие.
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        //Задание 5
        System.out.println("Задание 5");
        //Вывод месяца по номеру в консоль
        int monthNumber = 12;
        switch (monthNumber){
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
        }
        System.out.println("Конец");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(" Зачада1 ");

        int iOS = 0;
        if (iOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (iOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }


        System.out.println(" Задача2 ");
        iOS = 0;
        int clientDeviceYear = 2015;
        if(iOS==0);
        if (clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else {
            System.out.println(" Установите обычную  версию приложения для iOs по ссылке ");
        } if (iOS==1) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            } else {
                System.out.println(" Установите обычную  версию приложения для Android по ссылке ");
            }
        }

            System.out.println(" Задача3 ");

            int year=2021;
            if (year>1584&&((year%4==0&&year%100!=0)||year%400==0)) {
                System.out.println(year + " год является високосным ");
            }else {
                System.out.println(year + " год не является високосным ");

                System.out.println(" Задача4 ");


                int diliveryDistance = 95;
                if (diliveryDistance <= 20) {
                    System.out.println(" Потребуется дней " + 1);
                } else if (diliveryDistance > 20 && diliveryDistance <= 60) {
                    System.out.println(" Потребуется дней " + 2);
                } else if (diliveryDistance > 60 && diliveryDistance <= 100) {
                    System.out.println(" Потребуется дней " + 3);
                } else if (diliveryDistance > 100) {
                    System.out.println(" Доставки нет ");
                }


                                System.out.println(" Задача5 ");

                                int monthNumber=12;
                                switch (monthNumber){
                                case 12:
                                case 1:
                                case 2:
                                System.out.println( " Принадлежат к сезону зима ");
                                break;
                                case 3:
                                case 4:
                                case 5:
                                System.out.println( " Принадлежат к сезону весна");
                                case 6:
                                case 7:
                                case 8:
                                System.out.println( " Принадлежат к сезону лето ");
                                case 9:
                                case 10:
                                case 11:
                                System.out.println( " Принадлежат к сезону осень ");
                                break;
                                    default:
                                        System.out.println(" Такого месяца не существует ");
                                }
                            }
                        }
                }

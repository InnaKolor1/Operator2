public class Main {
    public static void main(String[] args) {
        System.out.println(" Зачада1 ");

        int clientOS=0;
        if (clientOS==0) {
            System.out.println( " Установите версию приложения для iOS по ссылке ");

            int clientAndroid=1;
            if (clientAndroid==1){
                System.out.println( " Установите версию приложения для Android по ссылке ");
            }


            System.out.println(" Задача2 ");
            int clientDeviceYear=2015;
            if(clientDeviceYear>2015) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            }else{
                System.out.println(" Установите облегченную  версию приложения для Android по ссылке ");
            }
            if (clientDeviceYear<=2015){
                System.out.println(" Установите обычную версию приложения для iOS по ссылке ");
            }else {
                System.out.println(" Установите обычную  версию приложения для Android по ссылке ");
            }


            System.out.println(" Задача3 ");

            int year=2021;
            if (year==2021) {
                System.out.println(year + " год является високосным ");
            }else{
                System.out.println(year+ " год не является високосным ");

                System.out.println(" Задача4 ");

                int delivery=20;
                int day=1;
                if (delivery==20){
                    System.out.println(" Потребуется дней "+day);
                }
                        int day2=day+1;
                        if (delivery>20&&delivery<60){
                        System.out.println(" Потребуется дней "+day2);

                        int day3=day2+1;
                        if (delivery>60&&delivery<100){
                            System.out.println( " Потребуется дней "+day3);

                            int day4=day3+1;
                            if (delivery>100){
                                System.out.println( " Потребуется дней "+day4);

                                byte diliveryDistance=95;
                                System.out.println( " Потребуется дней "+day3);


                                System.out.println(" Задача5 ");

                                int monthNumber=12;
                                switch (monthNumber){
                                    case 1:
                                        System.out.println( " Январь. Принадлежит к сезону зима ");
                                        break;
                                    case 2:
                                        System.out.println( " Февраль. Принадлежит к сезону зима ");
                                        break;
                                    case 3:
                                        System.out.println( " Март. Принадлежит к сезону весна ");
                                        break;
                                    case 4:
                                        System.out.println( " Апрель. Принадлежит к сезону весна ");
                                        break;
                                    case 5:
                                        System.out.println( " Май. Принадлежит к сезону весна ");
                                        break;
                                    case 6:
                                        System.out.println( " Июнь. Принадлежит к сезону лето ");
                                        break;
                                    case 7:
                                        System.out.println( " Июль. Принадлежит к сезону лето ");
                                        break;
                                    case 8:
                                        System.out.println( " Август. Принадлежит к сезону лето ");
                                        break;
                                    case 9:
                                        System.out.println( " Сентябрь. Принадлежит к сезону осень ");
                                        break;
                                    case 10:
                                        System.out.println( " Октябрь. Принадлежит к сезону осень ");
                                        break;
                                    case 11:
                                        System.out.println( " Ноябрь. Принадлежит к сезону осень ");
                                        break;
                                    case 12:
                                        System.out.println( " Декабрь. Принадлежит к сезону зима ");
                                        break;
                                    default:
                                        System.out.println(" Такого месяца не существует ");
                                }
                            }
                        }
                }
            }
        }
    }
}
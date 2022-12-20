public class Main {
    public static void main(String[] args) {
        System.out.println("hw 4.1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке https://apps.apple.com/ru/app/skypro-онлайн-университет/id1568515479");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке https://play.google.com/store/apps/details?id=skyeng.words.prod&hl=ru&gl=US");
        }

        System.out.println("hw 4.2");
        int clientDeviceYear = 2013;
        if (clientDeviceYear >= 2015 && clientDeviceYear < 2022) {
            System.out.println("Установите приложение");
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("hw 4.3");
        int currentYear = 2020;
        if (((currentYear % 4 == 0) && (currentYear % 100 != 0)) || (currentYear % 400 == 0)) {
            System.out.println(currentYear + " это високосный год");
        } else {
            System.out.println(currentYear + " это не високосный год");
        }

        System.out.println("hw 4.4");
        int deliveryDistance = 95;
        int delivery = 20;
        int delivery2 = 60;
        int delivery3 = 100;
        int delivery4 = 140;
        int delivery5 = 180;
        int delivery6 = 220;
        int delivery7 = 260;
        int delivery8 = 300;

        if (deliveryDistance < delivery) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 1 дня");
        } else if (deliveryDistance >= delivery && deliveryDistance <= delivery2) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 2 дней");
        } else if (deliveryDistance > delivery2 && deliveryDistance <= delivery3) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 3 дней");
        } else if (deliveryDistance > delivery3 && deliveryDistance <= delivery4) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 4 дней");
        } else if (deliveryDistance > delivery5 && deliveryDistance <= delivery6) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 5 дней");
        } else if (deliveryDistance > delivery6 && deliveryDistance <= delivery7) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении 6 дней");
        } else if (deliveryDistance > delivery7 && deliveryDistance <= delivery8) {
            System.out.println("На расстояние " + deliveryDistance + " км. посылка будет доставлена в течении недели");
        } else{
            System.out.println("Наша компания не работает с вашим населённым пунктом.");//
        }

        System.out.println("hw 4.5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                switch (monthNumber) {
                    case 12: System.out.print("Декабрь, это ");
                    break;
                    case 1: System.out.print("Январь, это ");
                    break;
                    case 2: System.out.print("Февраль, это ");
                    break;
                }
                System.out.println("зимний месяц!");
                break;
            case 3:
            case 4:
            case 5:
                switch (monthNumber) {
                    case 3: System.out.print("Март, это ");
                        break;
                    case 4: System.out.print("Апрель, это ");
                        break;
                    case 5: System.out.print("Май, это ");
                        break;
                }
                System.out.println("весенний месяц!");
                break;
            case 6:
            case 7:
            case 8:
                switch (monthNumber) {
                    case 6: System.out.print("Июнь, это ");
                        break;
                    case 7: System.out.print("Июль, это ");
                        break;
                    case 8: System.out.print("Август, это ");
                        break;
                }
                System.out.println("летний месяц!");
                break;
            case 9:
            case 10:
            case 11:
                switch (monthNumber) {
                    case 9: System.out.print("Сентябрь, это ");
                        break;
                    case 10: System.out.print("Октябрь, это ");
                        break;
                    case 11: System.out.print("Февраль, это ");
                        break;
                }
                System.out.println("осенний месяц!");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}
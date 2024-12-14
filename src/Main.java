public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Условный оператор\" \n");

        //Задача 1
        int age = 12;
        System.out.println("Задача 1");
        if (age >=18) {
            System.out.println("Так как возраст человека равен " + age + " то он совершеннолетний\n");
        } else {
            System.out.println("Так как возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать\n");
        }

        //Задача 2
        int outTemp = 0;
        System.out.println("Задача 2");
        if (outTemp < 5) {
            System.out.println("На улице " + outTemp + " градусов, нужно надеть шапку\n");
        } else if (outTemp > 5) {
            System.out.println("На улице " + outTemp + " градусов, можно идти без шапки\n");
        } else {
            System.out.println("На улице ровно " + outTemp + " градусов, возми шапку с собой\n");
        }

        //Задача 3
        int speed = 65;
        System.out.println("Задача 3");
        if (speed <= 60) {
            System.out.println("Так как скорость " + speed + " км/ч, можно ездить спокойно\n");
        } else {
            System.out.println("Так как скорость " + speed + " км/ч, придется заплатить штраф\n");
        }

        //Задача 4
        int age2 = 25;
        boolean kindergartenAge = (age2 >= 2 && age2 <= 6);
        boolean schoolAge = (age2 >= 7 && age2 <= 17);
        boolean studentAge = (age2 >= 18 && age2 <= 24);
        boolean workAge = (age2 >24);
        System.out.println("Задача 4");
        if (kindergartenAge) {
            System.out.println("Возраст человека равен " + age2 + " - ему нужно ходить в садик\n");
        } else if (schoolAge) {
            System.out.println("Возраст человека равен " + age2 + " - ему нужно ходить в школу\n");
        } else if (studentAge) {
            System.out.println("Возраст человека равен " + age2 + " - ему нужно ходить в университет\n");
        } else if (workAge){
            System.out.println("Возраст человека равен " + age2 + " - ему нужно ходить на работу\n");
        } else {
            System.out.println("Возраст человека равен " + age2 + " - ему нужно сидеть дома\n");
        }

        //Задача 5
        int age3 = 20;
        boolean noRideAge = (age3 < 5);
        boolean withAdultRideAge = (age3 >= 5 && age3 < 14);
        System.out.println("Задача 5");
        if (noRideAge) {
            System.out.println("Так как возраст равен " + age3 + " то ребенку нельзя кататься на аттракционе\n");
        } else if (withAdultRideAge) {
            System.out.println("Так как возраст равен " + age3 + " то ребенку можно кататься на аттракционе в сопровождении взрослых\n");
        } else {
            System.out.println("Так как возраст равен " + age3 + " то можно кататься на аттракционе\n");
        }

        //Задача 6
        int passengerNumber = 69;
        System.out.println("Задача 6");
        if (passengerNumber <= 60) {
            System.out.println("В вагоне есть " + (60-passengerNumber+1) + " сидячих мест и 52 стоячих\n");
        } else if (passengerNumber > 60 && passengerNumber <= 102) {
            System.out.println("В вагоне нет сидячих мест, но есть " + (102-passengerNumber+1) + " стоячих\n");
        } else {
            System.out.println("Вагон полностью забит\n");
        }

        //Задача 7
        int one = 5;
        int two = 15;
        int three = 10;
        System.out.println("Задача 7");
        if (one == two || one == three || two == three) {
            System.out.println("Нельзя определить наибольшее число, есть равные!");
        } else if (one > two && one > three) {
            System.out.println("Больше всех число one = " + one + "\n");
        } else if (two > one && two > three) {
            System.out.println("Больше всех число two = " + two + "\n");
        } else {
            System.out.println("Больше всех число three = " + three + "\n");
        }
    }
}
package com.example.a34;

public class DataGenerateRandom {

    private static String genNumber() {
        String digits = "0123456789";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 9; i++)
            result.append(digits.charAt((int) (Math.random() * 10)));
        return result.toString();
    }

    public static String genPhoneNumber() {
        return "+79" + genNumber();
    }


    private static String genString(int length) {
        String alphabetInUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String alphabetInLowerCase = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder result = new StringBuilder();
        result.append(alphabetInUpperCase.charAt((int) (Math.random() * 26)));
        for (int i = 0; i < length - 1; i++)
            result.append(alphabetInLowerCase.charAt((int) (Math.random() * 26)));
        return result.toString();
    }

    public static String genSurname() {
        return genString(15);
    }
    public static String genName() {
        return genString(12);
    }
    public static String genPatronymic() {
        return genString(15);
    }

//    public static Data newData() {
//        return new Data(
//                genSurname(),
//                genName(),
//                genPatronymic(),
//                genPhoneNumber()
//                );
//    }
}

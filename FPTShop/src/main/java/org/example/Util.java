package org.example;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Random;

public class Util {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }


    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String generateId(int size){
        String number = "1234567890";
        String character = "~!@#$%^&*()_+";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String allCharacter = number + character + alphabet + alphabet.toUpperCase();


        //char[] ch = allCharacter.toCharArray();
        char[] ch = number.toCharArray();

        String id = "SP" + NanoIdUtils.randomNanoId(generator, ch, size);

        return id;
    }
    public static void mainMenu(){
        System.out.println("1 - Xem tất cả sản phẩm ");
        System.out.println("2 - Xem sản phẩm theo danh mục");
        System.out.println("3 - Xem sản phẩm theo hãng ");
        System.out.println("4 - Xem sản phẩm theo mức giá");
        System.out.println("5 - Tìm sản phẩm theo tên");
        System.out.println("6 - Xem tất cả các hãng");
        System.out.println("0 - Thoát chương trình");

    }
    public static void subMenuCategory(){
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");

    }
    public static void subMenuBrand(){
        System.out.println("1 - Samsung");
        System.out.println("2 - Apple");
        System.out.println("3 - HP");
    }
    public static void subMenuPrice(){
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - 4 triệu");
        System.out.println("3 - Từ 4 - 7 triệu");
        System.out.println("4 - Từ 7 - 13 triệu");
        System.out.println("5 - Trên 13 triệu");
    }

}
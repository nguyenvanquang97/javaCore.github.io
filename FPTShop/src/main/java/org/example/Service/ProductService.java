package org.example.Service;

import org.example.model.Category;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductService {

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("SamSung Galaxy Note 10",
                "Điện thoại thông minh", 2500000,
                20,10,"Samsung",
                new Category[]{Category.PHONE}));
        list.add(new Product("SamSung Galaxy Note 8",
                "Điện thoại thông minh", 100000,
                15,15,"Samsung",
                new Category[]{Category.PHONE}));
        list.add(new Product("Iphone 13 pro max",
                "Điện thoại thông minh", 5000000,
                15,15,"Apple",
                new Category[]{Category.PHONE,Category.APPLE}));
        list.add(new Product("Ipad 3",
                "Máy tính bảng", 9000000,
                18,12,"Apple",
                new Category[]{Category.APPLE}));
        list.add(new Product("Macbook E",
                "Máy tính xách tay", 30000000,
                15,15,"Apple",
                new Category[]{Category.LAPTOP,Category.APPLE}));
        list.add(new Product("HP p300",
                "Máy tính xách tay", 15000000,
                13,1,"HP",
                new Category[]{Category.LAPTOP,}));
        list.add(new Product("Airpod",
                "Tai nghe", 1999999,
                15,15,"Apple",
                new Category[]{Category.ACCESSORIES,Category.APPLE}));

        return list;
    }

    public void show(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p.getId() + " - " + p.getName()+" - "
                 +p.getDescription() +" - "+p.getPrice()+" - "+p.getAmount()+" - " +
                    p.getAmountSale()+ " - "+p.getBrand()+" - " + printCategory(p.getCategories()));
        }
    }

    public String printCategory(Category[] categories){
        for (Category c : categories){
            return c.getValue();
        }

        return null;
    }
    public void showListByCategory(ArrayList<Product> list,Category fcategory){
        for (Product p:list){

            if (Arrays.toString(p.getCategories()).contains(fcategory.toString())){
                System.out.println(p.getId() + " - " + p.getName()+" - "
                        +p.getDescription() +" - "+p.getPrice()+" - "+p.getAmount()+" - " +
                        p.getAmountSale()+ " - "+p.getBrand()+" - " + printCategory(p.getCategories()));


            }
        }
    }
    public void showListByBrand(ArrayList<Product> list,String fBrand){
        int count =0;
        for (Product p :list){
            if (p.getBrand().equals(fBrand)) {
                count++;
            }
        }
        if (count==0){
            System.out.println("Không còn sản phẩm của "+fBrand);
        }
       else {
            System.out.println("Số sản phẩm của "+fBrand+" là: "+count);
        }
        for (Product p :list){
            if (p.getBrand().equals(fBrand)){
                System.out.println(p.getId() + " - " + p.getName()+" - "
                        +p.getDescription() +" - "+p.getPrice()+" - "+p.getAmount()+" - " +
                        p.getAmountSale()+ " - "+p.getBrand()+" - " + printCategory(p.getCategories()));
            }
        }

    }
    public void showListByPrice(ArrayList<Product> list,long min,long max){
        for (Product p: list){
            if (p.getPrice()>=min&&p.getPrice()<=max){
                System.out.println(p.getId() + " - " + p.getName()+" - "
                        +p.getDescription() +" - "+p.getPrice()+" - "+p.getAmount()+" - " +
                        p.getAmountSale()+ " - "+p.getBrand()+" - " + printCategory(p.getCategories()));
            }
        }
    }

    public void findProductByName(ArrayList<Product> list,String fName){
        int count =0;
        for (Product p: list){
            if (p.getName().toLowerCase().contains(fName.toLowerCase())){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không tìm thấy sản phẩm");
        }
        else {
            System.out.println("Tìm thấy "+count+" sản phẩm:");
        }
        for (Product p: list){
            if (p.getName().toLowerCase().contains(fName.toLowerCase())){
                System.out.println(p.getId() + " - " + p.getName()+" - "
                        +p.getDescription() +" - "+p.getPrice()+" - "+p.getAmount()+" - " +
                        p.getAmountSale()+ " - "+p.getBrand()+" - " + printCategory(p.getCategories()));
            }
        }
    }
    public void showAllBrand(ArrayList<Product> list){
        Map<String, Integer> map = new HashMap<>();
        for(Product p : list){
                if(map.containsKey(p.getBrand())){
                    map.put(p.getBrand(), map.get(p.getBrand()) + 1);
                }else {
                    map.put(p.getBrand(), 1);
                }
            }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
    }

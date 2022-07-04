package org.example;

import org.example.model.Category;
import org.example.model.Product;
import org.example.Service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc =new Scanner(System.in);
        ProductService service = new ProductService();
        ArrayList<Product> list = service.getAllProduct();
        boolean flag = true;

        while (flag){
            while (true){
                Util.mainMenu();
                try {
                    System.out.println("Lựa chọn của bạn là: ");
                    int choose= Integer.parseInt(sc.nextLine());
                    switch (choose){
                        case 1:
                            service.show(list);
                            break;
                        case 2:
                            Util.subMenuCategory();
                            System.out.println("Lựa chọn của bạn là:");
                            int chooseCategory=Integer.parseInt(sc.nextLine());
                            switch (chooseCategory){
                                case 1:
                                    service.showListByCategory(list, Category.PHONE);
                                    break;
                                case 2:
                                    service.showListByCategory(list,Category.LAPTOP);
                                    break;
                                case 3:
                                    service.showListByCategory(list,Category.APPLE);
                                    break;
                                case 4:
                                    service.showListByCategory(list,Category.ACCESSORIES);
                                    break;
                                default:
                                    System.out.println("Không có lựa chọn này");
                            }
                            break;
                        case 3:
                            Util.subMenuBrand();
                            System.out.println("Lựa chọn của bạn là:");
                            int chooseBrand=Integer.parseInt(sc.nextLine());
                            switch (chooseBrand){
                                case 1:
                                    service.showListByBrand(list,"Samsung");
                                    break;
                                case 2:
                                    service.showListByBrand(list,"Apple");
                                    break;
                                case 3:
                                    service.showListByBrand(list,"HP");
                                    break;
                                default:
                                    System.out.println("Không có lựa chọn này");
                            }
                            break;
                        case 4:
                            Util.subMenuPrice();
                            System.out.println("Lựa chọn của bạn là:");
                            int choosePrice=Integer.parseInt(sc.nextLine());
                            switch (choosePrice){
                                case 1:
                                    service.showListByPrice(list,0,2000000);
                                    break;
                                case 2:
                                    service.showListByPrice(list,2000000,4000000);
                                    break;
                                case 3:
                                    service.showListByPrice(list,4000000,7000000);
                                    break;
                                case 4:
                                    service.showListByPrice(list,7000000,13000000);
                                    break;
                                case 5:
                                    service.showListByPrice(list,13000000,Long.MAX_VALUE);
                                    break;
                                default:
                                    System.out.println("Không có lựa chọn này");
                            }
                            break;
                        case 5:
                            System.out.println("Nhập tên sản phẩm cần tìm:");
                            String fName =sc.nextLine();
                            service.findProductByName(list,fName);
                            break;
                        case 6:
                            service.showAllBrand(list);
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                    flag=false;

                }catch (NumberFormatException e){
                    System.out.println("Nhập sai kiểu dữ liệu!");
                    System.out.println("Vui lòng nhập lại");
                }

            }
        }

    }
}
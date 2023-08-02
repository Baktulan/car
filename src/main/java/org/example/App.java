package org.example;

import org.example.config.Config;
import org.example.enums.Color;
import org.example.model.Car;
import org.example.service.serviceImpl.CarServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Config.getConnection();
        CarServiceImpl carService = new CarServiceImpl();

        Scanner scanner = new Scanner(System.in);
        int num;
        while(true){
            System.out.println("""
                     1 Create enum color
                     2 Create table car
                     3 Save car
                     4 Get by id car
                     5 Update car
                     6 Delete by id
                     7 Get cars by search
                     8 Get Cars by price range
                    """);
            num= scanner.nextInt();
            switch (num){
                case 1:{
                    carService.createEnumColor();
                    break;
                }
                case 2:{
                    carService.createTableCar();
                    break;
                }
                case 3:{
                    carService.saveCar(new Car("Honda","Accord",2020, Color.BLUE,9000));
                    break;
                }
                case 4:{
                    System.out.println(carService.getCarById(3L));
                    break;
                }
                case 5:{
                    System.out.println(carService.updateCar(1L, new Car("Toyota", "RAV4", 2018, Color.BROWN, 10000)));
                }
                case 6:{
                    System.out.println(carService.deleteCar(4L));
                }
                case 7:{
                    System.out.println(carService.getCarsBySearch("Toyota", "RAV4"));
                    break;
                }
                case 8:{
                    System.out.println(carService.getCarsByPriceRange(3000, 10000));
                }

            }
        }
    }
}

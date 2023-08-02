package org.example.service;

import org.example.model.Car;

import java.util.List;

public interface CarService {
    void createTableCar();

    void createEnumColor();

    void saveCar(Car car);

    Car getCarById(Long id);

    String updateCar(Long id, Car car);

    String deleteCar(Long id);

    List<Car> getCarsBySearch(String brand, String model);

    List<Car> getCarsByPriceRange(int min, int max);

}

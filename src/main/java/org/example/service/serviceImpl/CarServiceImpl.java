package org.example.service.serviceImpl;

import org.example.dao.CarDao;
import org.example.dao.CarDaoImpl;
import org.example.model.Car;
import org.example.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public void createTableCar() {
        carDao.createTableCar();
    }

    @Override
    public void createEnumColor() {
        carDao.createEnumColor();
    }

    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public Car getCarById(Long id) {
        return carDao.getCarById(id);
    }

    @Override
    public String updateCar(Long id, Car car) {
        return carDao.updateCar(id,car);
    }

    @Override
    public String deleteCar(Long id) {
        return carDao.deleteCar(id);
    }

    @Override
    public List<Car> getCarsBySearch(String brand, String model) {
        return carDao.getCarsBySearch(brand,model);
    }

    @Override
    public List<Car> getCarsByPriceRange(int min, int max) {
        return carDao.getCarsByPriceRange(min,max);
    }
}

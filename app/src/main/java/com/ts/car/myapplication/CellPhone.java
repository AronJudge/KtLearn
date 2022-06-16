package com.ts.car.myapplication;

import java.util.Objects;

/**
 * ClassName CellPhone
 * Description TODO
 *
 * @Author ts
 * @Date 2022/6/15 下午6:16
 * @Version 1.0
 **/
public class CellPhone {
    String brand;
    double price;

    public CellPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellPhone cellPhone = (CellPhone) o;
        return Double.compare(cellPhone.price, price) == 0 && Objects.equals(brand, cellPhone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

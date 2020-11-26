package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                products[index] = products[products.length - 2 + 1];
                products[products.length - 1] = null;
                return products;
            }
        }
        return products;
    }
}


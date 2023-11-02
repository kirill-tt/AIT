package homework.supermarket;

public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barcode, double price) {
        // TODO update product price
        // найти продукт в массиве по его баркоду и обновить ему цену
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i].setPrice(price);
                return products[i];
            }
        }
        return null;
    }

    public boolean removeProduct(long barCode) {
        // TODO remove product
        // найти продукт в массиве по его баркоду и удалить элемент массива:
        // пусть удаляемый продукт стоит на i-м индексе, тогда все элементы массива надо сдвинуть с места i + 1 на
        // 1 позицию влево, последний элемент присвоить null, длину массива уменьшить на 1.

        {
            for (int i = 0; i < quantity; i++) {  // Перебираем все продукты в магазине
                if (products[i] != null && products[i].getBarcode() == barCode) {  // Если найден продукт с указанным баркодом
                    for (int j = i; j < quantity - 1; j++) {  // Сдвигаем оставшиеся продукты на одну позицию влево
                        products[j] = products[j + 1];// Сдвигаем продукт влево, заменяя текущий продукт следующим в списке
                    }
                    products[quantity - 1] = null;  // Удаляем последний продукт
                    quantity--;  // Уменьшаем количество продуктов в магазине
                    return true;  // Возвращаем true, чтобы показать, что продукт удален успешно
                }
            }
            return false;  // Возвращаем false, так как продукт с указанным баркодом не был найден
        }
    }
    //Mетод removeProduct1 без сдвига элементов массива
    public boolean removeProduct1(long barCode) {
        for (int i = 0; i < quantity; i++) {// Проходим по всем продуктам в магазине
            if (products[i] != null && products[i].getBarcode() == barCode) {// Проверяем, не является ли текущий продукт null и его баркод совпадает с указанным
                products[i] = null;  // Если нашли продукт, помечаем его как удаленный (устанавливаем null)
                return true;// Возвращаем true, чтобы показать, что продукт успешно удален
            }
        }
        return false;  // Если продукт с указанным баркодом не был найден, возвращаем false
    }


    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }

}
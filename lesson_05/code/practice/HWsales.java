package practice;
//Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class HWsales {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        // Where a/b is the price of the product

        int aSale = 10;
        int bSale = 15;
        // Where aSale/bSale is the percentage of discount on the product

        int aBay = 8;
        int bBay = 6;
        // Where aBay/bBay is quantity of product purchased

        int extraDiscount = 5;
        // Where is special discount on goods when purchasing more than 100 euros

        double aTotalbay = a*aBay;
        double bTotalbay = b*bBay;
        double dTotal = (aTotalbay-aTotalbay*aSale/100)+(bTotalbay-bTotalbay*bSale/100);

        if (dTotal > 100){
            dTotal -= dTotal*extraDiscount/100;
            System.out.println("Final price with all discount" +  dTotal);
        }
        else {
            System.out.println("The amount with all discounts is less than 100 euros, there are no extra discounts 5%, the final price" + dTotal);

        }


    }
}

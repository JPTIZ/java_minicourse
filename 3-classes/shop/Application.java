import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0].name = "Pão";
        products[0].price = 50;

        products[1].name = "Leite";
        products[1].price = 280;

        products[2].name = "Suco";
        products[2].price = 400;

        products[3].name = "Pizza";
        products[3].price = 899;

        int[] amounts = new int[4];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            System.out.printf("Digite a quantidade de %s",
                              products[i].name);
            amounts[i] = reader.nextInt();
        }

        int total = 0;
        for (int i = 0; i < products.length; i++) {
            int totalProduct = amounts[i] * products[i].price;
            System.out.printf("Total gasto com %s: R$%d\n",
                              products[i].name,
                              totalProduct);
            total += totalProduct;
        }

        System.out.printf("Total da compra: R$%d\n", total);
    }
}




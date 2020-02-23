import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Chocolate[] chocolates = new Chocolate[3];
        ChocolateArray chocoArray = new ChocolateArray();

        chocoArray.addChocolate(chocolates);
        chocoArray.showChocolatesInArray(chocolates);
    }
}
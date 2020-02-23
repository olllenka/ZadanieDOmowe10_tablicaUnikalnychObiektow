import java.util.Scanner;

public class ChocolateArray {
    Scanner sc = new Scanner(System.in);

    public void addChocolate(Chocolate[] chocolates) {
        for(int i= 0; i<chocolates.length; i++){
            System.out.println("Podaj dane " + (i+1) + " czekolady");
            Chocolate choco;
            do{
                choco = createChocolate();
                if(chocolateExistsInArray(choco, chocolates))
                    System.out.println("Podana czekolada istnieje w tablicy, podaj inna");
            }while(chocolateExistsInArray(choco, chocolates));
            chocolates[i]=choco;
        }
    }

    private Chocolate createChocolate() {
        Chocolate choco = new Chocolate();
        System.out.println("Nazwa czekolady");
        choco.setName(sc.nextLine());
        System.out.println("Masa tabliczki");
        choco.setWeight(sc.nextInt());
        sc.nextLine();
        return choco;
    }

    private boolean chocolateExistsInArray(Chocolate choco, Chocolate[] chocolates) {
        boolean isEqual=false;
        for(int i=0; i<chocolates.length; i++){
            if(choco.equals(chocolates[i]))
                isEqual=true;
        }
        return isEqual;
    }

    public void showChocolatesInArray(Chocolate[] chocolates){
        for(int i=0; i<chocolates.length; i++) {
            System.out.println(chocolates[i]);
        }
    }
}

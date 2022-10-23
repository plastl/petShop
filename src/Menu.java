import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    
    Cat [] arrayCats = new Cat[5];
    int index = 0;

    Dog [] arrayDogs = new Dog[5];
    int index1 = 0;

    public void shopCat(){
        System.out.println("Введите имя кота: ");
        String namecat = scanner.nextLine();

        System.out.println("Введите цвет кота: ");
        String colorcat = scanner.nextLine();

        Cat cat = new Cat(namecat, colorcat);
        
        arrayCats[index] = cat;
        index ++;
        
        cat.info();
    }

    public void shopDog(){
        System.out.println("Введите имя пса: ");
        String namedog = scanner.nextLine();

        System.out.println("Введите цвет пса: ");
        String colordog = scanner.nextLine();

        Dog dog = new Dog(namedog, colordog);

        arrayDogs[index1] = dog;
        index1 ++;
        
        dog.info();
    }

    public void listCat(){
        for (int i = 0; i < arrayCats.length; i++) {
            if (arrayCats[i] != null){
                System.out.println(arrayCats[i].name);
            }
        }
    }
    
    public void listDog(){
        for (int i = 0; i < arrayDogs.length; i++) {
            if (arrayDogs[i] != null){
                System.out.println(arrayDogs[i].name);
            }
        }
    }

    public void listAnimals(){
        listCat();
        listDog();
    }


    public void menuShop(){
        System.out.println("1 купить кота");
        System.out.println("2 купить собаку");
        System.out.println("3 список котов");
        System.out.println("4 список собак");
        System.out.println("5 список всех животных");

        String message = scanner.nextLine();

        switch (message){
            case "1" -> {shopCat();menuShop();}
            case "2" -> {shopDog();menuShop();}
            case "3" -> {listCat();menuShop();}
            case "4" -> {listDog();menuShop();}
            case "5" -> {listAnimals();menuShop();}
            default -> {System.out.println("нету пункта меню");menuShop();}
        }

    }

}

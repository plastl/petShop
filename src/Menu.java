import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    
    Cat [] arrayCats = new Cat[5];
    int index = 0;

    Dog [] arrayDogs = new Dog[5];
    int index1 = 0;

    public void shopCat(){
        if (index<arrayCats.length) {
            System.out.println("Введите имя кота: ");
            String namecat = scanner.nextLine();
            do {
                if (namecat.length()==0){
                    System.out.println("Введите еще раз имя кота: ");
                    namecat = scanner.nextLine();
                }
            }while (namecat.length()==0);

            System.out.println("Введите цвет кота: ");
            String colorcat = scanner.nextLine();
            do {
                if (colorcat.length()==0){
                    System.out.println("Введите еще раз цвет кота: ");
                    colorcat = scanner.nextLine();
                }
            }while (colorcat.length()==0);

            Cat cat = new Cat(namecat, colorcat);
            arrayCats[index] = cat;
            index++;
            cat.info();
        }else {
            System.out.println("Вы превысили лимит покупок!\n");
        }
    }

    public void shopDog(){
        if (index1< arrayDogs.length) {
            System.out.println("Введите имя пса: ");
            String namedog = scanner.nextLine();
            do{
                if (namedog.length()==0){
                    System.out.println("Введите еще раз имя пса: ");
                    namedog = scanner.nextLine();
                }
            }while (namedog.length()==0);

            System.out.println("Введите цвет пса: ");
            String colordog = scanner.nextLine();
            do {
                if (colordog.length()==0){
                    System.out.println("Введите еще раз цвет пса: ");
                    colordog = scanner.nextLine();
                }
            }while (colordog.length()==0);

            Dog dog = new Dog(namedog, colordog);
            arrayDogs[index1] = dog;
            index1++;
            dog.info();
        }else {
            System.out.println("Вы превысили лимит покупок!\n");
        }
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

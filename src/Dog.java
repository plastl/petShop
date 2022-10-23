public class Dog {
    String name;
    String color;

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void info(){
        System.out.println("Вы купили: \nИмя: "+name+"\nЦвет: "+color+"\n");
    }
}

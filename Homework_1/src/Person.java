public class Person {
    String name;
    int years;
    int growth;
    int weight;

    private int money;

    public Person(String name, int years, int growth, int weight, int money) {
        this.name = name;
        this.years = years;
        this.growth = growth;
        this.weight = weight;
        this.money = money;
    }

    public Person() {
    }

    public void PersonInfo() {
        System.out.println("Имя " + name);
        System.out.println("Возраст " + years);
        System.out.println("Рост " + growth);
    }

    public void GoWork() {
        if (years > 70 || years < 18) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю");
        }
    }
    public int getMoney(int money){
        return money;
    }
}

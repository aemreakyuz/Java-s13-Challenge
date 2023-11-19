package employeeApp.enums;

public enum Plan {
    BASIC("BASIC", 3000),
    MEDIUM("MEDIUM", 6000),
    ADVANCE("ADVANCE", 10000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

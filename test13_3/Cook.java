package test13_3;

// Cook クラスを定義し、Person インターフェースを実装
class Cook implements Person {
    private String name;
    private String position;
    private String specialty;

    public Cook(String name, String position, String specialty) {
        this.name = name;
        this.position = position;
        this.specialty = specialty;
    }

    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + position);
        System.out.println("得意料理: " + specialty);
    }
}

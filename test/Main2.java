package test;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("年齢：" + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + getName());
        System.out.println("職業：教員");
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String speciality;

    public Cook(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + getName());
        System.out.println("職業：シェフ");
        System.out.println("得意料理：" + speciality);
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Teacher クラスのインスタンスを生成
        Teacher teacher = new Teacher("近藤勇", 40, "Go 言語");

        // Cook クラスのインスタンスを生成
        Cook cook = new Cook("沖田総司", 30, "オムライス");

        // 各インスタンスの情報を表示
        System.out.println("Teacher's Information:");
        teacher.introduce();
        System.out.println();

        System.out.println("Cook's Information:");
        cook.introduce();
    }
}


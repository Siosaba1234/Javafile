package test13_3;

// Teacher クラスを定義し、Person インターフェースを実装
class Teacher implements Person {
    private String name;
    private String position;
    private String subject;

    public Teacher(String name, String position, String subject) {
        this.name = name;
        this.position = position;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("氏名: " + name + "\n職種: " + position + "\n担当科目: " + subject);
    }
}
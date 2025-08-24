package OOPSinJAVA;

public class studentclass {
    public static class Student{
        String name;
        int rno;
        double percent;

    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Aryan";
        x.rno = 12;
        x.percent = 99.34;
        System.out.println(x.name + " Maurya");
        System.out.println(x.rno);
        System.out.println(x.percent + (-10));
    }
}

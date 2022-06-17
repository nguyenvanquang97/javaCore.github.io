public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("Hoa",18,"Hà Nội");
//        System.out.println(p1.name+" - "+p1.adress+" - "+p1.age);
        Person p1 = new Person();
        p1.setName("hoa");
        p1.setAge(18);
        p1.setAdress("Hà Nội");
        System.out.println(p1.getName()+" - "+p1.getAdress()+" - "+p1.getAge());
    }

}

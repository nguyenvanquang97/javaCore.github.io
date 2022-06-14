public class Main {
    public static void main(String[] args) {
        person hoa = new person();
        hoa.name = "Hoa";
        hoa.age = 20;
        hoa.adress= "Hà Nội";
        System.out.println(hoa.name+" - "+ hoa.age+ " - "+ hoa.adress);
        System.out.println("-----------------");
        dog object1 = new dog();
        object1.breed = "Neapolitan Mastiff";
        object1.size="Large";
        object1.color="black";
        object1.age = 5;
        System.out.println(object1.breed+" "+object1.size+" "+object1.color+" "+object1.age);
        bookService service = new bookService();
        Book newBook = service.addBook();
    }
}

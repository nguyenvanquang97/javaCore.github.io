public class exercise2 {
    public static void main(String[] args) {
        //câu 2
        String chuoi = "You only live once, but if you do it right, once is enough";
        char kyTu = 'o';
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {

            if (chuoi.charAt(i) == kyTu) {
                System.out.println("index của \"o\" là: "+chuoi.indexOf("o",i));
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);


    }
}

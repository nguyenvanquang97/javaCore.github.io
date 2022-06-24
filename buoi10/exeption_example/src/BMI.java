import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

    }
    public static double bmiCalculator(double weight,double height){
        return weight/(height*height);
    }
    public static double input(){
        // xảy ra trường hợp sai dữ liệu
        //dữ liệu nhập vào nhỏ hơn hoặc bằng không
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            try {
                System.out.println("Nhập vào cân nặng: ");
                double weight = sc.nextDouble();
                System.out.println("Nhập vào chiều cao: ");
                double height =sc.nextDouble();
               double bmi= bmiCalculator(weight,height);

                if(weight <= 0||height<=0) throw new CustomException("Chiều cao và cân nặng phải lớn hơn không");
                flag =false;
            }catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }


        return bmi;
    }
}

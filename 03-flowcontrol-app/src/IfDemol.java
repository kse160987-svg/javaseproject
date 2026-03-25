public class IfDemol {
    public static void main(String[] args) {
        double t = 38.9;
        if (t>37.0)
        {
            System.out.println("这个人的温度异常，赶紧把它带走");
        }
        double money =99;
        if (money>90)
        {
            System.out.println("发红包");
        }
        else
        {
            System.out.println("余额不足");
        }
        int sorce =60;
        if (sorce>=90&&sorce<=100)
        {
            System.out.println("A");
        } else if (sorce>=80&&sorce<=90) {
            System.out.println("B");

        }
        else if (sorce>=60&&sorce<80) {
            System.out.println("C");
        }
        else if (sorce>=0&&sorce<60) {
            System.out.println("D");
        }



    }
}

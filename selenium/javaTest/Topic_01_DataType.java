package javaTest;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Topic_01_DataType {
    // Kiểu dữ liệu nguyên thủy (Primitive Type)
    //char
        //ký tự
            char c ='K'; //1 ký tự trong dấu nháy đơn

    //số nguyên: số học sinh, sinh viên, nhân viên
        //byte: 256 số -128 to 127
            byte bNumber = 127;
        //short -32767 to 32767
            short sNumber = 32767;
        //int
            int iNumber = 676777;
        //long
            long lNumber = 32334455;

    //số thực: điểm số, lương (có phần thập phân)
        //float
            float fNumber = 9.57f;
        //double
            double dNumber = 9.99d;

    //logic giới tính, câu trả lời
        //boolean
            boolean sex = true;


    //kiểu dữ liệu tham chiếu (reference type)

    //chuỗi
        //string
            String fullName;

    //Array
        String[] students = {"Pham Huong",
                             "Le Huong",
                             "Phuong Linh"};

    //Collection
        //List/Set/Queue
            List<String> studentAddress = new ArrayList<String>();
    //Class/object
//            FirefoxDriver ffDriver = new FirefoxDriver();

public static void main(String[] args) {
        int i = 10;
        int x = i;

        i = 100;
        System.out.println(x);
        System.out.println(i);

        Topic_01_DataType topic_01 = new Topic_01_DataType();
        topic_01.fullName = "Huong Pham";

        Topic_01_DataType topic_02 = topic_01;
        System.out.println(topic_01.fullName);
        System.out.println(topic_02.fullName);

        topic_01.fullName = "Le Anh Tuyet";
        System.out.println(topic_01.fullName);
        System.out.println(topic_02.fullName);

    }
}

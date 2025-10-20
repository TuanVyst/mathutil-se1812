package com.giaolang.mathutil.core;

public class MathUtil {
    // class này chứa các hàm tiện ích dùng cho mọi nơi
    // hàm tiện ích dùng cho mọi nơi nghĩa là nó ko lưu lại kết quả xử lí của nó bên trong,
    // vậy nó sẽ đc thiết kế là static method

    // hàm tính n!
    // quy ước 0!= 1, 1!=1, 2!= 1*2
    // 20! vừa đủ kiểu dữ liệu long, 18 con số 0; 21! long chứa ko nổi
    // ko có âm giai thừa
    // bài này giai thừa chỉ tính từ 0...20
    // 0...20 -> valid boundary validated boundary -> vùng giá trị hợp lê
    // 0,20 -> boundary value - biên giới của tập giá trị
    // xích qua 1 xíu là sang vùng invalid value

    public static long getFactorial (int n){

        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20") ;
        }
        long result = 1;
        for(int i= 1; i <=n;i++){
            result *=i; // thuật toán heo đất, ốc bu nhồi thịt
        }
        return result;
    }
}

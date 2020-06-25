package DS.DSQueue.demerging_Queue.src;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        String[][] danhsachHS = {
                {"Lê Trung Hiếu","nam"},
                {"Võ Thanh Tú","nu"},
                {"Nguyễn Thị Thảo","nu"},
                {"Dương Thành Tiếp","nam"},
                {"Đặng Thu Thảo","nu"},
                {"Nguyễn Tường San","nu"},
                {"Phạm Quốc Huy","nam"},
                {"Nguyễn Hồng Tình","nam"},
                {"Nguyễn Thị Hiền","nu"},
                {"Trần Thị Hồng Thắm","nu"}
        };
        Queue<String> nam = new LinkedList<>();
        Queue<String> nu = new LinkedList<>();
        for (int i=0;i<danhsachHS.length;i++) {
            if (danhsachHS[i][1]=="nam") {
                nam.add(danhsachHS[i][0]);
            } else {
                nu.add(danhsachHS[i][0]);
            }
        }
        while (!nu.isEmpty()) {
            System.out.println(nu.poll()+" nữ");
        }
        while (!nam.isEmpty()) {
            System.out.println(nam.poll()+" nam");
        }
    }
}

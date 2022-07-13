package org.example.Service;

import org.example.Model.Serial;
import org.example.Model.Status;

import java.time.LocalDate;
import java.util.ArrayList;

public class SerialService {

    public ArrayList<Serial> getAllSerial() {
        ArrayList<Serial> arrSerial = new ArrayList<>();
        arrSerial.add(new Serial("Thương Ngày Nắng Về", "Phim truyền hình",
                new String[]{"Tình Cảm","Drama"}, LocalDate.of(2022, 4, 17),
               35000, 40, Status.UNFINISHED));
        arrSerial.add(new Serial("Chồng Cũ,Vợ Cũ,Người Yêu Cũ", "Phim truyền hình",
                new String[]{"Tình Cảm","Drama"}, LocalDate.of(2022, 4, 17),
                25000, 40,Status.UNFINISHED));
        arrSerial.add(new Serial("Nhà Trọ Balanha", "Phim truyền hình",
                new String[]{"Tình Cảm","Hài"}, LocalDate.of(2019, 4, 17),
               20000, 40,Status.COMPLETE));
        return arrSerial;
    }
    public void completeSerial(ArrayList<Serial> serialArrayList){
        System.out.println("Danh sách các Serial đã hoàn thành:");
        serialArrayList.stream().filter(i->i.getStatus().equals(Status.COMPLETE)).
                forEach(i-> System.out.println(i));
    }
}

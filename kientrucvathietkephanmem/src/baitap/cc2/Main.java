package baitap.cc2;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv =new QLSV();
        qlsv.them(new sinhvien("nghia","16/7/2003",7.2f));
        qlsv.them(new sinhvien("nam","16/7/2003",6));
        qlsv.setsosanh(new sosanhtheodiem()).sapxep();
        qlsv.inDS();

    }
}

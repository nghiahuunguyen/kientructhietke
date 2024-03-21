package baitap.a5;

import java.util.ArrayList;
import java.util.List;

public class book {
    String tuade;
    int sotrang;
    String tacgia;
    List<String> danhsach;

    public book(Builder builder) {
        this.tuade = builder.tuade;
        this.sotrang = builder.sotrang;
        this.tacgia = builder.tacgia;
        this.danhsach = builder.danhsachs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("tựa đề: ").append(tuade).append("\n")
                .append("tác giả: ").append(tacgia).append("\n")
                .append("số trang: ").append(sotrang).append("\n")
                .append("các chương: \n");
        int i=1;
        for(String c:danhsach)
            builder.append(i++).append(". ").append(c).append("\n");
        return builder.toString();
    }

    public static class Builder {
        private String tuade;
        private int sotrang;
        private String tacgia;
        private List<String> danhsachs = new ArrayList<>();
        public Builder(){
            this.danhsachs=new ArrayList<>();
        }
        public Builder add(String danhsach){
            danhsachs.add(danhsach);
            return this;
        }

        public book build() {
            return new book(this);
        }
        public Builder setTuade(String tuade) {
            this.tuade = tuade;
            return this;
        }

        public Builder setSotrang(int sotrang) {
            this.sotrang = sotrang;
            return this;
        }

        public Builder setTacgia(String tacgia) {
            this.tacgia = tacgia;
            return this;
        }

        public Builder setDanhsach(List<String> danhsach) {
            this.danhsachs = danhsach;
            return this;
        }
    }
}
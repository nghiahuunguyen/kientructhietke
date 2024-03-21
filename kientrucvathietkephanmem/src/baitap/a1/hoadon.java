package baitap.a1;

import java.util.ArrayList;
import java.util.List;

public class hoadon {
    private hoadonhedar hoadonhedar;
    private List<CTHD> list;

    public hoadon(hoadonhedar hoadonhedar, List<CTHD> list) {
        this.hoadonhedar = hoadonhedar;
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(hoadonhedar.toString());
        builder.append("chi tiết hóa đơn");
        for(CTHD c:list)
            builder.append("\n")
                    .append(c.toString());
        return builder.toString();
    }

    public static class Builder {
        private hoadonhedar hoadonhedar;
        private List<CTHD> list;

        public Builder() {
            this.list = new ArrayList<>();
        }

        public Builder setHoadonhedar(hoadonhedar hoadonhedar) {
            this.hoadonhedar = hoadonhedar;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            list.add(cthd);
            return this;
        }

        public hoadon build() {
            return new hoadon(hoadonhedar, list);
        }
    }
}
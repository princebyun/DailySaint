package ToyProject.DailySaint.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationVO {

    private int seq;
    private int sSeq;
    private int rSeq;
    private String year;
    private String start;
    private String end;

}

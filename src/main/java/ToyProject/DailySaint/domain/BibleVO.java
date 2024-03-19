package ToyProject.DailySaint.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BibleVO {

    private int seq;
    private int cate;
    private int book;
    private int chapter;
    private int paragraph;
    private  String sentence;
    private  String testament;
    private  String longLabel;
    private  String shortLabel;

}

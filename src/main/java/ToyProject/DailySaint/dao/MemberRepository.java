package ToyProject.DailySaint.dao;

import ToyProject.DailySaint.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MemberRepository {
        List<MemberVO> getList();
}

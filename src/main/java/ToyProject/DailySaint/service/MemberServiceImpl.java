package ToyProject.DailySaint.service;

import ToyProject.DailySaint.dao.MemberRepository;
import ToyProject.DailySaint.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<MemberVO> getList() {
        return memberRepository.getList();
    }
}

package ToyProject.DailySaint.controller;

import ToyProject.DailySaint.domain.MemberVO;
import ToyProject.DailySaint.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
        @Autowired
        MemberService memberService;

        @GetMapping("/member/list")
        public List<MemberVO> getList(){
            return memberService.getList();
        }

}

package hyotaime.rankingsystem.controller;

import hyotaime.rankingsystem.domain.Member;
import hyotaime.rankingsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String home(Model model) {
        // 서비스 계층의 findMembers 메서드를 이용해 전체 랭킹 정보를 가져옴
        List<Member> member = memberService.findMembers();
        member.sort(Comparator.comparing(Member::getPoints).reversed());
        model.addAttribute("member", member);
        return "home";
    }
}

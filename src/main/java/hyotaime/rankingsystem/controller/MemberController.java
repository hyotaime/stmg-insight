package hyotaime.rankingsystem.controller;

import hyotaime.rankingsystem.domain.Member;
import hyotaime.rankingsystem.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/findmember")
    public String createForm() {
        return "findMember";
    }
    @GetMapping("/findmember/{name}")
    public ModelAndView findMember(@ModelAttribute("name") String name) {
        Optional<Member> member = memberService.findByName(name);
        ModelAndView mav = new ModelAndView();
        if (member.isPresent()) {
            mav.addObject("member", member.get());
            mav.setViewName("memberStat");
        } else {
            mav.setViewName("member-not-found");
        }
        return mav;
    }

}

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

    @GetMapping("/findmember/name")
    public String createFormByName() {
        return "findMemberByName";
    }
    @GetMapping("/findmember/uid")
    public String createFormByUid() {
        return "findMemberByUid";
    }
    @GetMapping("/findmember/name/{name}")
    public ModelAndView findMemberByName(@ModelAttribute("name") String name) {
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
    @GetMapping("/findmember/uid/{uid}")
    public ModelAndView findMemberByUid(@ModelAttribute("uid") String uid) {
        Optional<Member> member = memberService.findByUid(uid);
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

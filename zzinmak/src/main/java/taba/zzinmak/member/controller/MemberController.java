package taba.zzinmak.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import taba.zzinmak.member.dto.MemberDto;
import taba.zzinmak.member.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String Home() {
        return "home";
    }

    @GetMapping("/member/signup")
    public String Signup() {
        return "member/signup";
    }

    @PostMapping("/member/signup")
    public String createMember(MemberDto memberDto) {
        Long memberId = memberService.signup(memberDto);
        return "home";
    }
}

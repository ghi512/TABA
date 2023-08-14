package taba.zzinmak.member.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import taba.zzinmak.member.dto.MemberDto;
import taba.zzinmak.member.entity.Member;
import taba.zzinmak.member.repository.MemberRepository;
import taba.zzinmak.member.service.MemberService;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Override
    public Long signup(MemberDto memberDto) {
        Member member = Member.builder()
                .email(memberDto.getEmail())
                .password(memberDto.getPassword())
                .nickname(memberDto.getNickname())
                .age(memberDto.getAge())
                .gender(memberDto.getGender())
                .job(memberDto.getJob())
                .build();
        return memberRepository.save(member).getId();
    }
}

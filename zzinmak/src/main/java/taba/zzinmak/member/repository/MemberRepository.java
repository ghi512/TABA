package taba.zzinmak.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taba.zzinmak.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

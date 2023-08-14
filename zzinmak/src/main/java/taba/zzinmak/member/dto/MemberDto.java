package taba.zzinmak.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import taba.zzinmak.member.entity.Member;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String email;
    private String password;
    private String nickname;
    private int age;
    private Member.Gender gender;
    private Member.Job job;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Member.Gender getGender() {
        return gender;
    }

    public void setGender(Member.Gender gender) {
        this.gender = gender;
    }

    public Member.Job getJob() {
        return job;
    }

    public void setJob(Member.Job job) {
        this.job = job;
    }
}

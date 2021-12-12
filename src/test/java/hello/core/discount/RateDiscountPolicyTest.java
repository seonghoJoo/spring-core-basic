package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 함")
    void vip_0(){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = discountPolicy.disCount(member,10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니라면 할인이 적용되지 않아야한다.")
    void vip_x(){
        //given
        Member member = new Member(1L,"memberBasic", Grade.BASIC);
        //when
        int discount = discountPolicy.disCount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }

}




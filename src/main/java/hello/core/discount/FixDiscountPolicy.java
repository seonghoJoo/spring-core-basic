package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    // 천원 할인 하겠다.
    private int disCountFixAmoount = 1000;

    @Override
    public int disCount(Member member, int price) {

        // enum type은 == 비교가 맞음.
        if(member.getGrade() == Grade.VIP){
            return price-1000;
        }
        return 0;
    }
}

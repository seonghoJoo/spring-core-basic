package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int disCountFixAmoount = 1000;

    @Override
    public int disCount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price-1000;
        }
        return 0;
    }
}

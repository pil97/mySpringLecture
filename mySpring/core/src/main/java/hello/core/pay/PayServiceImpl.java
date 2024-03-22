package hello.core.pay;

import hello.core.member.MemberRepository;

public class PayServiceImpl implements PayService{

    private final MemberRepository memberRepository;

    public PayServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Pay findPay(String payName) {
        return memberRepository.findByPay(payName);
    }
}

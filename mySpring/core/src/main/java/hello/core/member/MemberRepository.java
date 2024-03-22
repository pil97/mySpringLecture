package hello.core.member;

import hello.core.pay.Pay;

public interface MemberRepository {

    Pay findByPay(String payName);
}

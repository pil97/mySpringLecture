package hello.core.member;

import hello.core.pay.KakaoPay;
import hello.core.pay.Pay;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{


    @Override
    public Pay findByPay(String payName) {
        return null;
    }
}

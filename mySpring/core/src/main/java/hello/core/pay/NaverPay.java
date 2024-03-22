package hello.core.pay;

public class NaverPay implements Pay {
    @Override
    public String payName() {
        return "NAVER";
    }
}

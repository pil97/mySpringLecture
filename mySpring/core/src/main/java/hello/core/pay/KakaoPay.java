package hello.core.pay;

public class KakaoPay implements Pay{
    @Override
    public String payName() {
        return "KAKAO";
    }
}

package hello.core.order;

public interface OrderService {
    // 최종 order결과를 반환 해야함.
    Order createOrder(Long memberId, String itemName, int itemPrice);
}

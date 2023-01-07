package observer.example.listeners;

public class UserListener implements NewEventListener {
    @Override
    public void update(String eventType) {
        System.out.println(eventType + "뉴스가 발행되었습니다.");
    }
}

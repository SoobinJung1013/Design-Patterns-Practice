package factory_method.example.factory;

import factory_method.example.buttons.Button;

// 추상 클래스는 객체로 생성되지 않음
// 그리고 구현해야 한다고 abstract이라는 용어로 명시적으로 알려줌
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}

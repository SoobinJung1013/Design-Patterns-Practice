package abstract_factory.example.factories;

import abstract_factory.example.checkboxes.Checkbox;
import abstract_factory.example.buttons.Button;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

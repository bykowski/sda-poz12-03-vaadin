package pl.bykowski.springbootvaadinexample;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloGui extends VerticalLayout {

    TextField textField = new TextField();
    Button button = new Button("Say Hello");
    Label label = new Label();

    public HelloGui() {
        button.addClickListener(click ->
                label.setText("hello " + textField.getValue()));
        add(textField);
        add(button);
        add(label);
    }
}

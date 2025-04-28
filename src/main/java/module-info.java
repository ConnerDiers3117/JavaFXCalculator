module section6.app.javafx_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens section6.app.javafx_calculator to javafx.fxml;
    exports section6.app.javafx_calculator;
}
module com.rolw.add_sub_mult_div {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rolw.add_sub_mult_div to javafx.fxml;
    exports com.rolw.add_sub_mult_div;
}
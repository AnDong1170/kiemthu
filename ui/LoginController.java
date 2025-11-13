package poly.cafe.ui;

import poly.cafe.util.XDialog;

public interface LoginController {
    void open();
    void login();
    default void exit(){
        if(XDialog.confirm("Bạn có muốn kết thúc?")){
            System.exit(0);
        }
    }
}

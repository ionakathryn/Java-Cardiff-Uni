import javax.swing.JFrame;
import java.awt.Dialog;
import java.awt.*;

class AddDialog extends Dialog {

    public AddDialog(JFrame f){
        super(f, true);
        final int DEFAULT_DIALOG_WIDTH = 500;
        final int DEFAULT_DIALOG_HEIGHT = 500;
        setSize(DEFAULT_DIALOG_WIDTH, DEFAULT_DIALOG_HEIGHT);
        module_code = new TextField("module_code");
        module_code.setBounds(200,10,110,20);
        error = new TextArea(10,10 );
        add(module_code);
        add(error);
    }

    private TextField module_code;
    private TextArea error;
}

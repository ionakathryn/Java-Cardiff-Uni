import javax.swing.JFrame;
import java.awt.Dialog;
import javax.swing.*;
import java.awt.*;

class AddDialog extends Dialog {

	public AddDialog(JFrame f){
	super(f, true);
	final int DEFAULT_DIALOG_WIDTH = 500;
	final int DEFAULT_DIALOG_HEIGHT = 500;
	setSize(DEFAULT_DIALOG_WIDTH, DEFAULT_DIALOG_HEIGHT);
	module_code = new TextField("module_code goes here");
	module_code.setBounds(400,400,50,20);
	error = new TextField("error goes here");
	error.setBounds(250,250,250,10);
	add(module_code);
	add(error);
	}

	private TextField module_code, error;
}

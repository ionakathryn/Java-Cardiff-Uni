	import javax.swing.*;
	import java.awt.Dialog;

	public class DisplayDialog extends JDialog {
	public DisplayDialog(JFrame f, boolean b) {
	super(f, true);
	final int DEFAULT_DIALOG_WIDTH = 1000;
	final int DEFAULT_DIALOG_HEIGHT = 700;
	setSize(DEFAULT_DIALOG_WIDTH, DEFAULT_DIALOG_HEIGHT);
	setTitle("displayDialog");
	}
}
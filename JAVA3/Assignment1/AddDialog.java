import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.*;
import java.io.RandomAccessFile;
import java.io.IOException;
public class AddDialog extends JDialog {
	public AddDialog(JFrame f, boolean b) {
		super(f, true);
		final int DEFAULT_DIALOG_WIDTH = 900;
		final int DEFAULT_DIALOG_HEIGHT = 800;
		setSize(DEFAULT_DIALOG_WIDTH, DEFAULT_DIALOG_HEIGHT);
		setTitle("addRecord");
		module_code = new JTextField("module_code");
		module_code.setSize(124, 50);
		module_code.setLocation(500, 20);
		add(module_code);
		surnameL = new JLabel("enter surname:");
		surnameL.setSize(100,50);
		surnameL.setLocation(50,80);
		add(surnameL);
		surname = new JTextField(" ");
		surname.setSize(100, 50);
		surname.setLocation(200, 80);
		add(surname);
		initialsL = new JLabel("enter initials:");
		initialsL.setSize(100,50);
		initialsL.setLocation(50,160);
		add(initialsL);
		initials = new JTextField(" ");
		initials.setSize(100, 50);
		initials.setLocation(200, 160);
		add(initials);
		titleL = new JLabel("enter title:");
		titleL.setSize(100,50);
		titleL.setLocation(50,240);
		add(titleL);
		title = new JTextField(" ");
		title.setSize(100, 50);
		title.setLocation(200, 240);
		add(title);
		studentNumL = new JLabel("enter studentNum:");
		studentNumL.setSize(100,50);
		studentNumL.setLocation(50,320);
		add(studentNumL);
		studentNum = new JTextField(" ");
		studentNum.setSize(100, 50);
		studentNum.setLocation(200, 320);
		add(studentNum);
		assesment_markL = new JLabel("enter assesment_mark:");
		assesment_markL.setSize(100,50);
		assesment_markL.setLocation(50,400);
		add(assesment_markL);
		assesment_mark = new JTextField(" ");
		assesment_mark.setSize(100, 50);
		assesment_mark.setLocation(200, 400);
		add(assesment_mark);
		exam_markL = new JLabel("enter exam_mark:");
		exam_markL.setSize(100,50);
		exam_markL.setLocation(50,480);
		add(exam_markL);
		exam_mark = new JTextField(" ");
		exam_mark.setSize(100, 50);
		exam_mark.setLocation(200, 480);
		add(exam_mark);
		tuition_feeL = new JLabel("enter tuition fee:");
		tuition_feeL.setSize(100,50);
		tuition_feeL.setLocation(50,560);
		add(tuition_feeL);
		tuition_fee = new JTextField(" ");
		tuition_fee.setSize(100,50);
		tuition_fee.setLocation(200,560);
		add(tuition_fee);
		error = new JTextField("this is an error textfield");
		add(error);
		submit = new JButton("submit");
		submit.setSize(100,50);
		submit.setLocation(50,620);
		submit.addActionListener(handle);
		add(submit);
		back = new JButton("back");
		back.setSize(100,50);
		back.setLocation(200,620);
		back.addActionListener(handle);
		add(back);
		addUser = new JButton("add new user");
		addUser.setSize(200,50);
		addUser.setLocation(340,620);
		addUser.addActionListener(handle);
		add(addUser);
		error = new JTextField("error message goes here");
		error.setSize(300,150);
		error.setLocation(500,100);
		error.setEditable(false);
		add(error);
	}
	handler handle = new handler();
	public JTextField error, module_code, surname, initials, title,studentNum, assesment_mark, exam_mark, tuition_fee ;
	public JButton submit,back, addUser;
	public JLabel surnameL, initialsL,titleL,studentNumL,assesment_markL,exam_markL, tuition_feeL;
	int count, i = 0;
	int module_codeVal, studentNumVal, assesment_markVal, exam_markVal, tuition_feeVal, markVal;
	String surnameVal, initialsVal, titleVal;
	public class handler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == back){
				System.exit(0);
			}
			if(e.getSource() == addUser){
				surname.setText(null);
				initials.setText(null);
			}
			if (e.getSource() == submit){
				count = 0;
// validation tests
				JOptionPane.showMessageDialog(null, surname.getText());
				validateSurname(surname.getText());
				validateInitials(initials.getText());
				validateTitle(title.getText());
				validateIntVal(studentNum.getText());
				validateIntVal(assesment_mark.getText());
				validateAll();
			}
		}
	}
	public void validateSurname(String input){
		if (input.matches("^.*[^a-zA-Z ].*$") || input.length() > 20) {
			JOptionPane.showMessageDialog(null, "please enter valid surname value - must contain all alphabetical chars" +
				" and be max 20 chars in length");
		}
		else{
			JOptionPane.showMessageDialog(null, "surname valid");
			count ++;
		}
	}
	public void validateInitials(String input){
		if (input.matches("^.*[^a-zA-Z].*$") || input.length() > 6) {
			JOptionPane.showMessageDialog(null, "please enter valid initials value - must contain all alphabetical chars" +
				" and be max 6 chars in length");
		}
		else{
			JOptionPane.showMessageDialog(null, "initials valid");
			count ++;
		}
	}
	public void validateTitle(String input){
// make sure 6 chars and alphachars
		if (input.matches("^.*[^a-zA-Z].*$") || input.length() > 6) {
			JOptionPane.showMessageDialog(null, "please enter valid title value - must contain all alphabetical chars" +
				" and be max 6 chars in length");
		}
		else{
			JOptionPane.showMessageDialog(null, "title valid");
			count ++;
		}
	}
	public void validateIntVal(String input) {
		if (!input.matches("\\d+")) {
			JOptionPane.showMessageDialog(null, "please enter valid number - must be an integer");
		} else {
			JOptionPane.showMessageDialog(null, "valid");
			count++;
		}
	}
	public void validateAll(){
		if (count == 5){
			JOptionPane.showMessageDialog(null,"OK to proceed with raf write");
			makeNewFile();
		}
		else{
			System.out.println(count);
		}
	}

	RandomAccessFile file = null;
	int recSize = 96;
	public void makeNewFile(){
		try{
			file = new RandomAccessFile(module_code.getText() + ".binary", "rw");
			JOptionPane.showMessageDialog(null,"RandomAccessFile " + module_code.getText() + " created succesfully!!!");
		}
		catch (IOException ioe){
			System.out.println("error opening file!");
			System.exit(1);
		}
		try {
			write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write() throws IOException{
		file.seek((Integer.parseInt(studentNum.getText())-1) * recSize);

		// write module code
		if (module_code.getText().length() < 6){
			file.writeChars(module_code.getText());
			for (i = module_code.getText().length(); i < 6; i++){
				file.writeChar(' ');
			}
		}
		else{
			file.writeChars(module_code.getText().substring(0,6));
			}
		

		// write title
		if (title.getText().length() < 6){
			file.writeChars(title.getText());
			for (i = title.getText().length(); i < 6; i++){
				file.writeChar(' ');
			}
		}
			else{
				file.writeChars(title.getText().substring(0,6));
			}
		

		// write initials
		if (initials.getText().length() < 6){
			file.writeChars(initials.getText());
			for (i = initials.getText().length(); i < 6; i++){
				file.writeChar(' ');
			}
		}
			else{
				file.writeChars(initials.getText().substring(0,6));
			}
		

		// write surname
		if (surname.getText().length() < 20){
			file.writeChars(surname.getText());
			for (i = surname.getText().length(); i < 20; i++){
				file.writeChar(' ');
			}
		}
			else{
				file.writeChars(surname.getText().substring(0,20));
			}
		
		// write student num
		file.writeInt(Integer.parseInt(studentNum.getText()));

		// write assesment mark
		file.writeInt(Integer.parseInt(assesment_mark.getText()));

		// write exam mark
		file.writeInt(Integer.parseInt(exam_mark.getText()));

		// write tuition fee
		file.writeDouble(Double.parseDouble(tuition_fee.getText()));

		file.close();
	}
// }
}

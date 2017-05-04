import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.*;

class AddDialog extends Dialog {

    public AddDialog(JFrame f) {
        super(f, true);
        final int DEFAULT_DIALOG_WIDTH = 1000;
        final int DEFAULT_DIALOG_HEIGHT = 700;
        setSize(DEFAULT_DIALOG_WIDTH, DEFAULT_DIALOG_HEIGHT);
        setTitle("addRecord");
        module_code = new JTextField("module_code");
        module_code.setSize(124, 50);
        module_code.setLocation(130, 20);
        add(module_code);


        surname = new JTextField("Surname");
        surname.setSize(100, 50);
        surname.setLocation(20, 80);
        add(surname);

        initials = new JTextField("initials");
        initials.setSize(100, 50);
        initials.setLocation(20, 160);
        add(initials);

        title = new JTextField("title");
        title.setSize(100, 50);
        title.setLocation(20, 240);
        add(title);

        studentNum = new JTextField("studentNum");
        studentNum.setSize(100, 50);
        studentNum.setLocation(20, 320);
        add(studentNum);

        assesment_mark = new JTextField("assesment_mark");
        assesment_mark.setSize(100, 50);
        assesment_mark.setLocation(20, 400);
        add(assesment_mark);

        exam_mark = new JTextField("exam_mark");
        exam_mark.setSize(100, 50);
        exam_mark.setLocation(20, 480);
        add(exam_mark);

        error = new JTextArea("this is an error textfield");
        add(error);

        submit = new JButton("submit");
        submit.setLocation(250,250);
        submit.setVisible(true);
        add(submit);

        checkNumeric(assesment_mark.getText());
        checkNumeric(exam_mark.getText());
        checkNumeric(studentNum.getText());


    }
    private JTextField module_code, surname, initials, title,studentNum, assesment_mark, exam_mark ;
    private JTextArea error;
    private JButton submit;

    public void checkNumeric(String input) {
        try {
            Integer.parseInt(input);
        System.out.println("valid int");
    }

    catch(NumberFormatException nfe)

        {
            System.out.println("must input int");
        }
    }




}

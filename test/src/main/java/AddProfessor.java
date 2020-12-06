import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddProfessor extends TeacherDecorator implements ActionListener {

	private JLabel nameLabel = new JLabel("Professor Name: ");
	private JLabel sirnameLabel = new JLabel("Professor Surname: ");
	private JLabel numberLabel = new JLabel("Number: ");
	
	private JTextField name = new JTextField();
	private JTextField sirname = new JTextField();
	private JTextField number = new JTextField();
	
	private JButton save = new JButton("Save");
	
	public AddProfessor(Teacher t) {
		super(t);
	}
	
	@Override
	public void drawWindow() {
		super.drawWindow();
		
		frame.setTitle("Add Professor");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,2));
		
		buttonPanel.add(nameLabel);
		buttonPanel.add(name);
		buttonPanel.add(sirnameLabel);
		buttonPanel.add(sirname);
		buttonPanel.add(numberLabel);
		buttonPanel.add(number);
		buttonPanel.add(save);
		
		save.addActionListener(this);
		
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

	    	    if (source == save)
            {
                try
                    (FileWriter fw = new FileWriter("teacher.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                {

                File file = new File("teacher.txt");
                   bw.newLine(); bw.write("Professor: " + name.getText() + " " + sirname.getText()+ "Number:" + number.getText());
                    bw.close();
                    System.out.println("Successfully wrote to the file.");
    	        } catch (IOException e1) {
    	    	    System.out.println("An error occurred.");
    	    	    e1.printStackTrace();
    	        }
	    }
        }

}

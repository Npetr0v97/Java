import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddAssistant implements Teacher, ActionListener {

	private JFrame frame = new JFrame("Add Assistant");
	
	private JLabel nameLabel = new JLabel("Assistant Name: ");
	private JLabel sirnameLabel = new JLabel("Assistant Surname: ");
	
	private JTextField name = new JTextField();
	private JTextField sirname = new JTextField();
	
	private JButton save = new JButton("Save");
	
	@Override
	public void drawWindow() {
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,2));
		
		buttonPanel.add(nameLabel);
		buttonPanel.add(name);
		buttonPanel.add(sirnameLabel);
		buttonPanel.add(sirname);
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
                 bw.newLine();   bw.write("Professor: " + name.getText() + " " + sirname.getText());
                    bw.close();
                    System.out.println("Successfully wrote to the file.");
    	        } catch (IOException e1) {
    	    	    System.out.println("An error occurred.");
    	    	    e1.printStackTrace();
    	        }
	    }
        }
        
}

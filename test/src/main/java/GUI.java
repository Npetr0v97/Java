
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creating the Download Manager application with GUI
 * @author bkoprinski
 *
 */
public class GUI implements ActionListener {
	
	private JFrame frame = new JFrame("Teachers");
	private JButton addProfessor = new JButton("Add Professor");
	private JButton addAssistant = new JButton("Add Assistant");
	private JButton showTeacherDetails = new JButton("Show Teacher Details");
	private GuiFactory guiFactory = new GuiFactory();

	/**
	 * Forming the frame and adding all the buttons and text fields
	 */
	public void showGui()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		addProfessor.setName("add_professor");
		addAssistant.setName("add_assistant");
		showTeacherDetails.setName("show");

		JPanel layout = new JPanel();
		layout.setLayout(new BoxLayout(layout, BoxLayout.Y_AXIS));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,6));
		
		buttonPanel.add(addProfessor);
		buttonPanel.add(addAssistant);
		buttonPanel.add(showTeacherDetails);

		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.setResizable(false);
		frame.setVisible(true);
		
		addProfessor.addActionListener(this);
		addAssistant.addActionListener(this);
		showTeacherDetails.addActionListener(this);
		
		frame.repaint();
	}

	/**
	 * Method for giving actions to the buttons
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    String buttonText = ((JButton) e.getSource()).getName();
	   
	    Teacher teacher = guiFactory.make(buttonText);
	    
	    teacher.drawWindow();
	}
}

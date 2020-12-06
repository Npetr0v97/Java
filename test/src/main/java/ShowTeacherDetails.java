import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.ArrayList;

public class ShowTeacherDetails extends TeacherDecorator {

	private JTextArea result = new JTextArea();
	
	public ShowTeacherDetails(Teacher t) {
		super(t);
	}
	
	@Override
	public void drawWindow() {
		super.drawWindow();
		
		frame.setTitle("Show Teacher Details");
		
		result.setEditable(false);
		
		FileOperations proxyFile= new FileOperationsProxy("teacher.txt");
		
		ArrayList<String> list = proxyFile.sort();
		
		for (int i = 0; i < list.size(); i++) {
			result.append(list.get(i) + "\n");
		}
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,1));
		
		buttonPanel.add(result);
		
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.repaint();
	}
}

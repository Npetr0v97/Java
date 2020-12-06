import javax.swing.JFrame;

public abstract class TeacherDecorator implements Teacher {
	protected Teacher teacher;
	
	public JFrame frame = new JFrame();
	
	public TeacherDecorator(Teacher t) {
		this.teacher = t;
	}

	@Override
	public void drawWindow() {
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		
		//frame.setResizable(false);
		frame.setVisible(true);
		
		frame.repaint();
		
		teacher.drawWindow();
	}
}

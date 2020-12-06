
public class GuiFactory {
	
	public Teacher make(String buttonType) {
		switch (buttonType) {
		case "add_professor":
			return new AddProfessor(new BasicTeacherWindow());
		case "add_assistant":
			return new AddAssistant();
		case "show":
			return new ShowTeacherDetails(new BasicTeacherWindow());
		default:
			return null;
		}
	}
}

import java.util.ArrayList;

public class FileOperationsProxy implements FileOperations {
	
	private ReadFile readFile;
    private String fileName;
    
    public FileOperationsProxy(String fileName) {
    	this.fileName = fileName;
    }
    
	@Override
	public ArrayList<String> sort() {
		if (readFile == null) {
            readFile = new ReadFile(fileName);
        }
		
        return readFile.sort();
	}
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile implements FileOperations {

	private ArrayList<String> lines = new ArrayList<String>();
    
	public ReadFile(String fileName) {
		BufferedReader reader = null;
		String currentLine;
		
		try {
			reader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			currentLine = reader.readLine();
			
			while (currentLine != null) {
				lines.add(currentLine);
				currentLine = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	@Override
	public ArrayList<String> sort() {
		Collections.sort(lines);
		
		return lines;
	}
}

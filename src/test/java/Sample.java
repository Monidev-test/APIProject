import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
public static void main(String[] args) throws IOException {
	FileReader fileReader=new FileReader(new File("C:\\Users\\USER\\eclipse-workspace\\APITestingMonisha\\resource\\Sample.json"));
	ObjectMapper objectMapper=new ObjectMapper();
	Root readValue = objectMapper.readValue(fileReader, Root.class);
	System.out.println(readValue.getName());
	System.out.println(readValue.getAge());
	System.out.println(readValue.getStatus());
	Address address = readValue.getAddress();
	System.out.println(address.getCity());
	System.out.println(address.getState());
	ArrayList<String> courses = readValue.getCourses();
	for (int i = 0; i < courses.size(); i++) {
	String string = courses.get(i);	
	System.out.println(string);
	}
}
	
}

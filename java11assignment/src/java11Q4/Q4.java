package java11Q4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
public static void main(String[] args) throws IOException {
		
		var path = "C:\\Users\\SDINKARR\\git\\Assignments\\java11assignment\\src\\java11Q4\\studentlist.txt";
		
		 List<String> str = Files.readAllLines(Path.of(path));
		 
		  long count =   str.stream().filter(l -> !(l.isBlank())).count();
		  
		 System.out.println(str.stream().filter(l -> !(l.isBlank()))
				 .map(l-> l.strip()).collect(Collectors.toList()) 
				 + 
				 "\nThere are " +count + " Students");
		 
	}
}

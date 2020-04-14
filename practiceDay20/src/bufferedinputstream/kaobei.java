package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class kaobei {
public static void main(String[] args) throws IOException {
	buffered();
	FileInputStream fis = new FileInputStream("linzejia.txt");
	FileOutputStream fos = new FileOutputStream("copy2.txt");
    
}

private static void buffered() throws FileNotFoundException, IOException {
	BufferedInputStream bfs =new BufferedInputStream(new  FileInputStream("linzejia.txt"));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));
	
int b ;
	while ((b=bfs.read())!=-1) {
		bos.write(b);
	} 
	bfs.close();
	bos.close();
}
}

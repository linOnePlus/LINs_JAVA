package dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*泛型、集合 反射等等加强下*/
public class dom4jTest {
public static void main(String[] args) {
	SAXReader sax =new SAXReader();
	try {
		Document read = sax.read(new File("D:\\LINs_Workplace\\LINs_JAVA\\XML\\src\\demo.xml"));
		Element rootElement = read.getRootElement();
		List<Element> elements = rootElement.elements();
		for (Element e : elements) {
			System.out.println(e.getText());
		}
	} catch (DocumentException e) {
		e.printStackTrace();
	}
}
}

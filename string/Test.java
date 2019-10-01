package string;

public class Test {
	public static void main(String[] args) {
		Document1 document=new Document1();
		document.setTitle("Java basic");
		document.setFilepath("c:/document/corejava/basic/introduction.pdf");
		System.out.println(document.showDocumentinfo());

	}

}

package string;

public class Document1 {
	private String title;
	private String filepath;

	public String getTitle()
	{
		return title;
	}
	public String setTitle(String title) {
		return this.title = title;
	}
	public String getFilepath() {
		return filepath;
	}
	public String setFilepath(String filepath) {
		return this.filepath = filepath;
	}
	public	String showDocumentinfo()
	{  
		String str ="title:"+getTitle()+",filepath"+getFilepath();
		return str;

	}

}

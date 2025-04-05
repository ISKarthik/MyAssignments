package weektwodayone;

public class Browser {
	
	public String launchBrowser(String BrowserName)
	{
		System.out.println("Browser launched successfully" + "");
		System.out.println(BrowserName);
		return "BrowserName";
	}
	public String LoadURL(String URL)
	{
	System.out.println("Application URL loaded successfully");
	System.out.println(URL);
	return "LoadURL";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser s = new Browser();
		s.launchBrowser("EDGE");
		s.LoadURL("www.google.com");
	}

}

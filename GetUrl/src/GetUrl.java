import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetUrl {

	public static void main(String[] args) {
		File file=new File("aaa.html");
		try {
			Document document=Jsoup.parse(file,"UTF-8");
			Elements elements=document.select("a.title");
//			System.err.println(elements.size());
			for (int i = 0; i < elements.size(); i++) {
				System.err.println(elements.get(i).attr("href").split("/")[5]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

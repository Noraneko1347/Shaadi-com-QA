package VerifyCommunityName.BaseFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetURLs {
	String[] urlListStr = null;
	public String[] SetURLs() throws IOException, ParseException {
		String path = System.getProperty("user.dir");
		JSONParser jsonParser = new JSONParser();
		try {
			FileReader reader = new FileReader(path+"\\src\\VerifyCommunityName\\BaseFiles\\URLs.json"); // reads JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray urls = (JSONArray) obj;
			urlListStr = new String[urls.size()];
			for (int i = 0; i < urls.size(); i++) {
				JSONObject urlList = (JSONObject) urls.get(i);
				urlListStr[i] = (String) urlList.get("url");				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return urlListStr;
	}
}

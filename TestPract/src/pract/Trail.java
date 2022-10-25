package pract;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.LinkedBlockingDeque;

/*
 According to the caption on the bronze marker placed by the Multnomah Chapter of 
 the Daughters of the American Revolution on May 12, 1939,College Hall ([is]) the oldest 
 building in continuous use for Educational [purposes] [west] of the [Rocky] Mountains. Here were
  educated [men] and women who have won recognition throughout the [world] in all the learned professions"
  
{"purposes","west","rocky","world", "her","she","lost","let","is","and","men"};  
 */
//github ps - Shubham@12071996  // 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

public class Trail {
	public static void main(String[] args) {
		
		String s1 = "According to the caption on the bronze marker placed by the Multnomah Chapter of the Daughters of the American Revolution on May 12, 1939,College Hall (is) the oldest building in continuous use for Educational purposes west of the Rocky Mountains. Here were educated men and women who have won recognition throughout the world in all the learned professions";
		List<String> list = new LinkedList<String>();
		
		//StringJoiner sj = new StringJoiner("," ,"{", "}");
		
		
		if(s1.contains("purposes")){
			list.add("purposes");
			//sj.add("purposes");
		} 
		if(s1.contains("west")) {
			list.add("west");
			//sj.add("west");
		}
		if((s1.toLowerCase()).contains("rocky")) {
			list.add("rocky");
			//sj.add("rocky");
		}
		if(s1.contains("world")) {
			list.add("world");
		}
		if(s1.contains("her")) {
			list.add("her");
		}
		if(s1.contains("she")) {
			list.add("she");
		}
		if(s1.contains("lost")) {
			list.add("lost");
		}
		if(s1.contains("let")) {
			list.add("let");
		}
		if(s1.contains("is")) {
			list.add("is");
		}
		if(s1.contains("and")) {
			list.add("and");
		}
		if(s1.contains("men")) {
			list.add("men");
		}
		
		//System.out.println(sj.toString());
		System.out.println("{ "+list+" }");
	}
}

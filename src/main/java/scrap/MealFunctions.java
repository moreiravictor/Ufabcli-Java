package scrap;

import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MealFunctions {
	
	public static void getMeal(String mealID) {
		try {
			Document doc = Jsoup.connect("http://proap.ufabc.edu.br/nutricao-e-restaurantes-universitarios/cardapio-semanal").get();
			Date date = new Date();
			//The html from PROGRAD increases the tableRow by 2*day-1, that means that mon = 1, tue = 3 and so on.. therefore:
			// 1: lunch, 3: dinner, 5: garrisson, 7: dessert
			int today = date.getDay();
			String days = doc.select("#content-section > div:eq(1) > div > table > tbody > tr:eq("+ ( ++today ) +") > td:eq(0) > ul:eq("+mealID+")").text();
			System.out.println(days);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

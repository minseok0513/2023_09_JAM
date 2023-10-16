package com.koreaIT.example.JAM;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.Map;

public class Article {

	public int id;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String title;
	public String body;

	public Article(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.regDate = (LocalDateTime) articleMap.get("regDate");
		this.updateDate = (LocalDateTime) articleMap.get("updateDate");
		this.title = (String) articleMap.get("title");
		this.body = (String) articleMap.get("body");
=======
public class Article {

	public int id;
	public String title;
	public String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
>>>>>>> fa81bfe9310edd6fa2e59eb7329037c8547751cc
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Article [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", title=" + title
				+ ", body=" + body + "]";
=======
		return "Article [id=" + id + ", title=" + title + ", body=" + body + "]";
>>>>>>> fa81bfe9310edd6fa2e59eb7329037c8547751cc
	}
}
package com.gagan.news.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String headline;
	private String url;
	private String source;
	private String type;
	private String sourceUrl;
	private String newsId;

	public News() {

	}

	public News(String headline, String url, String source, String type, String sourceUrl, String newsId) {
		this.headline = headline;
		this.url = url;
		this.source = source;
		this.type = type;
		this.sourceUrl = sourceUrl;
		this.newsId = newsId;
	}

	public News(int id, String headline, String url, String source, String type, String sourceUrl, String newsId) {
		super();
		this.id = id;
		this.headline = headline;
		this.url = url;
		this.source = source;
		this.type = type;
		this.sourceUrl = sourceUrl;
		this.newsId = newsId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	@Override
	public String toString() {

		return headline;
	}

}

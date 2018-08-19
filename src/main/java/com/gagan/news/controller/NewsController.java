package com.gagan.news.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gagan.news.model.News;
import com.gagan.news.repository.NewsRepository;

@RestController
public class NewsController {

	@Autowired
	NewsRepository repository;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/news")
	public List<News> index() {
		return repository.findAll();
	}

	@GetMapping("/news/{id}")
	public News show(@PathVariable String id) {
		int newsId = Integer.parseInt(id);
		return repository.findById(newsId).get();
	}

	@PostMapping("/news/search")
	public List<News> search(@RequestBody Map<String, String> body) {
		String searchTerm = body.get("headline");
		return repository.findByHeadlineContaining(searchTerm);
	}

	@PostMapping("/news")
	public News create(@RequestBody Map<String, String> body) {

		return repository.save(new News(body.get("headline"), body.get("url"), body.get("source"), body.get("type"),
				body.get("sourceUrl"), body.get("newsId")));
	}

}

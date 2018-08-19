package com.gagan.news.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gagan.news.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

	List<News> findByHeadlineContaining(String text);
}

package superM.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import superM.demo.entities.Article;

public interface ArticleRep extends JpaRepository<Article, Integer> {
}

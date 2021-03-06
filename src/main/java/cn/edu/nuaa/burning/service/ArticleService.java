package cn.edu.nuaa.burning.service;

import cn.edu.nuaa.burning.entity.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

/**
 * @author qiyuey
 */
public interface ArticleService {

    Slice<Article> findArticleSlice(String userId, Pageable pageable);
}

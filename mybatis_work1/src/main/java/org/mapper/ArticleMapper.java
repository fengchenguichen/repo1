package org.mapper;

import org.bean.Article;

import java.util.List;

public interface ArticleMapper {

    // 需求：查询文章信息及关联的评论信息
    public List<Article> findArticleWithComment();
}

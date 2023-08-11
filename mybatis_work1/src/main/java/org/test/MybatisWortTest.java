package org.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.bean.Article;
import org.junit.jupiter.api.Test;
import org.mapper.ArticleMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisWortTest {

    // 需求：查询文章信息及关联的评论信息
    @Test
    public void test(){

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);
            List<Article> articleWithComment = mapper.findArticleWithComment();
            for (Article article : articleWithComment) {
                System.out.println(article);
                System.out.println(article.getCommentList());
            }

            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

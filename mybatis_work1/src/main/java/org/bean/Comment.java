package org.bean;

import java.io.Serializable;

public class Comment implements Serializable {

    /*    `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
    `content` longtext COMMENT '评论内容',
    `author` varchar(200) DEFAULT NULL COMMENT '评论作者',
    `a_id` int(20)*/

    private Integer id;
    private String content;
    private String author;
    private Integer a_id;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_id=" + a_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }
}

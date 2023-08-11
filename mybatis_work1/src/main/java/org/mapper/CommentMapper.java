package org.mapper;

import org.bean.Comment;

import java.util.List;

public interface CommentMapper {

    // 根据文章id查询评论信息
    public List<Comment> findById(Integer aid);
}

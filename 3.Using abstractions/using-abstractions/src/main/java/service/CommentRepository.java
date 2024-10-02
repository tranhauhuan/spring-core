package service;

import model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

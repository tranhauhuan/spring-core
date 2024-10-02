package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcess {
    private final CommentRepository commentRepository;

    @Autowired

    public CommentProcess(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void setComment(Comment comment) {
        commentRepository.saveComment(comment);
    }
}

package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    ApplicationContext applicationContext;

    public void sendComment(Comment comment) {
        CommentProcess commentProcess = applicationContext.getBean(CommentProcess.class);
        commentProcess.setComment(comment);
    }
}

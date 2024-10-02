package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Comment comment = new Comment();
        comment.setContent("Comment");
        comment.setAuthor("author");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}

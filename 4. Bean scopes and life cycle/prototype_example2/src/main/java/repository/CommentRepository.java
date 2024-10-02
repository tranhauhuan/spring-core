package repository;

import model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    public void saveComment(Comment comment) {
        System.out.println("Saved comment: "+ comment.getContent());
    }

}

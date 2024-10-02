package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy  implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Push comment "+ comment.getContent());
    }
}

package lt.prj.post.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class CommentLikes {

    @Id
    private AtomicLong commentId;
    private AtomicLong memberId;
    private String emoji;
    private LocalDateTime createdDatetime;
}

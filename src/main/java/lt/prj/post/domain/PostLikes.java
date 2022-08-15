package lt.prj.post.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class PostLikes {

    @Id
    private AtomicLong postId;
    private AtomicLong memberId;
    private String emoji;
    private LocalDateTime createdDatetime;
}

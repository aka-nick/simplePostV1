package lt.prj.post.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class Comment {

    @Id
    private AtomicLong id;
    private AtomicLong postId;
    private AtomicLong memberId;
    private String contents;
    private LocalDateTime createdDatetime;
    private LocalDateTime modifiedDatetime;
    private Enabled enabled;
}

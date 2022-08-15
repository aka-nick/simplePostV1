package lt.prj.post.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class Post {

    @Id
    private AtomicLong id;
    private Category category;
    private String title;
    private String contents;
    private AtomicLong memberId;
    private LocalDateTime createdDatetime;
    private LocalDateTime modifiedDatetime;
    private Enabled enabled;
}

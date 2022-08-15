package lt.prj.post.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class Member {

    @Id
    private AtomicLong id;
    private String email;
    private String password;
    private String name;
    private String emoji;
    private String greetings;
    private LocalDateTime craetedDatetime;
    private LocalDateTime modifiedDatetime;
    private Enabled enabled;
    private Grade grade;

}

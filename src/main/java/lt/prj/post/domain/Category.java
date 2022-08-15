package lt.prj.post.domain;

import lombok.Getter;

@Getter
public enum Category {
    POST(1, "POST"),
    COMMENT(2, "COMMENT");

    private final int categoryNumber;
    private final String categoryName;

    Category(int categoryNumber, String categoryName) {
        this.categoryNumber = categoryNumber;
        this.categoryName = categoryName;
    }
}

package lt.prj.post.domain;

import lombok.Getter;

@Getter
public enum Enabled {

    ENABLE("Y", true),
    DISABLE("N", false),
    ;

    private final String enableString;
    private final boolean enable;

    Enabled(String enableString, boolean enable) {
        this.enableString = enableString;
        this.enable = enable;
    }

}

package skill.common.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;

@RequiredArgsConstructor
@Accessors(fluent = true)
@Getter
public class LoginResult {
    private final @NonNull Instant loginTs;
    private final @NonNull String authToken;
    private final @NonNull Duration tokenValidity;
    private final @NonNull URL tokenRefreshUrl;

    public static void main(String[] args) {

//        LoginResult aaa = new LoginResult(Instant.now(), "aaa", , new URL("https://www.baeldung.com/intro-to-project-lombok"));
    }
}

package dev.mccue.forever.test;

import dev.mccue.forever.For;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForeverTest {
    @Test
    public void everIsTrue() {
        assertTrue(For.ever);
    }

    @Test
    public void forEverIsAtLeastASecond() throws InterruptedException {
        var t = Thread.startVirtualThread(() -> {
            For.ever(() -> {});
        });

        assertTrue(t.isAlive());

        Thread.sleep(Duration.of(1, ChronoUnit.SECONDS));
        assertTrue(t.isAlive());
    }
}

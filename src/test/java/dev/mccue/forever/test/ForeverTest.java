package dev.mccue.forever.test;

import dev.mccue.forever.For;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

    @Test
    public void forEverRunsCode() throws InterruptedException {
        AtomicInteger i = new AtomicInteger();
        var t = Thread.startVirtualThread(() -> {
            For.ever(i::getAndIncrement);
        });

        assertTrue(t.isAlive());

        Thread.sleep(Duration.of(1, ChronoUnit.SECONDS));
        assertTrue(t.isAlive());

        assertNotEquals(0, i.get());
    }

    @Test
    public void forEverIsAtLeastASecondAndNullSafe() throws InterruptedException {
        var t = Thread.startVirtualThread(() -> {
            For.ever(null);
        });

        assertTrue(t.isAlive());

        Thread.sleep(Duration.of(1, ChronoUnit.SECONDS));
        assertTrue(t.isAlive());
    }

}

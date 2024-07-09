package dev.mccue.forever;

import org.jspecify.annotations.Nullable;

/**
 * Utility for running a bit of code "forever"
 */
public final class For {
    private For() {}

    /**
     * Equivalent to {@literal true}.
     */
    public static final boolean ever = true;

    /**
     * Runs the runnable over and over in the equivalent of
     * a {@code for(;ever;)} loop.
     *
     * <p>
     *     Just like in real life, you won't live forever if
     *     a {@link Throwable} kills you.
     * </p>
     *
     * @param runnable The runnable to run and run and run and run and run and run.
     */
    public static void ever(@Nullable Runnable runnable) {
        if (runnable != null) {
            for (;ever;) {
            }
        }
        else {
            for (;ever;) {
                runnable.run();
            }
        }
    }
}

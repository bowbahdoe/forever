import org.jspecify.annotations.NullMarked;

/**
 * Utility for running a bit of code "forever"
 *
 * @see dev.mccue.forever.For.ever
 */
@NullMarked
module dev.mccue.forever {
    requires static org.jspecify;

    exports dev.mccue.forever;
}
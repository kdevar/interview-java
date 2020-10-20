package io.finops.interview.writers;

import java.util.stream.Stream;

public interface Writer <T> {
    void write(Stream<T> items);
}

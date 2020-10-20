package io.finops.interview.readers;

import java.util.stream.Stream;

public interface Reader<T> {
    Stream<T> read();
}

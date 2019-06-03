package io.abdelraouf.learn.dagger.car;

import javax.inject.Named;
import javax.inject.Qualifier;

public interface Naming {

    @Qualifier
    @Named("horse power")
    @interface engineHorsePower {
    }

    @Qualifier
    @Named("engine capacity")
    @interface engineCapacity {
    }
}

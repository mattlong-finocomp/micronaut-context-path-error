package com.example

import io.micronaut.context.annotation.Property
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest(rebuildContext = true)
class MicronautContextPathErrorSpec extends Specification {

    @Property(name = "micronaut.server.context-path", value = "")
    void 'test it works'() {
        expect:
        1 == 1
    }

}

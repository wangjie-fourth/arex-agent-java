package io.arex.inst.httpservlet.inst;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterModuleInstrumentationV5Test {
    FilterModuleInstrumentationV5 module = new FilterModuleInstrumentationV5();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void instrumentationTypes() {
        assertEquals(1, module.instrumentationTypes().size());
    }
}
package com.koto.core.presentation.ui

import org.junit.Test
import kotlin.test.assertEquals


class RunDataFormattersKtTest {

    @Test
    fun toFormattedKm() {
        assertEquals("123.5 km", 123.456.toFormattedKm())
        assertEquals("123.4 km", 123.444.toFormattedKm())
        assertEquals("123.0 km", 123.0.toFormattedKm())
        assertEquals("0.0 km", 0.0.toFormattedKm())
        assertEquals("-1.2 km", (-1.2).toFormattedKm())
    }
}

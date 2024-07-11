package com.koto.auth.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotEqualTo
import org.junit.jupiter.api.Test

class UserDataValidatorTest {

    @Test
    fun testAddingTwoNumbers() {
        assertThat(1 + 1).isEqualTo(2);
        assertThat(1 + 1).isNotEqualTo(3);
    }
}

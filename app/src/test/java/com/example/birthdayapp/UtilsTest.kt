package com.example.birthdayapp

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*

@RunWith(JUnit4::class)
class UtilsTest {

    @Test
    fun returnsValidAge() {
        return assertEquals(28, Utils().getCurrentAge(1994))
    }
}
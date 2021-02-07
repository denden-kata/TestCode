package com.example.testcode

import junit.framework.TestCase
import org.junit.Test
import org.assertj.core.api.Assertions.*

/**
 * 実測値(actual)と期待値(expected)を用意してテストしてみる
 **/

class CalculateTest : TestCase() {

    fun testSum() {}

    @Test
    fun testMultiplyで掛け算の結果を確かめる() {
        val calculate = Calculate()
        val actual = calculate.multiply(2, 3)
        val expected = 6

        assertThat(actual).isEqualTo(expected)
    }
}
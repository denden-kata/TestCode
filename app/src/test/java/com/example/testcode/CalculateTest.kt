package com.example.testcode

import junit.framework.TestCase
import org.junit.Test
import org.assertj.core.api.Assertions.*

/**
 * 実測値(actual)と期待値(expected)を用意してテストしてみる
 **/

class CalculateTest : TestCase() {

    @Test
    fun testSumで足し算の結果を確かめる() {
        val calculate = Calculate()
        val actual = calculate.sum(2, 3)
        val expected = 5
        val unexpected = 6

        assertThat(actual).isEqualTo(expected)
        assertThat(actual).isNotEqualTo(unexpected)
    }

    @Test
    fun testMultiplyで掛け算の結果を確かめる() {
        val calculate = Calculate()
        val actual = calculate.multiply(2, 3)
        val expected = 6
        val unexpected = 5

        assertThat(actual).isEqualTo(expected)
        assertThat(actual).isNotEqualTo(unexpected)
    }
}
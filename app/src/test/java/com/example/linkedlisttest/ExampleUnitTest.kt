package com.example.linkedlisttest

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var linkedList: LinkedList<Int>

    @Before
    fun setUp() {
        linkedList = LinkedListImpl()
    }

    @Test
    fun oneTest() {
        val one = 1
        val two = 2

        linkedList.add(one)
        linkedList.add(two)

        assertEquals(linkedList.get(0), one)
        assertEquals(linkedList.get(1), two)
        assertEquals(linkedList.length, 2)
    }

    @Test
    fun twoTest() {
        val one = 1
        val two = 2
        val three = 3

        linkedList.add(one)
        linkedList.add(two)
        linkedList.add(three)

        assertEquals(linkedList.get(0), one)
        assertEquals(linkedList.length, 3)

        linkedList.remove(0)

        assertEquals(linkedList.get(0), two)
        assertEquals(linkedList.length, 2)
    }
}
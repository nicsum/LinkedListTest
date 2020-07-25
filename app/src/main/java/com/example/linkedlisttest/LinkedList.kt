package com.example.linkedlisttest

interface  LinkedList<T> {

    fun get(index: Int): Int
    fun add(item: T)
    fun remove(index: Int)
    fun clear()
    fun replace(index: Int, item: T)

    val length: Int
}
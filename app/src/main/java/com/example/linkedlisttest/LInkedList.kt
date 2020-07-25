package com.example.linkedlisttest

interface  LinkedList<T> {

    fun add(item: T)
    fun remove(index: Int)
    fun clear()
    fun replace(index: Int, item: T)
}
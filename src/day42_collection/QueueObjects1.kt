package day42_collection

import java.util.*


object QueueObjects1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val queue = PriorityQueue<Int>()
        queue.add(2)
        queue.add(10)
        queue.add(8)
        queue.add(1)
        queue.add(1)
        //queue.add(null);   // PriorityQueue does NOT accept NULL values
        println(queue) // The insertion order is not reserved. It is a random order.
        //queue.get(0); --> the get() method is in List interface, that is why I canNOT use it.
        queue.offer(30) // same as add(); method
        println(queue)
    }
}
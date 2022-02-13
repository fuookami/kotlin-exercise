package cp1

fun main(args: Array<String>) {
    println("a\ta^2\ta^3");
    for (i in 1..4) {
        println("$i\t${i * i}\t${i * i * i}");
    }
}

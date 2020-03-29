allprojects {

    tasks.withType<Test> {
        addTestOutputListener { descriptor, event ->
            val println: (Any) -> Unit = when (event.destination) {
                TestOutputEvent.Destination.StdErr -> System.err::println
                else -> System.out::println
            }
            println("${descriptor.name}: ${event.message}")
        }
    }

}
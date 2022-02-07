package mohsen.coder

import kotlin.test.Test
import kotlin.test.assertContains

class HelloWorldTest {

    @Test
    fun testSayHello(){
        val helloWorld = HelloWorld("Mohsen")
        assertContains(helloWorld.sayHello(), "Hello Mohsen")
    }

}
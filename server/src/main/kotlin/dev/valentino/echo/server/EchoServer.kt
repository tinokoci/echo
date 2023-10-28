package dev.valentino.echo.server

import java.net.ServerSocket

class EchoServer {

    private val port = 10000;

    fun main(args: Array<String>) {
        println(args);
        val serverSocket = ServerSocket(port);
        println("Started server on port $port");
    }

    fun getPortFromArgs(args: Array<String>) {
    }
}

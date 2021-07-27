package com.tomnocon.users

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UsersRepositoryApplication

fun main(args: Array<String>) {
	runApplication<UsersRepositoryApplication>(*args)
}

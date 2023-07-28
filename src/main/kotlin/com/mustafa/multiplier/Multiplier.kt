package com.mustafa.multiplier

import io.micronaut.core.annotation.NonBlocking
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import reactor.core.publisher.Mono
import java.util.concurrent.atomic.AtomicInteger


@Controller("/multiply")
class Multiplier {
    private val at = AtomicInteger()

    @Get
    @NonBlocking
    fun multiply(@QueryValue("num1") num1: Double, @QueryValue("num2") num2: Double): Mono<Double> {
        return Mono.just(num1*num2)
    }

}
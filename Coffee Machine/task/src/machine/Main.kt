package machine

import java.util.*

enum class State(var stage: Int) {
    ACTION(0), COFFEE(0), FILL(0), EXIT(0)
}

class CoffeeMachine() {

    var state: State = State.ACTION

    var currentWater = 400
    var currentMilk = 540
    var currentCoffeeBeans = 120
    var currentCups = 9
    var currentMoney = 550

    init {
        printAction()
    }

    private fun printAction() {
        println("\nWrite action (buy, fill, take, remaining, exit):\n")
    }

    fun process(input: String) {

        when (state) {
            State.ACTION -> when (input) {
                "buy" -> buy()
                "fill" -> fillState()
                "take" -> take()
                "remaining" -> state()
                "exit" -> state = State.EXIT
            }
            State.COFFEE -> when(input) {
                "1" -> buyEspresso()
                "2" -> buyLatte()
                "3" -> buyCappuccino()
                "back" -> back()
            }
            State.FILL -> fill(input)
            else -> return
        }

    }

    private fun back() {
        state = State.ACTION
        printAction()
    }

    fun buy() {
        state = State.COFFEE

        print("What do you want to buy? ")
        print("1 - espresso, ")
        print("2 - latte, ")
        println("3 - cappuccino, ")
        println("back - to main menu: ")
    }

    fun buyCappuccino() {
        val w = 200
        val m = 100
        val b = 12
        val price = 6

        makeCoffee(w, m, b, price)
    }

    fun buyLatte() {
        val w = 350
        val m = 75
        val b = 20
        val price = 7

        makeCoffee(w, m, b, price)
    }

    fun buyEspresso() {
        val w = 250
        val m = 0
        val b = 16
        val price = 4

        makeCoffee(w, m, b, price)
    }

    fun makeCoffee(w: Int, m: Int, b: Int, price: Int) {
        var res = true
        when {
            currentWater < w -> {
                print("Sorry not enough water!")
                res = false
            }
            currentMilk < m -> {
                print("Sorry not enough milk!")
                res = false
            }
            currentCoffeeBeans < b -> {
                print("Sorry not enough coffee beans!")
                res = false
            }
            else -> {
                print("I have enough resources, making you a coffee!")
            }
        }

        state = State.ACTION

        if (!res)
            return

        currentWater -= w
        currentMilk -= m
        currentCoffeeBeans -= b
        currentMoney += price

        currentCups -= 1

        printAction()
    }

    private fun fillState() {
        state = State.FILL
        println("Write how many ml of water do you want to add: ")
    }

    fun fill(input: String) {
        when (state.stage) {
            0 -> {
                currentWater += input.toInt()
                println("Write how many ml of milk do you want to add: ")
                state.stage = 1
            }
            1 -> {
                currentMilk += input.toInt()
                println("Write how many grams of coffee beans do you want to add: ")
                state.stage = 2
            }
            2 -> {
                currentCoffeeBeans += input.toInt()
                println("Write how many disposable cups of coffee do you want to add: ")
                state.stage = 3
            }
            3 -> {
                currentCups += input.toInt()
                state.stage = 0
                state = State.ACTION

                printAction()
            }
        }
    }

    fun take() {
        println("I gave you \$$currentMoney")

        currentMoney = 0
    }

    fun state() {
        println()
        println("The coffee machine has:")
        println("$currentWater of water")
        println("$currentMilk of milk")
        println("$currentCoffeeBeans of coffee beans")
        println("$currentCups of disposable cups")
        println("\$$currentMoney of money")
        println()

//        state == State.ACTION
        printAction()
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val coffeeMachine = CoffeeMachine()

    while (coffeeMachine.state != State.EXIT) {
        coffeeMachine.process(scanner.next())
    }
}
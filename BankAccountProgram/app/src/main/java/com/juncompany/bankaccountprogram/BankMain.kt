package com.juncompany.bankaccountprogram

fun main(){

    val denisesBankAccount = BankAccount("Denis",1338.20)

    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(1200.00)
    denisesBankAccount.deposit(3000.0)
    denisesBankAccount.withdraw(4000.00)
    denisesBankAccount.displayTransactionHistory()

    println("${denisesBankAccount.accountHolder}`s balance is ${denisesBankAccount.balance}")
}
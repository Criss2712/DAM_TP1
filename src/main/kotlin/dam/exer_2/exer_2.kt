package org.example.dam.exer_2

fun main() {
    while(true){
        println("\n+++++++ Console-Based Calculator +++++++")
        print("1. Escolher Operação" + "\n2. Sair" + "\nOpção: ")
        val option = readln()

        if(option == "2"){
            println("A terminar calculadora...")
            break
        }

        if(option != "1"){
            println("Opção Inválida! Insira apenas 1 ou 2!")
            continue
        }

        val validOperators = listOf("+", "-", "*", "/", "&&", "||", "!", "shl", "shr")
        var operator: String
        while(true){
            print("\nDas seguintes operações, insira o símbolo da que pretende realizar:"
                    + "\nOperações Aritméticas: +, -, *, /"
                    + "\nOperações Booleanas: &&, ||, !"
                    + "\nOperações Binárias: shl, shr"
                    + "\nOperação: ")
            operator = readln()

            if(operator !in validOperators){
                println("Operador Inválido! Insira um operador presente nas opções apresentadas!")
                continue
            }
            break
        }

        var num1 = 0
        var num2 = 0

        if (operator != "!"){
            while(true){
                try{
                    print("Insira o primeiro número: ")
                    num1 = readln().toInt()
                    break
                }catch(e:NumberFormatException){
                    println("Input Inválido! Insira apenas valores numéricos!")
                }
            }
            while(true){
                try{
                    print("Insira o segundo número: ")
                    num2 = readln().toInt()
                    break
                }catch(e:NumberFormatException){
                    println("Input Inválido! Insira apenas valores numéricos!")
                }
            }
        }

        val result: Any = when(operator){
            //Aritméticas
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0){
                    print("Erro! Divisão por 0!")
                } else {
                    num1 / num2
                }
            }
            //Booleanas
            "&&" -> (num1 != 0) && (num2 != 0)
            "||" -> (num1 != 0) || (num2 != 0)
            "!"  -> {
                var num3: Int
                while(true){
                    try {
                        print("Insira um número: ")
                        num3 = readln().toInt()
                        break
                    }catch(e:NumberFormatException){
                        println("Input Inválido! Insira apenas valores numéricos!")
                    }
                }
                num3 == 0
            }
            //Binárias
            "shl" -> num1 shl num2
            "shr" -> num1 shr num2

            else -> ""
        }

        println("\n+++++++ Resultados +++++++"
        + "\nDecimal: ${if(result is Int) result else "(n/a)"}"
        + "\nHexadecimal: ${if(result is Int) result.toString(16).uppercase() else "(n/a)" }"
        + "\nBoolean: ${if(result is Boolean) result else "(n/a)"}")
    }
}
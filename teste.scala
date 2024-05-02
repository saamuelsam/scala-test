//Leia um numero inteiro > 0 e determine se ele eh par ou impar

var valor = readLine("Entre com um numero maior que 0: ").toInt

var resto = valor % 2

if (resto == 0) s"O numero $valor eh par "
else s"O numeroo $valor eh impar"

/* ------------------------------------------------------------------------------------------------ */

//Leia dois numeros inteiros a e b e determine se a > b

var a = readLine("Entre com um numero: ").toInt
var b = readLine("Entre com outro numero: ").toInt

if(a > b) s"O numero $a eh maio que $b" else s"O numero $a eh menor ou igual a $b"
/* ------------------------------------------------------------------------------------------------- */

//Escreva abaixo um trecho de código para verificar em qual parte quadrante do plano cartesiano um ponto (x, y) se encontra

var x = readLine("Entre com o valor de x: ").toInt
var y = readLine("Entre com o valor de y: ").toInt

if(x > 0 && y > 0) s"O ponto ($x, $y) esta no primeiro quadrante"
else if(x < 0 && y > 0) s"O ponto ($x, $y) esta no segundo quadrante"
else if(x < 0 && y < 0) s"O ponto ($x, $y) esta no terceiro quadrante"
else if(x > 0 && y < 0) s"O ponto ($x, $y) esta no quarto quadrante"
else s"O ponto ($x, $y) esta na origem"

/* ------------------------------------------------------------------------------------------------- */

def mesNome(x: Int) = x match {
  case 1 => "Janeiro"
  case 2 => "Fevereiro"
  case 3 => "Março"
  case 4 => "Abril"
  case 5 => "Maio"
  case 6 => "Junho"
  case 7 => "Julho"
  case 8 => "Agosto"
  case 9 => "Setembro"
  case 10 => "Outubro"
  case 11 => "Novembro"
  case 12 => "Dezembro"
  case _ => "Mes invalido"
}

/* ------------------------------------------------------------------------ */

def oqEhIsso(algo:Any):String = algo match {
  case 1 => "Inteiro"
  case 1.0 => "Double"
  case "1" => "String"
  case true => "Boolean"
  case List(_, _, _) => "Lista com 3 elementos"
  case _ => "Outro tipo"
}

/* -------------------------------------------------------------------------- */

//tratameto de erros com try catch

def converter(n:String):Int = try {
  n.toInt
} catch {
  case e: NumberFormatException => 0
}

/* -------------------------------------------------------------------------- */

def converter(n:String):Int = try {
  n.toInt
} catch {
  case _: Throwable => -1
}

/* -------------------------------------------------------------------------- */

def convertInt(s: String):Option[Int] = try {
 Some(s.toInt) // Some é um tipo de dado que indica que o valor é válido
} catch { // catch é um bloco que captura exceções
 case e: NumberFormatException => None // None é um tipo de dado que indica que o valor é inválido
}

/* -------------------------------------------------------------------------- */
//Loop for for yield

for(i: Int <- 1 to 10) println("Deu certo!")
/* -------------------------------------------- */

val original = List(1, 2, 3, 4, 5)

import collection.mutable.MutableList

val trandformed = new MutableList[Int]

/* formas de fazer */
for(i:Int <- 0 until original.size) trandformed += original(i) * 2 //transformed é uma nova lista

for(i <- original) transformed += i * 2 //transformed é uma nova lista

for (i <- original) yield i * 2 //retorna uma nova lista

for (i <- List(1, 2, 3, 4, 5); j<- List(1, 2, 3, 4, 5)) yield i*j //retorna uma lista com o produto de todos os elementos de ambas as listas

/* ---------------------------------------------------------- */
//Programação funcional

def printArgs(args: Array[String]): Unit = {
  var i = 0
  while(i < args.length) {
    println(args(i))
    i += 1
  }
}//imprime os elementos do array

//funcional
def funcionalPrintArgs(args: Array[String]): Unit = {
  for (i <- args) 
  println(i)
}//imprime os elementos do array

def funcional(args: Array[String]) = {
  args.mkString("\n")
}//retorna uma string com os elementos do array separados por \n

/* ---------------------------------------------------------- */
//Problema na URI
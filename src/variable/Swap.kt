package variable

fun main() {
    println("MENUKAR INPUT")
    print("Masukkan input pertama: ")
    var input1 = readln()
    print("Menukarkan input kedua: ")
    var input2 = readln()

    val temp = input1
    input1 = input2
    input2 = temp
    println("HASIL MENUKAR INPUT\n" +
            "input1: $input1\n" +
            "input2: $input2")
}
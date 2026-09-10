package function

fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b: Double): Double {
    return a - b
}

fun kali(a: Double, b: Double): Double {
    return a * b
}

fun bagi(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    println("=== KALKULATOR SEDERHANA ===")

    print("Masukkan angka pertama: ")
    val a = readln().toDouble()

    print("Masukkan angka kedua: ")
    val b = readln().toDouble()

    println()
    println("Pilih operasi:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")

    print("Masukkan pilihan: ")
    val pilihan = readln().toInt()

    println()

    when (pilihan) {
        1 -> {
            val hasil = tambah(a, b)
            println("Hasil: $hasil")
        }

        2 -> {
            val hasil = kurang(a, b)
            println("Hasil: $hasil")
        }

        3 -> {
            val hasil = kali(a, b)
            println("Hasil: $hasil")
        }

        4 -> {
            if (b == 0.0) {
                println("Error: Tidak dapat melakukan pembagian dengan nol!")
            } else {
                val hasil = bagi(a, b)
                println("Hasil: $hasil")
            }
        }

        else -> {
            println("Pilihan operasi tidak valid!")
        }
    }
}

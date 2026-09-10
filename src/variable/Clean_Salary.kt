package variable

fun main() {
    val namaPegawai = "Budi"
    val gajiPokok = 3000000.0
    val tunjangan = 500000.0
    val uangLembur = 300000.0
    val potongan = 200000.0

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("=== GAJI PEGAWAI ===")
    println("Nama pegawai : $namaPegawai")
    println("Gaji pokok   : Rp$gajiPokok")
    println("Tunjangan    : Rp$tunjangan")
    println("Uang lembur  : Rp$uangLembur")
    println("Gaji kotor   : Rp$gajiKotor")
    println("Potongan     : Rp$potongan")
    println("Gaji bersih  : Rp$gajiBersih")
}

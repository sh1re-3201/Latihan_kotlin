package variable

fun main() {
    val namaMahasiswa = "Budi"

    val tugas = 80.0
    val kuis = 85.0
    val uts = 75.0
    val uas = 90.0

    val nilaiAkhir = (tugas * 0.25) +
            (kuis * 0.15) +
            (uts * 0.25) +
            (uas * 0.35)

    println("=== NILAI AKHIR MAHASISWA ===")
    println("Nama mahasiswa : $namaMahasiswa")
    println("Nilai tugas    : $tugas")
    println("Nilai kuis     : $kuis")
    println("Nilai UTS      : $uts")
    println("Nilai UAS      : $uas")
    println("Nilai akhir    : $nilaiAkhir")
}

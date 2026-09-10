package variable

fun main() {
    println("VAL-VAR")
    print("Masukkan Nama Mahasiswa: ")
    val namaMahasiswa = readln()
    print("Masukkan NIM: ")
    val NIM = readln()
    print("Masukkan Semester: ")
    var semester = readln()
    print("Masukkan IPK: ")
    var ipk = readln()

    println("NAMA: $namaMahasiswa\n" +
            "NIM: $NIM\n" +
            "Semester: $semester\n" +
            "IPK: $ipk\n\n")

    println("Mengubah Semester dan IPK: \n")
    print("Masukkan Semester baru: ")
    semester = readln()
    print("Masukkan IPK baru: ")
    ipk = readln()

    println("NAMA: $namaMahasiswa\n" +
            "NIM: $NIM\n" +
            "Semester: $semester\n" +
            "IPK: $ipk")

}
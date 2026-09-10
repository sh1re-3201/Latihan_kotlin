package variable

fun main() {
    val namaBarang = "Buku"
    val hargaBarang = 15000.0
    val jumlahBarang = 3
    val diskon = 10.0

    val subtotal = hargaBarang * jumlahBarang
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println("=== TOTAL BELANJA ===")
    println("Nama barang   : $namaBarang")
    println("Harga barang  : Rp$hargaBarang")
    println("Jumlah barang : $jumlahBarang")
    println("Diskon        : $diskon%")
    println("Subtotal      : Rp$subtotal")
    println("Potongan      : Rp$potongan")
    println("Total bayar   : Rp$totalBayar")
}

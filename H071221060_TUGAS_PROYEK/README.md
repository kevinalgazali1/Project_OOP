# Main.java

`Main.java` adalah kelas yang berisi metode `main` untuk menjalankan aplikasi.

## Metode

- `main(String[] args)`: Metode utama yang menjalankan `App.main(args)` untuk memulai aplikasi.

# config

terdapat 1 class pada file ini yaitu `DBConnector.java`

## DBConnector.java

`DBConnector.java` adalah kelas yang bertanggung jawab untuk membuat koneksi ke database menggunakan JDBC.

### Metode

- `getConnection()`: Membuat koneksi dengan database menggunakan URL, username, dan password yang telah ditentukan.

# DataAccesor

terdapat 1 class pada file ini yaitu `DataAccessor.java`

##  DataAccessor.java

`DataAccessor.java` adalah kelas yang bertanggung jawab untuk mengelola koneksi, pernyataan, dan hasil set data dalam operasi database.

### Metode

- `closeConnection()`: Menutup koneksi, pernyataan, dan hasil set data.
- `executeQuery(String query)`: Mengeksekusi pernyataan SQL untuk mengambil data dari database.
- `executeUpdate(String query)`: Mengeksekusi pernyataan SQL untuk memperbarui data dalam database.

# Layouts

terdapat 5 class pada file ini yaitu `App.java` , `ProductReader.java` , `ProductWriter.java` , 
`ProductEditor.java` , dan `ProductDeleter.java`

## ProductReader.java

`ProductReader.java` adalah kelas yang bertanggung jawab untuk membaca dan mencetak data dari tabel `tb_product` ke konsol.

### Metode

- `readData()`: Mengeksekusi pernyataan SQL untuk mengambil data dari tabel `tb_product` dan mencetaknya ke konsol.

## ProductEditor.java

`ProductEditor.java` adalah kelas yang bertanggung jawab untuk mengubah data dalam tabel `tb_product`.

### Metode

- `editData()`: Meminta input pengguna untuk ID data yang akan diubah, serta nilai baru untuk NAMA, HARGA, dan JUMLAH. Mengeksekusi pernyataan SQL untuk mengubah data dalam tabel `tb_product`.

## ProductWriter.java

`ProductWriter.java` adalah kelas yang bertanggung jawab untuk memasukkan data baru ke dalam tabel `tb_product`.

### Metode

- `insertData()`: Meminta pengguna untuk memasukkan data baru, kemudian mengeksekusi pernyataan SQL untuk memasukkan data tersebut ke dalam tabel `tb_product`.

## ProductDeleter.java

`ProductDeleter.java` adalah kelas yang bertanggung jawab untuk menghapus data dari tabel `tb_product`.

### Metode

- `deleteData()`: Meminta input pengguna untuk ID data yang akan dihapus, kemudian mengeksekusi pernyataan SQL untuk menghapus data dari tabel `tb_product`.

## App.java

`App.java` adalah kelas utama yang berfungsi sebagai antarmuka pengguna untuk mengakses fitur-fitur CRUD pada tabel `tb_product`.

### Metode

- `main(String[] args)`: Metode utama yang berfungsi sebagai titik masuk program. Menampilkan menu pilihan dan menerima input pengguna untuk memilih operasi yang diinginkan.

# Models

terdapat 1 class dalam file ini yaitu `Product.java`

## Product.java

`Product.java` adalah kelas yang merepresentasikan objek produk dalam aplikasi.

### Properti

- `id`: ID produk.
- `name`: Nama produk.
- `price`: Harga produk.
- `stock`: Jumlah stok produk.

### Metode

- Metode setter dan getter untuk setiap properti.



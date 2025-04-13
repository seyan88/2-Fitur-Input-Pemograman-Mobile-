# 📱 Tugas 2 - Input Control Android

## 👤 Identitas 
- **Nama**: Sulastian Setiadi  
- **NIM**: 23552011342  
- **Kelas**: RP TIF CID A  

---

## 📌 Deskripsi Aplikasi
Aplikasi Android ini dibuat untuk menampilkan dan menghapus tanggal menggunakan kontrol input `DatePickerDialog` dan `AlertDialog`.

---

## ✅ Fitur yang Diimplementasikan
- 🗓️ **Date Picker** (Pemilihan Tanggal)
- ⚠️ **Alert Dialog** (Konfirmasi Hapus Tanggal)

---

## 🧩 Penjelasan Fitur dan Kode

## 🗓️ 1. Date Picker (Tanggal)
Menampilkan dialog pemilihan tanggal, lalu hasilnya ditampilkan di `TextView`.

```kotlin
fun showDatePicker(view: View) {
    val calendar = Calendar.getInstance()
    val tahun = calendar.get(Calendar.YEAR)
    val bulan = calendar.get(Calendar.MONTH)
    val hari = calendar.get(Calendar.DAY_OF_MONTH)

    val datePickerDialog = DatePickerDialog(
        this,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            val tanggal = "$dayOfMonth/${month + 1}/$year"
            tvTanggal.text = tanggal
        },
        tahun, bulan, hari
    )

    datePickerDialog.show()
}
```
## 📸 Screenshot Fitur Date Picker
![WhatsApp Image 2025-04-14 at 04 49 17_3ad72a70](https://github.com/user-attachments/assets/98aaef35-15bc-493f-93b4-11ccd310173a)


## ⚠️ 2. Alert Dialog (Hapus Tanggal)
Menampilkan dialog konfirmasi sebelum menghapus tanggal dari TextView.
```
fun hapusTanggal(view: View) {
    val alertDialog = AlertDialog.Builder(this)
        .setTitle("Konfirmasi")
        .setMessage("Apakah Anda yakin ingin menghapus tanggal?")
        .setPositiveButton("Ya") { _, _ ->
            tvTanggal.text = ""
        }
        .setNegativeButton("Batal", null)
        .create()

    alertDialog.show()
}
```
## 📸 Screenshot Fitur Alert Dialog
![WhatsApp Image 2025-04-14 at 04 49 18_dfb893cd](https://github.com/user-attachments/assets/0806e158-2ea9-4b19-b01e-9455030e4b1a)


## 🛠️ Teknologi yang Digunakan
Bahasa Pemrograman: Kotlin

IDE: Android Studio

Komponen UI:

DatePickerDialog

AlertDialog

TextView

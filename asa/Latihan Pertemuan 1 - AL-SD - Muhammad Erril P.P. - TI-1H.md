# Latihan Pertemuan 1
### Muhammad Erril Putra Pratidina
#### NIM: 2341720183
#### Kelas: TI 1H
##### 15-02-2024

## Soal
- Menampilkan deretan bilangan dari angka 1 sampai 15 kecuali angka 6 dan 10, angka ganjil dicetak dengan asterik “*”, angka genap dicetak sesuai bilangan aslinya.
	Contoh : * 2 * 4 * * 8 * * 12 * 14 *
- Permasalahan dibawah ini menggunakan konsep fungsi :
	- Menghitung rata-rata rating untuk setiap movie
	- Mencari movie yang memiliki rata-rata rating paling tinggi dan paling rendah
	- ![[Pasted image 20240215132118.png]]
## Jawaban
- Pseudocode untuk jawaban nomor 1:
	```
	for (int i = 1; i <= 15; i++) {
		if ( i== 6 || i == 10) {
			continue;
		} else if (i % 2 == 1) {
			print("* ");
		} else {
			print(i+" ");
		}
	}
	```

- Pseudocode untuk jawaban nomor 2:
	```
	short[] film = {1,2,3,4};
	int[][] rating = {{4,1,1},{3,1,2},{4,2,3,},{4,3,4}};
	double[] rata = new double[4];

	for (int i = 0; i < rating.length; i++) {
		double jumlah = 0;
		for (int j = 0; j < rating[i].length; j++) {
			jumlah += rating[i][j];
		}
		rata[i] = jumlah/3;
	}
	for (int i = 0; i < rata.length; i++) {
		println("rata-rata rating film ke-"+(i+1)+rata[i]);
	}
	int iTertinggi = 0;
	int iTerendah = 0;
	for (int i = 0; i < 3; i++) {
		if (rata[i]<rata[i+1]) {
			iTertinggi = i+1;
		}
	}

	for (int i = 0; i < 3; i++) {
		if (rata[i]>rata[i+1]) {
			iTerendah = i+1;
		}
	}
	println("Film dengan rata-rata rating terbesar adalah film ke-"+film[iTertinggi]);
	println("Film dengan rata-rata rating terendah adalah film ke-"+film[iTerendah]);
	```
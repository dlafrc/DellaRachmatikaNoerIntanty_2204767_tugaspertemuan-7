/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELLA
 */

class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode start() untuk mereset startTime ke waktu saat ini
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode stop() untuk menyetel endTime ke waktu saat ini
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode getElapsedTime() untuk mengembalikan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class Main {
    // Metode untuk melakukan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();

        // Memulai pengukuran waktu
        stopwatch.start();

        // Melakukan pengurutan menggunakan selection sort
        selectionSort(numbers);

        // Menghentikan pengukuran waktu
        stopwatch.stop();

        // Mendapatkan waktu yang telah berlalu dalam milidetik
        long elapsedTime = stopwatch.getElapsedTime();

        System.out.println("Waktu yang diperlukan untuk pengurutan 100.000 angka adalah " + elapsedTime + " milidetik");
    }
}
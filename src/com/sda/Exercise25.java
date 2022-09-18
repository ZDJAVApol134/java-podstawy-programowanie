package com.sda;

public class Exercise25 {

    //  Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący
    //  szyfr cezara (pl.wikipedia.org/wiki/Szyfr_Cezara)

    //  Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
    //  Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ

    public static void main(String[] args) {
        String encryptedValue = encrypt("ABCD ABCD", 2);
        String decryptedValue = decrypt("CDEF\"CDEF", 2);
        System.out.println("Encrypted value: " + encryptedValue);
        System.out.println("Decrypted value: " + decryptedValue);

    }

    public static String encrypt(String text, int key) {
        char[] chars = text.toCharArray();
        StringBuilder encryptedText = new StringBuilder();

        for (char c : chars) {
            int asciiValue = c + key;
            char temp = (char) asciiValue;
            encryptedText.append(temp);
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, int key) {
        char[] chars = text.toCharArray();
        StringBuilder encryptedText = new StringBuilder();

        for (char c : chars) {
            int asciiValue = c - key;
            char temp = (char) asciiValue;
            encryptedText.append(temp);
        }

        return encryptedText.toString();
    }

}

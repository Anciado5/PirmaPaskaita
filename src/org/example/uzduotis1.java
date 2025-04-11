package org.example;

import java.sql.SQLOutput;

public class uzduotis1 {
    public static void main(String[] args) {

//       1 uzduotis: Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus).
//       Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius atspausdintų tokį sakinį :
//       "Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".

        System.out.println("\n1 uzduotis ===========================>>>");
        String vardas = "Ana";
        String pavarde = "Gumoniene";
        int gimimometai = 2015;
        int siemetai = 2025;
        int amzius = siemetai - gimimometai;
        System.out.println("Aš esu " + vardas + " " + pavarde + ". Man yra " + amzius + " metų.");


//        2 uzduotis: Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės.
//        Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

        System.out.println("\n2 uzduotis ===========================>>>");
        int rndNum = (int) Math.round( Math.random() * 4);
        int rndNum2 = (int) Math.round( Math.random() * 4);
        System.out.println(rndNum + " " + rndNum2);
        if (rndNum == 0 || rndNum2 == 0)
            System.out.println("Dalyba is 0 negalima!");
        else if (rndNum > rndNum2){
            System.out.printf("%.2f", (double) rndNum / rndNum2);}
        else{
            System.out.printf("%.2f", (double) rndNum2 / rndNum);
            System.out.println();
            }


//        3 uzduotis: Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25.
//        Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

        System.out.println("\n3 uzduotis ===========================>>>");
        int rndNum3 = (int) Math.round( Math.random() * 25);
        int rndNum4 = (int) Math.round( Math.random() * 25);
        int rndNum5 = (int) Math.round( Math.random() * 25);
        System.out.println(rndNum3 + " " + rndNum4 + " " + rndNum5);
        if (rndNum4 > rndNum5 && rndNum4 < rndNum3 || rndNum4 < rndNum5 && rndNum4 > rndNum3){
            System.out.println("Vidurine reiksme yra " + rndNum4);
        }else if (rndNum3 > rndNum5 && rndNum3 < rndNum4 || rndNum3 < rndNum5 && rndNum3 > rndNum4){
            System.out.println("Vidurine reiksme yra " + rndNum3);
        }else{
            System.out.println("Vidurine reiksme yra " + rndNum5);
        }

//        4 uzduotis: Įvedami skaičiai - a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite ​Math.random()​ funkcija nuo 1 iki 10).
//        Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

        System.out.println("\n4 uzduotis ===========================>>>");
        int a = (int) Math.round( Math.random() * 9) + 1;
        int b = (int) Math.round( Math.random() * 9) + 1;
        int c = (int) Math.round( Math.random() * 9) + 1;
        System.out.println("a = " + a + "; " + "b = " + b + "; " + "c = " + c + ";");
        if (a + b > c && b + c > a && a + c > b){
            System.out.println("Galima sudaryti trikampi");
        }else{
            System.out.println("Trikampio sudaryti negalima");
        }


//        5 uzduotis: Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems reikšmes nuo 0 iki 2.
//        Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

        System.out.println("\n5 uzduotis ===========================>>>");
        int rnd1 = (int) Math.round( Math.random() * 2);
        int rnd2 = (int) Math.round( Math.random() * 2);
        int rnd3 = (int) Math.round( Math.random() * 2);
        int rnd4 = (int) Math.round( Math.random() * 2);
        System.out.println(rnd1 + " " + rnd2 + " " + rnd3 + " " + rnd4);
        int nuliai = 0;
        int vienetai = 0;
        int dvejetai = 0;
        if (rnd1 == 0)
            nuliai = nuliai + 1;
        if (rnd2 == 0)
            nuliai = nuliai + 1;
        if (rnd3 == 0)
            nuliai = nuliai + 1;
        if (rnd4 == 0)
            nuliai = nuliai + 1;
        System.out.println("Nuliu yra " + nuliai);
        if (rnd1 == 1)
            vienetai = vienetai + 1;
        if (rnd2 == 1)
            vienetai = vienetai + 1;
        if (rnd3 == 1)
            vienetai = vienetai + 1;
        if (rnd4 == 1)
            vienetai = vienetai + 1;
        System.out.println("Vienetu yra " + vienetai);
        if (rnd1 == 2)
            dvejetai = dvejetai + 1;
        if (rnd2 == 2)
            dvejetai = dvejetai + 1;
        if (rnd3 == 2)
            dvejetai = dvejetai + 1;
        if (rnd4 == 2)
            dvejetai = dvejetai + 1;
        System.out.println("Dvejetu yra " + dvejetai);


//        6 uzduotis: Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
//        Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0)

        System.out.println("\n6 uzduotis ===========================>>>");
        int skaicius1 = (int) Math.round( Math.random() * 20) - 10;
        int skaicius2 = (int) Math.round( Math.random() * 20) - 10;
        int skaicius3 = (int) Math.round( Math.random() * 20) - 10;
        System.out.println(skaicius1 + " " + skaicius2 + " " + skaicius3);
        if (skaicius1 < 0) {
            System.out.print("[" + skaicius1 + "]");
        }else if (skaicius1 == 0) {
            System.out.print("(" + skaicius1 + ")");
        }else{
            System.out.print("{" + skaicius1 + "}");
        };
        if (skaicius2 < 0) {
            System.out.print("[" + skaicius2 + "]");
        }else if (skaicius2 == 0) {
            System.out.print("(" + skaicius2 + ")");
        }else{
            System.out.print("{" + skaicius2 + "}");
        };
        if (skaicius3 < 0) {
            System.out.print("[" + skaicius3 + "]");
        }else if (skaicius3 == 0) {
            System.out.print("(" + skaicius3 + ")");
        }else{
            System.out.print("{" + skaicius3 + "}");
        }


//        7 uzduotis: Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000 vienetų- 4 % nuolaida.
//        Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama. Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000.

        System.out.println("\n\n7 uzduotis ===========================>>>");
        int zvakes1 = (int) Math.round( Math.random() * 2995) + 5;
        System.out.println("Parduotu zvakiu kiekis = " + zvakes1);
        if (zvakes1 > 2000){
            System.out.print("Zvakiu kaina su 4% nuolaida = ");
            System.out.printf("%.2f", (double) zvakes1 * 0.96);
        }else if (zvakes1 > 1000){
            System.out.print("Zvakiu kaina su 3% nuolaida = ");
            System.out.printf("%.2f", (double) zvakes1 * 0.97);
        }else{
            System.out.print("Zvakiu kaina be nuolaidos = ");
            System.out.println(zvakes1);
        }

//        8 uzduotis: Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
//        Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10 arba didesnės nei 90.
//        Abu vidurkius atspausdinkite. Rezultatus apvalinkite iki sveiko skaičiaus.


        System.out.println("\n\n8 uzduotis ===========================>>>");
        int kint1 = (int) Math.round( Math.random() * 100);
        int kint2 = (int) Math.round( Math.random() * 100);
        int kint3 = (int) Math.round( Math.random() * 100);
        System.out.println(kint1 + " " + kint2 + " " + kint3);
        int aritmVidurkis = (int) ((kint1 + kint2 + kint3)/3);
        System.out.print("Triju kintamuju aritmetinis vidurkis = ");
        System.out.println(aritmVidurkis);
        int vidurkioSuma = 0;
        int skaiciuKiekis = 0;
        if (kint1 >= 10 && kint1 < 90){
            vidurkioSuma = vidurkioSuma + kint1;
           // vidurkioSuma += kint1;
            skaiciuKiekis++;
        }
        if (kint2 >= 10 && kint2 < 90){
            vidurkioSuma = vidurkioSuma + kint2;
            skaiciuKiekis++;
        }
        if (kint3 >= 10 && kint3 < 90){
            vidurkioSuma = vidurkioSuma + kint3;
            skaiciuKiekis++;
        }
        System.out.println("Naujo vidurkio skaiciu kiekis = " + skaiciuKiekis);
        if (skaiciuKiekis == 0){
            System.out.println("Dalyba is nulio negalima!");
        }else{
        int naujasAritmVidurkis = vidurkioSuma/skaiciuKiekis;
        System.out.print("Naujas aritmetinis vidurkis = ");
        System.out.println(naujasAritmVidurkis);}

//        9 uzduotis: Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes. Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random().
//        Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės.
//        Skaičių pridėkite prie jau sugeneruoto laiko. Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.

        System.out.println("\n\n9 uzduotis ===========================>>>");
        int valandos = (int) Math.round( Math.random() * 23);
        int minutes = (int) Math.round( Math.random() * 59);
        int sekundes = (int) Math.round( Math.random() * 59);


        System.out.print("\nSenas laikrodis: ");
        if (valandos >=0 && valandos <10){
            System.out.print("0");
        }
        System.out.print(valandos);
        System.out.print(":");

        if (minutes >=0 && minutes <10){
            System.out.print("0");
        }
        System.out.print(minutes);
        System.out.print(":");

        if (sekundes >=0 && sekundes <10){
            System.out.print("0");
        }
        System.out.print(sekundes);

        int papildSek = (int) Math.round( Math.random() * 300);
        System.out.print("\nPapildomos sekundes: ");
        System.out.println(papildSek);

//        ==============================================================Naujas laikrodis
        sekundes +=papildSek;
        int perkMinKiek = sekundes/60;

        System.out.print("\nPerkeliamu minuciu kiekis: ");
        System.out.println(perkMinKiek);

        if (sekundes >= 60){
            minutes +=perkMinKiek;
            sekundes -=60 * perkMinKiek;
        }
        if (minutes >= 60){
            valandos +=1;
            minutes -=60;
        }
        if (valandos >= 24){
            valandos -=24;
        }
        System.out.print("Naujas laikrodis: ");
        if (valandos >=0 && valandos <10){
            System.out.print("0");
        }
        System.out.print(valandos);
        System.out.print(":");

        if (minutes >=0 && minutes <10){
            System.out.print("0");
        }
        System.out.print(minutes);
        System.out.print(":");

        if (sekundes >=0 && sekundes <10){
            System.out.print("0");
        }
        System.out.print(sekundes);

















































    }



















}

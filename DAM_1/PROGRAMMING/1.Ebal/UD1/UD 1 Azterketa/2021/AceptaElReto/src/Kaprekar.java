//https://www.aceptaelreto.com/problem/statement.php?id=100
//EL PRIMER NUMERO HACE BIEN, EL RESTO DA ERROR EL PROGRAMA

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int kont = 0;
		int beraAlDa, ondo, aldrebes;

		int vueltas = sc.nextInt();

		for (int i = 0; i < vueltas; i++) {

			kont = 1;

			num = sc.nextInt();

			if (num == 6174) {
				kont = 0;
			} else if (num == 0) {
				kont = 8;
			} else {
				while (num < 1000) {
					num *= 10;
				}

				aldrebes = txukunduAldrebes(num);

				ondo = txukunduOndo(num);

				beraAlDa = aldrebes - ondo;

				if (beraAlDa == 0) {

					kont = 8;
				} else {
					while (beraAlDa != 6174 && kont < 8) {

						kont++;
						aldrebes = txukunduAldrebes(beraAlDa);

						while (aldrebes < 1000) {
							aldrebes *= 10;
						}

						ondo = txukunduOndo(beraAlDa);

						beraAlDa = aldrebes - ondo;
					}
				}
			}
			System.out.println(kont);
		}
		sc.close();

	}

	public static int txukunduOndo(int num) {
		int d, a, ord;
		ord = 0;

		for (int i = 0; i <= 9; i++) {

			a = num;

			while (a > 0) {

				d = a % 10;

				if (d == i) {
					ord = (ord * 10) + d;
				}

				a /= 10;

			}

		}

		return ord;
	}

	public static int txukunduAldrebes(int num) {
		int d, a, ord;
		ord = 0;

		for (int i = 9; i >= 0; i--) {

			a = num;

			while (a > 0) {

				d = a % 10;

				if (d == i) {
					ord = (ord * 10) + d;
				}

				a /= 10;

			}

		}

		return ord;
	}
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos;
        numCasos = in.nextInt();
        for(int i = 0; i < numCasos; i++)
        {
            kaprekar();
        }
        
    }
    public static void kaprekar() {

        final int NUM_ITEMS = 4;
        int num[], numKop[];
        int numInt, numKopInt, erantzunaInt = 0, pasadak = 0;

        Scanner in = new Scanner(System.in);

        num = new int[NUM_ITEMS];
        numKop = new int[NUM_ITEMS];

        if (num.length > 0) {

            for (int i = 0; i < num.length; ++i) {
                num[i] = in.nextInt();
            }
        }
        in.close();

        Arrays.sort(num);
        System.arraycopy(num, 0, numKop, 0, num.length);

        reverse(numKop);
        numInt = (num[0] * 1000) + (num[1] * 100) + (num[2] * 10) + num[3];
        numKopInt = (numKop[0] * 1000) + (numKop[1] * 100) + (numKop[2] * 10) + numKop[3];

        while (erantzunaInt != 6174 && erantzunaInt >= 0) {
            if (numInt > numKopInt) {
                erantzunaInt = numInt - numKopInt;
            } else {
                erantzunaInt = numKopInt - numInt;
            }
            //erantzunaInt pasar a array
            if (erantzunaInt < 1000) {
                erantzunaInt = erantzunaInt * 10;
            }
            extractDigits(erantzunaInt, num);
            //ordenar ese array bien y al reves 
            Arrays.sort(num);
            for (int j = 0; j < num.length; j++) {
                numKop[j] = num[j];
            }
            reverse(numKop);
            numInt = (num[0] * 1000) + (num[1] * 100) + (num[2] * 10) + num[3];
            numKopInt = (numKop[0] * 1000) + (numKop[1] * 100) + (numKop[2] * 10) + numKop[3];
            //y seguir en el while hasta 6174
            pasadak++;
        }

        System.out.println(pasadak);

    }

    public static void reverse(int[] array) {
        int item1, item2, temp;
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            item1 = array[fIdx];
            item2 = array[bIdx];

            temp = item1;
            item1 = item2;
            item2 = temp;

            array[fIdx] = item1;
            array[bIdx] = item2;
        }
    }

    public static void extractDigits(int n, int erantzuna[]) {
        int i = 0;

        while (n > 0) {
            int digit = n % 10;
            erantzuna[i] = digit;
            i++;
            n = n / 10;
        }
    }*/
}

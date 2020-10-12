package com.company;

import java.io.*;
import java.util.*;

public class FileForWork {
static String path="part.txt";
static String pathSort="part_sorted.txt";
    public static void randomArr() throws IOException {
        final int n=10;
        Random rand=new Random();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=rand.nextInt(50)+1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        FileWriter fw = new FileWriter(path);
        fw.write(sb.toString());
        fw.close();
    }
    public static void readingArr(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        while (str != null) {
            System.out.print(str);
            str = br.readLine();
        }
        fr.close();
    }
    public static void sortArr() throws IOException, IllegalArgumentException {

        FileInputStream fin = new FileInputStream(path);
        Scanner sc = new Scanner(fin).useDelimiter("\\A");
        String res;
        if (sc.hasNext()) {
            res = sc.next();
        } else {
            res = "";
        }
        ;

        String strArr[] = res.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(numArr);
        FileWriter fw2 = new FileWriter(pathSort);
        fw2.write(Arrays.toString(numArr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", ""));
        fw2.close();
    }

}

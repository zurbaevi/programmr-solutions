package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Nika Zurbaevi
 */
public class StatementReverse {
    public static void main(String[] args) throws Exception {
        String[] strArray;
        String st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Statement:");
        st = br.readLine();
        System.out.println("The reverse is:");
        strArray = st.split(" ");
        ArrayList<String> lista = new ArrayList(Arrays.asList(strArray));
        Collections.reverse(lista);
        st = lista.get(0);
        lista.remove(0);
        for (String s : lista) {
            st = st + " " + s;
        }
        System.out.println(st);
    }
}

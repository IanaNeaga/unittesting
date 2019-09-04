package com.sda.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Anotarea indica faptul ca aceasta clasa de test
 * se va rula cu un runner specific (Parameterized.class)
 */
@RunWith(Parameterized.class)
public class CalculatorTestParametrizat {

    private Calculator target=new Calculator(0,0);

    /*
    pentru fiecare parametru care va fi preluat dintr-un array
    de input trebuie salvata valoarea intr-o variabila de acel
    tip. Mecanism obtinut cu anotarea
    @Parameterized.Parameter(<indexul din array al valorii dorite>)
     */
    @Parameterized.Parameter(0)
    public int parametru1;
    @Parameterized.Parameter(1)
    public int parametru2;
    @Parameterized.Parameter(2)
    public int parametru3;

    /*
    avem nevoie de o metoda publica si statica, care sa intoarca
    o colectie de array-uri de tipul care trebuie testat.
    -am nevoie de colectie pt ca imi trebuie implementata interfata
    Iterable (in spate trebuie sa imi construiasca un iterator de array-uri)
    -e nevoie sa fie statica pt a nu depinde de clasa de test (nu trebuie instantiata)
    se anoteaza cu @Parameters pt a-i indica runner-ului
    ca e sursa de date
     */

    @Parameterized.Parameters
    public static Collection<Integer[]> initializeInputParameters(){
        return Arrays.asList
                (new Integer[][] {
                        {1,2,3},
                        {2,3,5},
                        {123,698,821},
                        {1000,2500,3500},
                        {50_123,50_698,100_821},
                        {1,1,3}
                });
    }

    @Test
    public void aduna() {
        assertEquals(parametru3,target.aduna(parametru1,parametru2));
    }
}
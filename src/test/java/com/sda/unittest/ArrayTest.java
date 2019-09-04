package com.sda.unittest;

import org.junit.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

    private String[] target={"Ionel","Gigel","Dorel","Fanel"};

    /*
    Creati o metoda de test care verifica:
    -dimensiunea array-ului este de 4
    -array-ul contine valoarea "Dorel"
    -array-ul nu contine valoarea "Ion"

    utilizand metode din JUnit(folosind stream/for)

     */

    @Test
    public void testArray(){
//        int count=0;
//        boolean contineDorel=false;
//        boolean contineIon=false;
//        for(String temp:target){
//            count++;
//            if(temp.equals("Dorel")){
//                contineDorel=true;
//            }
//            if(temp.equals("Ion")){
//                contineIon=true;
//            }
//        }
//        assertEquals(4,count);
//        assertTrue("Nu contine Dorel",contineDorel);
//        assertFalse("Contine Ion",contineIon);

        testArraySize(target);
        boolean dorel=testArrayContainsName("Dorel");
        boolean ion=testArrayContainsName("Ion");

        assertTrue(dorel);
        assertFalse(ion);
    }

    private boolean testArrayContainsName(String name){
        boolean present= Stream.of(target)
                .filter(item->item.equals(name))
                .findAny()
                .isPresent();
        return present;

//        boolean isPresent= Arrays.asList(target)
//                .contains(name);

    }


//    private boolean testArrayContainsName(String name){
//        boolean present= Stream.of(target)
//                .anyMatch(item->item.equals(name));
//        return present;
//    }


    private int testArraySize(String[] target){
        return target.length;
    }

    @Test
    public void testArrayWithAssertJ(){
        assertThat(target).hasSize(4)
                .contains("Dorel")
                .doesNotContain("Ion");
    }

}

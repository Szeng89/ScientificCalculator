package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScienceCalc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScienceCalcTestingTest {
    @Test
    public void switchDisplayModeRotate(){
         ScienceCalc switchDisplayModeRotate = new ScienceCalc();
         assertEquals(4,switchDisplayModeRotate.);
    }
    @Test
    public void switchDisplayModeSet(){
        ScienceCalc switchDisplayModeSet = new ScienceCalc();
        assertEquals(4,switchDisplayModeSet.);
    }
    @Test
    public void mKey(){
        ScienceCalc mKey = new ScienceCalc();
        assertEquals(4,mKey.);
    }
    @Test
    public void mcKey(){
        ScienceCalc mcKey = new ScienceCalc();
        assertEquals(4,mcKey.);
    }
    @Test
    public void mrcKey(){
        ScienceCalc mrcKey = new ScienceCalc();
        assertEquals(4,mrcKey.);
    }
    @Test
    public void sine() {
        ScienceCalc sine = new ScienceCalc();
        assertEquals(-0.9589242746631385, sine.getSine(),0.0001);
    }
    @Test
    public void cosine(){
        ScienceCalc cosine = new ScienceCalc();
        assertEquals(4,cosine.getCosine() ,0.0001);
    }
    @Test
    public void tangent(){
        ScienceCalc tangent = new ScienceCalc();
        assertEquals(4,tangent.getTangent() ,0.0001);
    }
    @Test
    public void sineDeg() {
        ScienceCalc sineDeg = new ScienceCalc();
        assertEquals(-0.9589242746631385, sineDeg.getSineDeg(),0.0001);
    }
    @Test
    public void cosineDeg(){
        ScienceCalc cosineDeg = new ScienceCalc();
        assertEquals(4,cosineDeg.getCosineDeg() ,0.0001);
    }
    @Test
    public void tangentDeg(){
        ScienceCalc tangentDeg = new ScienceCalc();
        assertEquals(4,tangentDeg.getTangentDeg() ,0.0001);
    }
    @Test
    public void inverseSine(){
        ScienceCalc inverseSine = new ScienceCalc();
        assertEquals(4,inverseSine. ,0.0001);
    }
    @Test
    public void inverseCoSine(){
        ScienceCalc inverseCoSine = new ScienceCalc();
        assertEquals(4,inverseCoSine. ,0.0001);
    }
    @Test
    public void inverseTangent() {
        ScienceCalc inverseTangent = new ScienceCalc();
        assertEquals(4, inverseTangent. ,0.0001);
    }
    @Test
    public void switchUnitModeRotate() {
        ScienceCalc switchUnitModeRotate = new ScienceCalc();
        assertEquals(4, switchUnitModeRotate.);
    }
    @Test
    public void switchUnitModeSet() {
        ScienceCalc switchUnitModeSet = new ScienceCalc();
        assertEquals(4, switchUnitModeSet.);
    }
    @Test
    public void log() {
        ScienceCalc log = new ScienceCalc();
        assertEquals(4, log.);
    }
    @Test
    public void invLog() {
        ScienceCalc invLog = new ScienceCalc();
        assertEquals(4, invLog.);
    }
    @Test
    public void naturalLog() {
        ScienceCalc naturalLog = new ScienceCalc();
        assertEquals(4, naturalLog.);
    }
    @Test
    public void factorial() {
        ScienceCalc factorial = new ScienceCalc();
        assertEquals(4, factorial.);
    }
}
import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimalTest() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("MCMLXIV"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("XIXIXIXI"), 42);
        assertEquals(RomanToDecimal.romanToDecimal("VIVI"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("CCLIX"), 259);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("MCMLXXXIII"), 1983);
        assertEquals(RomanToDecimal.romanToDecimal("MXXI"), 1021);
        assertEquals(RomanToDecimal.romanToDecimal("DXXI"), 521);
        assertEquals(RomanToDecimal.romanToDecimal("MCMXCIV"), 1994);
        assertEquals(RomanToDecimal.romanToDecimal("CIX"), 109);
        assertEquals(RomanToDecimal.romanToDecimal("MXC"), 1090);
        assertEquals(RomanToDecimal.romanToDecimal("IC"), 101);
        assertEquals(RomanToDecimal.romanToDecimal("HAHA"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("MMMI"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MMMI"), 3001);
        assertEquals(RomanToDecimal.romanToDecimal("LXIIC"), 162);
        assertEquals(RomanToDecimal.romanToDecimal("LXIID"), 562);
        assertEquals(RomanToDecimal.romanToDecimal("LXIIG"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("IIIIIV"), 8);
        assertEquals(RomanToDecimal.romanToDecimal("_IV"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("XIIX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("IXXI"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("XIXI"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("CIXIX"), 120);
        assertEquals(RomanToDecimal.romanToDecimal("*IV*"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("IIIIII"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("XC_R"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MLC"), 1150);
        assertEquals(RomanToDecimal.romanToDecimal("VVIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("VIVV"), 14);
    }
}
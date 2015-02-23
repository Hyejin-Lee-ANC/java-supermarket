package com.myCo.supermarket;

import static org.junit.Assert.*;
import org.junit.*;

public class SupermarketTest {
  @Test public void checkProvidedOutput() {
    Supermarket sm = new Supermarket();
    assertEquals(60, sm.checkout("AAA"));
    assertEquals(240, sm.checkout("ABBACBBAB"));
    assertEquals(120, sm.checkout("ABCA"));
  }
}

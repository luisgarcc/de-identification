/*
 * (C) Copyright IBM Corp. 2016,2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.ibm.whc.deid.providers.identifiers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HospitalIdentifierTest {
  @Test
  public void testIdentifier() {
    Identifier identifier = new HospitalIdentifier();

    String hospitalName = "York Hospital";
    assertTrue(identifier.isOfThisType(hospitalName));

    hospitalName = "york hospital";
    assertTrue(identifier.isOfThisType(hospitalName));
  }

  @Test
  public void testIdentifierGreek() {
    Identifier identifier = new HospitalIdentifier();

    String hospitalName = "ΠΕΠΑΓΝΗ";
    assertTrue(identifier.isOfThisType(hospitalName));
  }
}

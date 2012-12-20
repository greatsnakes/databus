package com.linkedin.databus.test.relay;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.linkedin.databus.test.DatabusBaseIntegTest;

public class TestOneSourceDbRelay extends DatabusBaseIntegTest
{

  @Override
  @BeforeTest
  public void setUp() throws Exception
  {
    // skip the super Setup. Just load the view root
	setTestName("TestOneSourceDbRelay");
    setupLogger();
    loadSystemProperties();
    LOG.info("Setup Complete: " + getTestName());
  }

  @Override
  @AfterTest
  public void tearDown() throws Exception
  {
    // skip the super Setup. Just load the view root
    LOG.info("Test Complete: " + getTestName());

  }

  @Test
  public void testDbRelayBizfollowSmallBuffer1()
    throws SecurityException, NoSuchMethodException, IOException, InterruptedException, TimeoutException
  {
    runCommandLineTest("db_relay_bizfollow_small_buffer_1.test");
  }

  @Test
  public void testDbRelayLiarSmallBuffer1()
    throws SecurityException, NoSuchMethodException, IOException, InterruptedException, TimeoutException
  {
    // liar schema with two sources
    runCommandLineTest("db_relay_liar_small_buffer_1.test");
  }

}

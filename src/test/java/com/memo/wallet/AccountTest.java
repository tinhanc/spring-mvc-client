package com.memo.wallet;

import co.omise.exception.OmiseAPIException;
import co.omise.exception.OmiseException;
import co.omise.model.Account;
import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		OmiseSetting.setKeys();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRetrieve() {
		try {

			Account account = Account.retrieve();

			System.out.println("  ------------------------------ account : "+account.toString());
			assertNotNull("Could not retrieve the resource", account.getObject());
			assertEquals("The retrieved resource is not an account", account.getObject(), "account");

			account.reload();
			assertEquals("The object retrieved from reload is invalid", account.getObject(), "account");
		} catch (IOException e) {
			fail(e.getMessage());
		} catch (OmiseAPIException e) {
			fail(e.getOmiseError().toString());
		} catch (OmiseException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testSameInstance() {
		try {
			Account accountA = Account.retrieve();
			Account accountB = Account.retrieve();

			assertTrue("Multiple instances were created", accountA == accountB);
		} catch (IOException e) {
			fail(e.getMessage());
		} catch (OmiseAPIException e) {
			fail(e.getOmiseError().toString());
		} catch (OmiseException e) {
			fail(e.getMessage());
		}
	}
}

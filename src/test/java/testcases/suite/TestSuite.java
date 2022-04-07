package testcases.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testcases.HomePage;
import testcases.ValidiateEmail;
import testcases.Validiatetext;


@RunWith(Suite.class)
 @Suite.SuiteClasses({HomePage.class, Validiatetext.class, ValidiateEmail.class})


public class TestSuite {


}

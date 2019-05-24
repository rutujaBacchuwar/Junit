package com.stackroute.unittest.testsuite;

import com.stackroute.unittest.asserts.EmployeeEmailAnnotationsTest;
import com.stackroute.unittest.asserts.EmployeeEmailTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeEmailTest.class,
        EmployeeEmailAnnotationsTest.class

})
public class EmployeeEmailTestSuite {
}

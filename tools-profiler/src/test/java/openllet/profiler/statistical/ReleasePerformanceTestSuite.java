package openllet.profiler.statistical;

import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Pedro Oliveira <pedro@clarkparsia.com>
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ ReleasePerformanceTest.class })
public class ReleasePerformanceTestSuite
{

	public static junit.framework.Test suite()
	{
		return new JUnit4TestAdapter(ReleasePerformanceTestSuite.class);
	}

	public static void main(final String args[])
	{
		junit.textui.TestRunner.run(suite());
	}

}

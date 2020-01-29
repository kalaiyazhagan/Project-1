package org.nama;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Console2  {

	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(Consool.class);
		int failureCount = rs.getFailureCount();
		System.out.println("fc:"+failureCount);
		int ignoreCount = rs.getIgnoreCount();
		System.out.println("ic:"+ignoreCount);
		int runCount = rs.getRunCount();
		System.out.println("rc:"+runCount);
		boolean succes = rs.wasSuccessful();
		System.out.println(succes);
		List<Failure> re = rs.getFailures();
		System.out.println("re:"+re);
		
	}

}

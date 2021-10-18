package com.qa.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Start " + result.getMethod());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Successful " + result.getMethod());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test is Failed " + result.getMethod());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skipped " + result.getMethod());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testing is Started  " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testing is Finished  " + context.getName());
	}

}

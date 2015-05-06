package edu.scut.se.lee.test;

import android.test.InstrumentationTestCase;

import edu.scut.se.lee.util.FFT;

/**
 * Created by Administrator on 2015/5/6.
 */
public class FFTTest extends InstrumentationTestCase {
    public void test() throws Exception{
        double[] x = {1,1,1,1,1,1,1,1,1,1};
        double[] y = {1,1,1,1,1,1,1,1,1,1};
        new FFT(10).fft(x,y);
    }
}

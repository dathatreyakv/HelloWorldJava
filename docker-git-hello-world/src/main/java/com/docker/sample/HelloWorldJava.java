package com.docker.sample;

/**
 * Hello world!
 *
 */
public class HelloWorldJava 
{
    public static void main( String[] args ) throws Exception
    {
        for (int i = 0; i < 1; i++) {
			System.out.println( "Hello World Ping!" + i );
			Thread.sleep(1000);
		}
    }
}

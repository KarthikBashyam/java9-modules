/**
 * 
 */
/**
 * @author Karthik
 *
 */
module com.helloworld.provider {
	exports com.helloworld.impl;
	requires com.helloworld;	
	uses com.helloworld.services.PrintService;
	provides com.helloworld.services.PrintService with com.helloworld.impl.FormattedPrintService,com.helloworld.impl.SimplePrintImpl;
}
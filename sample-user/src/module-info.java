module com.user {
	requires com.helloworld.provider;
	requires com.helloworld;	
	uses com.helloworld.services.PrintService;
}
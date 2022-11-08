package oops.java8Features.lambda;

class MessageServiceImpl implements MessageService{

	@Override
	public boolean sendMessage(String message, String to) {
		return false;
	}

	public static void main(String[] args) {
		MessageService messageService = new MessageServiceImpl();
		messageService.sendMessage("hello","to");

		MessageService messageService1 = new MessageService() {
			@Override
			public boolean sendMessage(String message, String to) {
				return false;
			}
		};
		messageService1.sendMessage("hello","to");


		//lambda
		MessageService lam = (message,to) -> true;
		lam.sendMessage("hello","to");
	}
}
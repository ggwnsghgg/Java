package alone_java_CH09_EX;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		
		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
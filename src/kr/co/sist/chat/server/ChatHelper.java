package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.DefaultListModel;

/**
 * 1. 서버에서 소켓을 전달받아
 * 2. 대화를 읽고, 쓰기 위한 스트림을 연결하고
 * 3. 대화를 무한루프로 읽어 들여
 * 4. 모든 접속자에게 출력하는 일 
 */
public class ChatHelper extends Thread {
	
	private Socket someClient;
	private int cnt;
	private DefaultListModel<String> dlmConnect;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private String connIp, nick;
	
	public ChatHelper(Socket someClient, int cnt, DefaultListModel<String> dlmConnect) throws IOException {
		this.someClient = someClient;
		this.cnt = cnt;
		this.dlmConnect = dlmConnect;
		connIp = someClient.getInetAddress().toString();	// 접속자 ip 저장 
		
		// 소켓에서 읽기 스트림 연결
		disReadStream = new DataInputStream(someClient.getInputStream());
		// 소켓에서 쓰기 스트림 연결
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		nick = disReadStream.readUTF();
		
		// 서버창에 접속자 현황을 보여준다.
		dlmConnect.addElement(nick + "님께서 " + cnt + "번째로 접속했습니다. [" + someClient.getInetAddress() + "]");
		// 모든 접속자에게도 접속자 현황을 보여준다.
		broadCast(nick + "님께서 " + cnt + "번째로 접속했습니다.");
	}	// ChatHelper

	/**
	 * 대화를 읽어 들여 모든 사람들에게 출력하는 일 
	 */
	@Override
	public void run() {
		String revMsg;
		try {
			while(true) {
			revMsg = disReadStream.readUTF();
			broadCast(revMsg);
			}	// end while
		} catch (IOException ie) {	// 메시지를 읽다가 못 읽는 상태 -> 접속자가 종료 
			// 서버 관리창에 설정 
			dlmConnect.addElement(nick + "님(" + cnt + "번째)께서 접속을 종료했습니다. [" + connIp + "]");
			try {
				if(someClient != null) {
					someClient.close();
				}	// end if
				// 나를 제외한
				MultiChatServer.listConnect.remove(this);
				// 모든 접속자에게 메시지를 전송
				broadCast(nick + "님께서 접속을 종료했습니다. [" + connIp + "]");
			} catch (IOException e) {	// catch 내에서 예외처리 능력이 없으므로 별도로 다시 처리 
				e.printStackTrace();
			}	// end catch
		}	// end catch
	}	// run
	
	/**
	 * 모든 접속자에게 메시지를 보내는 method
	 * @param msg
	 * @throws IOException 
	 */
	public void broadCast(String msg) throws IOException {
		for(ChatHelper ch : MultiChatServer.listConnect) {
			ch.dosWriteStream.writeUTF(msg);
			ch.dosWriteStream.flush();
		}	// end for
	}	// boradCast

}	// class
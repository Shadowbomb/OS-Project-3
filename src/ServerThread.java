//Operating Systems Project (osp) package
package osp;

import java.net.Socket;
import java.io.IOException;

public class ServerThread extends Thread {
    private Socket socket;
    
    ServerThread(Socket socket) {
        this.socket = socket;
    }
    
    public void run() {}
    
    public void stop() {
        this.socket.close();
    }
}
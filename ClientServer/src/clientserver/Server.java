/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Server extends Thread {

    private static final Logger LOG = Logger.getLogger(Server.class.getName());

    public static void main(String[] args) {
        new Server().start();
    }

    public Server() {
        try {
            ss = new ServerSocket(3333);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ServerSocket ss;

    @Override
    public void run() {
        try {
            LOG.info("waiting");
            Socket s = ss.accept();
         //   s.setSoTimeout(3000);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            for (;;) {
                String message = br.readLine();
                LOG.info(message);
                pw.println(message + "???????");
                pw.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

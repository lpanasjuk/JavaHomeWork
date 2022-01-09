package com.pb.panasjuk.hw14;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class echoServer {
    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            // Работаем с потоками ввода-вывода
            try (
                 PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {


                // Читаем сообщения от клиента до тех пор пока он не скажет "bye"
                String str;
                while ((str = br.readLine()) != null) {
                    // Печатаем сообщение
                    System.out.println("Сообщение: " + str);

                    // Сравниваем с "bye" и если это так - выходим из цикла
                    if (str.equals("bye")) {
                        // Тоже говорим клиенту "bye" и выходим из цикла
                        pw.println("bye");
                        break;
                    } else {
                        // Посылаем клиенту ответ
                        str = "Ответ сервера: " + LocalDateTime.now() + " " + str;
                        pw.println(str);
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception ex) {
                    // ignore
                }
            }
    }
}


    public static void main(String[] args) throws Exception {
        // Определяем номер порта, который будет "слушать" сервер
        int port = 1777;
        // Открыть серверный сокет (ServerSocket)
        // Это специальный класс для сетевого взаимодействия с серверной стороны
        ServerSocket servSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // В цикле ждем запроса клиента
        while (true) {
            Socket clientSocket = servSocket.accept();
            threadPool.submit(new Handler(clientSocket));
        }
    }
}

